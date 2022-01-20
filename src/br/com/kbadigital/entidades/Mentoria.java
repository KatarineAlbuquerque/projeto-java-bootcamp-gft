package br.com.kbadigital.entidades;

import java.util.Date;

public class Mentoria extends Conteudo {

	private Date data;
	private Integer CargaHoraria;
	private Bootcamp bootcamp;
	private Dev dev;
		
	public Mentoria() {
		super();
	}
	
	public Mentoria(String titulo, String descricao, Date data, Integer cargaHoraria, Bootcamp bootcamp, Dev dev) {
		super(titulo, descricao);
		this.data = data;
		CargaHoraria = cargaHoraria;
		this.bootcamp = bootcamp;
		this.dev = dev;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		CargaHoraria = cargaHoraria;
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
		return "[" + titulo + ", " + data + ", " + CargaHoraria + "h\n" 
	+ bootcamp.getNome() + ", " + dev.getNome()+ "]\n";
	}
}
