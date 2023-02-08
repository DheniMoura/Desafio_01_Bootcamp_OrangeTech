import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso("Java", "Curso online", 15);
        Mentoria m1 = new Mentoria("JS", "Mentoria em JavaScript", (LocalDate.now()));

        System.out.println(c1.toString());
        System.out.println(m1.toString());

    }
}