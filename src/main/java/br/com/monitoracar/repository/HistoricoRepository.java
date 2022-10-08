package br.com.monitoracar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.monitoracar.models.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Integer> {

}
