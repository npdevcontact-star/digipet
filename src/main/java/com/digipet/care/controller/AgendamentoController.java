package com.digipet.care.controller;

import com.digipet.care.domain.Agendamento;
import com.digipet.care.service.AgendamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Agendamento>> listar() {
        // EM PRODUÇÃO: Você vai extrair o clinicaId do Token JWT via Spring Security
        // Ex: Long clinicaId = SecurityUtils.getClinicaIdUsuarioLogado();
        Long clinicaIdMock = 1L; // Simulando clínica logada

        List<Agendamento> agendamentos = service.listarAgendamentosDaClinica(clinicaIdMock);
        return ResponseEntity.ok(agendamentos);
    }

    @PostMapping
    public ResponseEntity<Agendamento> criar(@RequestBody Agendamento agendamento) {
        Long clinicaIdMock = 1L; // Simulando extração do JWT
        Agendamento novo = service.criarAgendamento(agendamento, clinicaIdMock);
        return ResponseEntity.ok(novo);
    }
}