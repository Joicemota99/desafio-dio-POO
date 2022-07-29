package br.com.dio.desafio.dominio;


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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
