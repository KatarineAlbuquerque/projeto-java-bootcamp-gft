package br.com.kbadigital.entidades;

public class Atividade extends Conteudo {
	private Integer cargaHoraria;
	private String tipo;
	private Bootcamp bootcamp;
	private Dev dev;
	
	public Atividade() {
		super();
	}

	public Atividade(String titulo, String descricao, Integer cargaHoraria, String tipo, Bootcamp bootcamp, Dev dev) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
		this.tipo = tipo;
		this.bootcamp = bootcamp;
		this.dev = dev;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "["+ titulo + ", " + tipo + ", " +
				bootcamp.getNome() + ", " + dev.getNome() + "]\n";
	}
}
