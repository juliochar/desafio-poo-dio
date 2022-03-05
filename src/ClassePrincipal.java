import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class ClassePrincipal {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);


        //como conteudo nao tem setCargaHoraria, ele nao permite acessar o método
        //teria q converter para Curso para acessar o metodo q só tem em Curso.

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("titulo conteudo");
        conteudo.setDescricao("Descricao Conteudo");



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        //criar o bootcamp, adicionar os cursos, mentorias e adicionar o dev no bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp de Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJonas.getConteudosInscritos());
        devJonas.progredir();
        devJonas.progredir();
        System.out.println("Conteúdos concluídos: " + devJonas.getConteudosConcluidos());
        System.out.println("XP: " + devJonas.calcularXp());

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXp());



    }
}
