package br.com.kbadigital.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private Date dataInicio;
	private Date dataFim;
	
	private Set<Atividade> atividades = new HashSet<>();
	private Set<Mentoria> mentorias = new HashSet<>();
	private Set<Dev> devs = new HashSet<>();
	private Set<Forum> foruns = new HashSet<>();
			
	public Bootcamp() {
		super();
	}

	public Bootcamp(String nome, String descricao, Date dataInicio, Date dataFim) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public Set<Mentoria> getMentorias() {
		return mentorias;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public Set<Forum> getForuns() {
		return foruns;
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
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(nome, other.nome);
	}

	public void adicionaAtividades(Atividade atividade) {
		this.atividades.add(atividade);
	}
	
	public void adicionaMentorias(Mentoria mentoria) {
		this.mentorias.add(mentoria);
	}

	public void adicionaDevs(Dev dev) {
		this.devs.add(dev);
	}

	public void adicionaForuns(Forum forum) {
		this.foruns.add(forum);
	}
	
	public void exibirIncritosNoBootcamp() {
		for(Dev dev : devs) {
			System.out.println(dev.getNome());
		}
	}
	
	@Override
	public String toString() {
		return "[" + nome + ", " + dataInicio + ", " + dataFim + "]";
	}
}
