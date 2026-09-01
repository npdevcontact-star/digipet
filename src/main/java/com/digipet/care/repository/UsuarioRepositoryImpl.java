package com.digipet.care.repository;

import com.digipet.care.domain.Usuario;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UsuarioRepositoryImpl implements UsuarioRepository {
    private Long aLong;

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Usuario> findAllByClinicaId(Long clinicaId) {
        return List.of();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends @NonNull Usuario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends @NonNull Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<@NonNull Usuario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public @NonNull Usuario getOne(Long aLong) {
        return null;
    }

    @Override
    public @NonNull Usuario getById(Long aLong) {
        this.aLong = aLong;
        return null;
    }

    @Override
    public @NonNull Usuario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends @NonNull Usuario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends @NonNull Usuario> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends @NonNull Usuario> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends @NonNull Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends @NonNull Usuario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends @NonNull Usuario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends @NonNull Usuario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends @NonNull Usuario> S save(S entity) {
        return null;
    }

    @Override
    public <S extends @NonNull Usuario> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<@NonNull Usuario> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<@NonNull Usuario> findAll() {
        return List.of();
    }

    @Override
    public List<@NonNull Usuario> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(@NonNull Usuario entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends @NonNull Usuario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<@NonNull Usuario> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<@NonNull Usuario> findAll(Pageable pageable) {
        return null;
    }
}
