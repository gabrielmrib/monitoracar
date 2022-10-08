package br.com.monitoracar.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
	
	@Id
	@Column(name = "cpf")
	private String	cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datanascimento")
	private Date	dataNascimento;
	
	@Column(name = "cep")
	private String	cep;
	
	@Column(name = "numcasa")
	private int 	numCasa;
	
	@Column(name = "telefone")
	private String	telefone;
	
	@Column(name = "telefoneEmergencial1")
	private String	telefoneEmergencial1;
	
	@Column(name = "telefoneEmergencial2")
	private String	telefoneEmergencial2;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "placa")
	private List<Carro> carros;
	
	
	
	public Pessoa() {}
	
	public Pessoa(String cpf, Date dataNascimento, String cep, int numCasa, String telefone,
			String telefoneEmergencial1, String telefoneEmergencial2, List<Carro> carros) {
		super();
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setCep(cep);
		this.setNumCasa(numCasa);
		this.setTelefone(telefone);
		this.setTelefoneEmergencial1(telefoneEmergencial1);
		this.setTelefoneEmergencial2(telefoneEmergencial2);
		this.setCarros(carros);
	}

	
	
	public Pessoa(String cpf, Date dataNascimento, String cep, int numCasa, String telefone,
			String telefoneEmergencial1, String telefoneEmergencial2) {
		super();
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setCep(cep);
		this.setNumCasa(numCasa);
		this.setTelefone(telefone);
		this.setTelefoneEmergencial1(telefoneEmergencial1);
		this.setTelefoneEmergencial2(telefoneEmergencial2);
		
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneEmergencial1() {
		return telefoneEmergencial1;
	}

	public void setTelefoneEmergencial1(String telefoneEmergencial1) {
		this.telefoneEmergencial1 = telefoneEmergencial1;
	}

	public String getTelefoneEmergencial2() {
		return telefoneEmergencial2;
	}

	public void setTelefoneEmergencial2(String telefoneEmergencial2) {
		this.telefoneEmergencial2 = telefoneEmergencial2;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	
	
}
