import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso introdução a Java");
        curso.setDescricao("Introdução a linguagem Java");
        curso.setCargaHoraria(24);

        //System.out.println(curso);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Estrutura de Dados");
        curso1.setDescricao("Entendendo como funciona Estrutura de Dados");
        curso1.setCargaHoraria(8);

        //System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para iniciantes em Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para desenvolvimento na linguagem Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devKalebe = new Dev();
        devKalebe.setNome("Kalebe");
        devKalebe.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos: " + devKalebe.getNome() + " - "+devKalebe.getConteudosInscritos());
        devKalebe.progredir();
        devKalebe.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos: " + devKalebe.getNome() + " - "+devKalebe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devKalebe.getNome() + " - " + devKalebe.getConteudosConcluidos());
        System.out.println("XP:" + devKalebe.calcularTotalXp());

        System.out.println("--------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCamila.getNome() + " - " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos: " + devCamila.getNome() + " - " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getNome() + " - " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }
}
