package br.com.monitoracar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.monitoracar.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String>{

}
