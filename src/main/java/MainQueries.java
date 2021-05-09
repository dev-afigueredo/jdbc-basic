import Entity.Aluno;
import dao.AlunoDao;

import java.util.List;

public class MainQueries {

    public static void main(String[] args) {

        AlunoDao alunoDAO = new AlunoDao();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        System.out.println("Exibindo todos os alunos...");
        alunos.forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(3);

        System.out.println();
        System.out.println("Exibindo o aluno com id 3");
        System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

        System.out.println();
        System.out.println("Inserindo novo Aluno");
        alunoDAO.create(alunoParaInsercao);
        alunos = alunoDAO.list();
        alunos.forEach(System.out::println);


        // =========================== 3 - Delete ===================================================
        System.out.println();
        System.out.println("Deletando um aluno com id 2");
        alunoDAO.delete(2);
        alunos = alunoDAO.list();
        alunos.forEach(System.out::println);


        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(4);
        alunoParaAtualizar.setNome("Axel");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        System.out.println();
        System.out.println("Atualizando o aluno com id 4");
        alunoDAO.update(alunoParaAtualizar);
        alunos = alunoDAO.list();
        alunos.forEach(System.out::println);
    }

}
