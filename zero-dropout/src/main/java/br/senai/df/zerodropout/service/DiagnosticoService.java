package br.senai.df.zerodropout.service;

import br.senai.df.zerodropout.model.Aluno;
import br.senai.df.zerodropout.model.Turma;

public class DiagnosticoService {

    // 1. Calcula a média das notas da turma
    public double calcularMediaTurma(Turma turma) {
        if (turma.getAlunos().isEmpty()) {
            return 0.0;
        }

        double somaNotas = 0.0;
        for (Aluno aluno : turma.getAlunos()) {
            somaNotas += aluno.getNotaDiagnostica();
        }
        return somaNotas / turma.getAlunos().size();
    }

    // 2. Classifica o risco de evasão com base na média
    public String avaliarNivelRisco(double media) {
        if (media < 5.0) {
            return "ALTO RISCO DE EVASÃO";
        } else if (media <= 6.9) {
            return "MÉDIO RISCO (ATENÇÃO)";
        } else {
            return "BAIXO RISCO (ADEQUADO)";
        }
    }

    // 3. Define a orientação pedagógica
    public String gerarOrientacaoPedagogica(double media) {
        if (media < 5.0) {
            return "Ação Imediata: Agendar nivelamento intensivo em Lógica e fazer atendimento individualizado.";
        } else if (media <= 6.9) {
            return "Ação Recomendada: Aplicar exercícios práticos complementares e monitorar frequência semanal.";
        } else {
            return "Ação Recomendada: Manter o cronograma normal e aplicar desafios avançados.";
        }
    }

    // 4. Exibe o relatório formatado no console
    public void emitirRelatorio(Turma turma) {
        double media = calcularMediaTurma(turma);
        String risco = avaliarNivelRisco(media);
        String orientacao = gerarOrientacaoPedagogica(media);

        System.out.println("\n==================================================");
        System.out.println("       RELATÓRIO DE AVALIAÇÃO DIAGNÓSTICA         ");
        System.out.println("                   SENAI - DF                     ");
        System.out.println("==================================================");
        System.out.println("Curso: " + turma.getNomeCurso() + " | Turma: " + turma.getCodigoTurma());
        System.out.println("Total de Alunos Avaliados: " + turma.getAlunos().size());
        System.out.printf("Média Geral da Turma: %.2f\n", media);
        System.out.println("Status de Risco: " + risco);
        System.out.println("--------------------------------------------------");
        System.out.println("Orientações ao Instrutor:");
        System.out.println(orientacao);
        System.out.println("==================================================\n");
    }
}


