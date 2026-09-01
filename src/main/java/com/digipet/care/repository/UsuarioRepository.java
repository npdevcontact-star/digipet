package com.digipet.care.repository;

import com.digipet.care.domain.Usuario;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<@NonNull Usuario, Long> {
    default Optional<Usuario> findByEmail(String email) {
        return null;
    }

    List<Usuario> findAllByClinicaId(Long clinicaId);
}