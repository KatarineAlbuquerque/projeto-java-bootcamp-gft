package br.com.kbadigital.entidades;

import java.util.Date;

public class Forum extends Conteudo {

	private Date data;
	private Bootcamp bootcamp;
	private Dev dev;
	
	public Forum() {
		super();
	}

	public Forum(String titulo, String descricao, Date data, Bootcamp bootcamp, Dev dev) {
		super(titulo, descricao);
		this.data = data;
		this.bootcamp = bootcamp;
		this.dev = dev;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Bootcamp getBootcamp() {
		return bootcamp;
	}

	public void setBootcamp(Bootcamp bootcamp) {
		this.bootcamp = bootcamp;
	}

	public Dev getDev() {
		return dev;
	}

	public void setDev(Dev dev) {
		this.dev = dev;
	}	
	
	@Override
	public String toString() {
		return "["+titulo + ", " + data + ", " 
	+ bootcamp.getNome() + ", " + dev.getNome() + "]";
	}
}
