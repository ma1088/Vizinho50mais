package com.v50.model;

import java.io.Serializable;

public class Servico implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String desc;
	
	public Servico(int id, String nome, String desc) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
	}
	public int getId() {
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
