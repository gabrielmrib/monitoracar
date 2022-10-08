package br.com.monitoracar.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_hitorico")
public class Historico {

	@Id
	@Column(name = "id_historico")
	private int		id_historico;
	
	@Column(name = "localizacao")
	private String	localizacao;
	
	@Column(name = "dataHora")
	private Date	dataHora;
	
	@Column(name = "sensor1")
	private boolean sensor1;
	
	@Column(name = "sensor2")
	private boolean sensor2;
	
	@Column(name = "sensor3")
	private boolean sensor3;
	
	@Column(name = "sensor4")
	private boolean sensor4;
	
	@Column(name = "sensor5")
	private boolean sensor5;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_carro_placa")
	private Carro carro;
	
	
	
	
	public Historico() {}

	public Historico(int id_historico, String localizacao, Date dataHora, boolean sensor1, boolean sensor2,
			boolean sensor3, boolean sensor4, boolean sensor5, Carro carro) {
		super();
		this.setId_historico(id_historico);
		this.setLocalizacao(localizacao);
		this.setDataHora(dataHora);
		this.setSensor1(sensor1);
		this.setSensor2(sensor2);
		this.setSensor3(sensor3);
		this.setSensor4(sensor4);
		this.setSensor5(sensor5);
		this.setCarro(carro);
	}
	
	public Historico(int id_historico, String localizacao, Date dataHora, boolean sensor1, boolean sensor2,
			boolean sensor3, boolean sensor4, boolean sensor5) {
		super();
		this.setId_historico(id_historico);
		this.setLocalizacao(localizacao);
		this.setDataHora(dataHora);
		this.setSensor1(sensor1);
		this.setSensor2(sensor2);
		this.setSensor3(sensor3);
		this.setSensor4(sensor4);
		this.setSensor5(sensor5);
	
	}

	public int getId_historico() {
		return id_historico;
	}

	public void setId_historico(int id_historico) {
		this.id_historico = id_historico;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public boolean isSensor1() {
		return sensor1;
	}

	public void setSensor1(boolean sensor1) {
		this.sensor1 = sensor1;
	}

	public boolean isSensor2() {
		return sensor2;
	}

	public void setSensor2(boolean sensor2) {
		this.sensor2 = sensor2;
	}

	public boolean isSensor3() {
		return sensor3;
	}

	public void setSensor3(boolean sensor3) {
		this.sensor3 = sensor3;
	}

	public boolean isSensor4() {
		return sensor4;
	}

	public void setSensor4(boolean sensor4) {
		this.sensor4 = sensor4;
	}

	public boolean isSensor5() {
		return sensor5;
	}

	public void setSensor5(boolean sensor5) {
		this.sensor5 = sensor5;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
	
}
