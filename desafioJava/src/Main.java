import desafioProjeto.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso da DIO Java");
        curso1.setCargaHoraria(5);
        curso1.setDescricao("Curso basico Java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso da DIO html");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Curso basico html");

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria da Camila");
        mentoria1.setCargaHoraria(2);
        mentoria1.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Java development for beginners");
        bootcamp1.getConteudosBootcamp().add(curso1);
        bootcamp1.getConteudosBootcamp().add(curso2);
        bootcamp1.getConteudosBootcamp().add(mentoria1);

        Devs devNathalia = new Devs();
        devNathalia.setNome("Nathalia");

        devNathalia.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devNathalia.getConteudosInscritos());
        devNathalia.progredir();

        System.out.println("-------");
        System.out.println("Conteúdos concluidos: " + devNathalia.getConteudosConcluidos());
        System.out.println("XP:" + devNathalia.calcularTotalXP());

        Devs devLucas = new Devs();
        devLucas.setNome("Lucas");
        System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devLucas.getConteudosConcluidos());


    }
}
