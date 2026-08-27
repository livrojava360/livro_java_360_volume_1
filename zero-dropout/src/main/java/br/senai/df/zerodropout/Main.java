package br.senai.df.zerodropout;
// Importamos as classes das pastas que criamos!
import br.senai.df.zerodropout.model.Aluno;
import br.senai.df.zerodropout.model.Turma;
import br.senai.df.zerodropout.service.DiagnosticoService;

public class Main {
    public static void main(String[] args) {
        // 1. Criamos a Turma
        Turma turmaDev = new Turma("DEV-2026", "Desenvolvimento de Sistemas");
        // 2. Criamos e adicionamos os Alunos com suas notas diagnósticas
        Aluno aluno1 = new Aluno("A101", "Carlos Eduardo", 7.0);
        Aluno aluno2 = new Aluno("A102", "Ana Souza", 8.0);
        Aluno aluno3 = new Aluno("A103", "Beatriz Lima", 9.0);
        turmaDev.adicionarAluno(aluno1);
        turmaDev.adicionarAluno(aluno2);
        turmaDev.adicionarAluno(aluno3);
        // 3. Instanciamos o Serviço e emitimos o Relatório
        DiagnosticoService diagnosticoService = new DiagnosticoService();
        diagnosticoService.emitirRelatorio(turmaDev);
    }
}
