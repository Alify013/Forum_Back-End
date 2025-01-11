package com.br.alify.forum.repository;

import com.br.alify.forum.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
    List<Resposta> findByTopicoId(Long topico_id);

    List<Resposta> findAllByAutorId(Long autor_id);
}
