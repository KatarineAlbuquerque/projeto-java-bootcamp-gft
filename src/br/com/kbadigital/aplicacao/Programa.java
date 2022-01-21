package br.com.kbadigital.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.kbadigital.entidades.Atividade;
import br.com.kbadigital.entidades.Bootcamp;
import br.com.kbadigital.entidades.Dev;
import br.com.kbadigital.entidades.Forum;
import br.com.kbadigital.entidades.Mentoria;

/**
 * @author Katarine Albuquerque
 * @version 1.0 Programa com dados estáticos, sem leitura de dados através do
 *          Scanner.
 */

public class Programa {

	public static void main(String[] args) throws ParseException {
		// Formata a data
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

		// Recebe a Data
		String dataI = "01/01/2022";
		String dataF = "30/01/2022";

		// Converte de String para Data
		Date dataInicio = formatar.parse(dataI);
		Date dataFinal = formatar.parse(dataF);

		// Bootcamp
		Bootcamp bootcamp = new Bootcamp("GFT Start #3 Java", "Não perca essa chance e inscreva-se já!", dataInicio,
				dataFinal);

		// Devs
		Dev dev1 = new Dev("André de Souza", bootcamp);
		Dev dev2 = new Dev("Maria da Silva", bootcamp);
		Dev dev3 = new Dev("Alan Neves", bootcamp);
		Dev dev4 = new Dev("Léia Alves", bootcamp);

		// Devs inscritos:
		dev1.inscreverBootcamp();
		dev2.inscreverBootcamp();
		dev3.inscreverBootcamp();
		dev4.inscreverBootcamp();
		
		// Exibir inscritos
		System.out.println("------------------------------------------");
		System.out.println("-> Inscritos no Bootcamp:\n");
		bootcamp.exibirIncritosNoBootcamp();
		System.out.println();

		// Atividades
		Atividade atividade1 = new Atividade("Boas-vindas ao Bootcamp", "Conheça alguns colaboradores", 1, "Básico",
				bootcamp, dev1);
		Atividade atividade11 = new Atividade("Lógica de Programação", "Programar a função de um programa", 4, "Básico",
				bootcamp, dev1);
		Atividade atividade111 = new Atividade("Introdução o Git e Github",
				"Nesse curso irá aprender a compartilhar seus projetos", 5, "Básico", bootcamp, dev1);
		Atividade atividade2 = new Atividade("Lógica de Programação", "Programar a função de um programa", 4, "Básico",
				bootcamp, dev2);
		Atividade atividade22 = new Atividade("Introdução o Git e Github",
				"Nesse curso irá aprender a compartilhar seus projetos", 5, "Básico", bootcamp, dev2);
		Atividade atividade3 = new Atividade("Estrutura de Dados",
				"Aprenda o que são estruturas de dados e sua importância", 2, "Intermediário", bootcamp, dev3);
		Atividade atividade4 = new Atividade("Introdução o Git e Github",
				"Nesse curso irá aprender a compartilhar seus projetos", 5, "Básico", bootcamp, dev4);

		atividade1.subtotalXP();
		atividade1.subtotalXP();
		atividade11.subtotalXP();
		atividade111.subtotalXP();
		atividade2.subtotalXP();
		atividade2.subtotalXP();
		atividade22.subtotalXP();
		atividade3.subtotalXP();
		atividade4.subtotalXP();
		
		// Mentoria
		Mentoria mentoria1 = new Mentoria("Aula Inaugural", "Chegou a hora de começar!", new Date(), 2, bootcamp, dev3);
		Mentoria mentoria2 = new Mentoria("Como resolver desafios de código", "Esclarecimento de dúvidas", new Date(),
				2, bootcamp, dev4);
		
		mentoria1.subtotalXP();
		mentoria2.subtotalXP();

		// Fórum
		Forum forum = new Forum("Problemas ao compilar", "Dúvidas de IDES", new Date(), bootcamp, dev2);
		forum.subtotalXP();
		
		// Atividades dos Devs no Bootcamp
		System.out.println("------------------------------------------");
		System.out.println("-> Atividades dos Devs no Bootcamp:\n");
		bootcamp.adicionaAtividades(atividade1);
		bootcamp.adicionaAtividades(atividade11);
		bootcamp.adicionaAtividades(atividade111);
		bootcamp.adicionaAtividades(atividade2);
		bootcamp.adicionaAtividades(atividade22);
		bootcamp.adicionaAtividades(atividade3);
		bootcamp.adicionaAtividades(atividade4);

		List<Bootcamp> bootcamps = new ArrayList<Bootcamp>();
		bootcamps.add(bootcamp);

		for (Bootcamp b : bootcamps) {
			System.out.println(b.getAtividades() + "\n");
		}

		// Mentorias dos Devs no Bootcamp
		System.out.println("------------------------------------------");
		System.out.println("-> Mentorias dos Devs no Bootcamp:\n");

		bootcamp.adicionaMentorias(mentoria1);
		bootcamp.adicionaMentorias(mentoria2);

		for (Bootcamp b : bootcamps) {
			System.out.println(b.getMentorias() + "\n");
		}

		// Devs e Atividades que fazem do Bootcamp
		System.out.println("------------------------------------------");
		System.out.println("-> Devs e suas Atividades do Bootcamp\n");

		bootcamp.adicionaDevs(dev1);
		bootcamp.adicionaDevs(dev2);
		bootcamp.adicionaDevs(dev3);
		bootcamp.adicionaDevs(dev4);

		for (Bootcamp b : bootcamps) {
			System.out.println(b.getDevs() + "\n");
		}

		// Fóruns do Bootcamp
		System.out.println("------------------------------------------");
		System.out.println("-> Fóruns do Bootcamp:\n");

		bootcamp.adicionaForuns(forum);

		for (Bootcamp b : bootcamps) {
			System.out.println(b.getForuns() + "\n");
		}

		// Atividades dos Devs
		System.out.println("------------------------------------------");
		System.out.println("-> Atividades por Devs:\n");
		dev1.progredir(atividade1);
		dev1.progredir(atividade11);
		dev1.progredir(atividade111);
		dev2.progredir(atividade2);
		dev2.progredir(atividade22);
		dev3.progredir(atividade3);
		dev4.progredir(atividade4);
		System.out.println(dev1.getNome());
		dev1.exibirAtividade();
		dev1.totalXP();
		System.out.println();
		System.out.println(dev2.getNome());
		dev2.exibirAtividade();
		dev2.totalXP();
		System.out.println();
		System.out.println(dev3.getNome());
		dev3.exibirAtividade();
		dev3.totalXP();
		System.out.println();
		System.out.println(dev4.getNome());
		dev4.exibirAtividade();
		dev4.totalXP();
		System.out.println();
		
		// Mentorias dos Devs
		System.out.println("------------------------------------------");
		System.out.println("-> Mentorias dos Devs:\n");
		dev3.adicionarMentorias(mentoria1);
		dev4.adicionarMentorias(mentoria2);
		System.out.println(dev3.getNome());
		dev3.exibirMentorias();
		System.out.println();
		System.out.println(dev4.getNome());
		dev4.exibirMentorias();
		System.out.println("------------------------------------------");
		
	} // Fim main
} // Fim programa
