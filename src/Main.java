import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("curso javascript");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Lucas");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + dev1.getConteudosConcluidos());

        dev1.progredir();
        System.out.println("Conteúdos Inscritos Lucas: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos Inscritos Lucas: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularTotalXp());

        System.out.println("-------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + dev2.getConteudosConcluidos());

        dev2.progredir();
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP = " + dev2.calcularTotalXp());

    }
}
