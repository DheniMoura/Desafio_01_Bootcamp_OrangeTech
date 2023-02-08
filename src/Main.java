import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("cruso java");
        c1.setDescricao("descrição do curso de java");
        c1.setCargaHoraria(6);

        Curso c2 = new Curso();
        c2.setTitulo("cruso js");
        c2.setDescricao("descrição do curso de js");
        c2.setCargaHoraria(4);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("mentoria de java");
        m1.setDescricao("descrição de mentoria de java");
        m1.setData(LocalDate.now());

        Bootcamp b1 = new Bootcamp();
        b1.setNome("bootcamp java developer");
        b1.setDescricao("descrição do bootcamp java developer");
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);
        b1.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("joão");
        d1.inscreverBootcamp(b1);
        System.out.println("XP: " + d1.calcularTotalXp());
        d1.progredir();
        System.out.println(d1.getNome());
        System.out.println("Conteúdos Inscritos: " + d1.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos: " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXp());

        System.out.println("");
        Dev d2 = new Dev();
        d2.setNome("romário");
        d2.inscreverBootcamp(b1);
        System.out.println("XP: " + d2.calcularTotalXp());
        d2.progredir();
        d2.progredir();
        System.out.println(d2.getNome());
        System.out.println("Conteúdos Inscritos: " + d2.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos: " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularTotalXp());

//        System.out.println();
    }
}