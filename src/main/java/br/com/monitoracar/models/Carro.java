package br.com.monitoracar.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carro")
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "placa")
	private Date	ano; 
	
	@Column(name = "placa")
	private String	marca;
	
	@Column(name = "placa")
	private String	modelo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_pessoa_cpf")
	private Pessoa	pessoas;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "carro")
	private List<Historico> 	historico;
	
	
	
	
	
	
	
	public Carro() {}
	public Carro(String placa, Date ano, String marca, String modelo, Pessoa pessoas, List<Historico> historico) {
		super();
		this.setPlaca(placa);
		this.setAno(ano);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPessoas(pessoas);
		this.setHistorico(historico);
	}
	
	
	public Carro(String placa, Date ano, String marca, String modelo, Pessoa pessoas) {
		super();
		this.setPlaca(placa);
		this.setAno(ano);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPessoas(pessoas);
	
	}
	
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Pessoa getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa pessoas) {
		this.pessoas = pessoas;
	}

	public List<Historico> getHistorico() {
		return historico;
	}

	public void setHistorico(List<Historico> historico) {
		this.historico = historico;
	}
	
	
}
