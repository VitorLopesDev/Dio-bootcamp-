
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira");
        mentoria1.setDescricao("Como progredir na carreira de dev");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do básico ao avançado");
        bootcamp.getCursos().add(curso1);
        bootcamp.getMentorias().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev1.conteudosInscritos);
        dev1.progredir();
        System.out.println("Conteúdos Concluídos João: " + dev1.conteudosConcluidos);
        System.out.println("XP Total: " + dev1.calcularTotalXp());
    }
}
