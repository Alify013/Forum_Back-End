package com.br.alify.forum.repository;

import com.br.alify.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findAllByAutorId(Long autor_id);

    Topico findByTitulo(String titulo);

}
