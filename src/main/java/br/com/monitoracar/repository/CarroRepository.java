package br.com.monitoracar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.monitoracar.models.Carro;

public interface CarroRepository extends JpaRepository<Carro, String> {

}
