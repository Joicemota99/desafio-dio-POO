package br.com.dio.desafio.dominio;


import com.sun.source.util.SourcePositions;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao dos cursos java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso ();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descricao dos cursos java");
        curso2.setCargaHoraria(0);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalxp());


        System.out.println("----------------------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalxp());


    }
}
