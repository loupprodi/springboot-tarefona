package br.uniso.tarefona.model.repository;

import br.uniso.tarefona.model.entity.Dados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DadosRepository extends JpaRepository<Dados, Integer>, JpaSpecificationExecutor<Dados> {

    Dados findDadosById(int id);
}