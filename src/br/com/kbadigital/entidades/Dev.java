package br.com.kbadigital.entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

	private String nome;
	private Bootcamp bootcamp;
	
	private Set<Atividade> atividades = new HashSet<>();
	private Set<Mentoria> mentorias = new HashSet<>();
	
	public Dev() {
		super();
	}
	
	public Dev(String nome, Bootcamp bootcamp) {
		super();
		this.nome = nome;
		this.bootcamp = bootcamp;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bootcamp getBootcamp() {
		return bootcamp;
	}

	public void setBootcamp(Bootcamp bootcamp) {
		this.bootcamp = bootcamp;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public Set<Mentoria> getMentorias() {
		return mentorias;
	}

	public void adicionarMentorias(Mentoria mentoria) {
		this.mentorias.add(mentoria);
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome);
	}

	public void inscreverBootcamp() {
		this.bootcamp.adicionaDevs(this);
	}
	
	public void progredir(Atividade atividade) {
		this.atividades.add(atividade);
	}
		
	public void exibirAtividade() {
		for(Atividade atividade: atividades) {
			System.out.println(atividade.getTitulo() + " " +atividade.getTipo() 
			+ " " + atividade.getCargaHoraria() + "h");			
		}
	}
	
	public void exibirMentorias() {
		for(Mentoria mentoria: mentorias) {
			System.out.println(mentoria.getTitulo());		
		}
	}

	@Override
	public String toString() {
		return "[" + nome + ", " + bootcamp + "]\n";
	}
	
	
}
