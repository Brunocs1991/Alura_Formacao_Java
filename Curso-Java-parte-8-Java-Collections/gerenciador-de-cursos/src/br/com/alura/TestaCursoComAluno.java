package br.com.alura;

import br.com.alura.classes.Aluno;
import br.com.alura.classes.Aula;
import br.com.alura.classes.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "instrutor Alura");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Guilherme Slveira", 5617);
		Aluno a3 = new Aluno("Mauricio", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}
}
