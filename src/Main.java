import Domain.Bootcamp;
import Domain.Dev;
import Domain.conteudos.Curso;
import Domain.conteudos.Mentoria;

void main() {

    Curso curso1 = new Curso();
    curso1.setTitulo("Javinha da massa");
    curso1.setDescricao("Java dos bacanas");
    curso1.setCargaHr(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Javinha da massa parte 2");
    curso2.setDescricao("Java dos legais");
    curso2.setCargaHr(8);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de geral");
    mentoria1.setDescricao("Mentoria dos alegres");
    mentoria1.setData(LocalDate.now().minusMonths(5));


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp java");
    bootcamp.setDescricao("java description");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev dev = new Dev();
    dev.setNome("Pedro");
    dev.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("-");
    dev.progredir();
    System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("-");
    System.out.println("Conteudos Concluídos: " + dev.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + dev.calcularXP());
    dev.progredir();
    System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("-");
    System.out.println("Conteudos Concluídos: " + dev.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + dev.calcularXP());
    dev.progredir();
    System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("-");
    System.out.println("Conteudos Concluídos: " + dev.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + dev.calcularXP());


    System.out.println("===================================");

    Dev dev2 = new Dev();
    dev2.setNome("Camila");
    dev2.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
    System.out.println("-");
    dev2.progredir();
    System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
    System.out.println("-");
    System.out.println("Conteudos Concluídos: " + dev2.getConteudosConcluidos());
    System.out.println("-");
    System.out.println("XP: " + dev2.calcularXP());


}
