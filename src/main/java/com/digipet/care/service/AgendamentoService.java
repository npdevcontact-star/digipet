package com.digipet.care.service;

import com.digipet.care.domain.Agendamento;
import com.digipet.care.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    // Método seguro que lista agendamentos isolados por Clínica
    public List<Agendamento> listarAgendamentosDaClinica(Long clinicaIdUsuarioLogado) {
        return repository.findAllByClinicaId(clinicaIdUsuarioLogado);
    }

    @Transactional
    public Agendamento criarAgendamento(Agendamento agendamento, Long clinicaIdUsuarioLogado) {
        // Regra de Ouro Multi-Tenancy: Forçar o ID da clínica do token JWT no objeto
        agendamento.setClinicaId(clinicaIdUsuarioLogado);

        // Exemplo de regra de negócio: Verificar conflito de horário (pseudo-código)
        // validarConflitoHorario(agendamento);

        return repository.save(agendamento);
    }
}