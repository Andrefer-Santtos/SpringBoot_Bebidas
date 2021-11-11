package br.com.springzada.bebidas.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bebidas")
public class Bebidas {

	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "valor")
	private Double valor;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
