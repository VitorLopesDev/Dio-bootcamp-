
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> conteudosInscritos = new LinkedHashSet<>();
    private Set<Curso> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getCursos());
    }

    public void progredir() {
        Optional<Curso> curso = conteudosInscritos.stream().findFirst();
        if (curso.isPresent()) {
            conteudosConcluidos.add(curso.get());
            conteudosInscritos.remove(curso.get());
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public int calcularTotalXp() {
        return conteudosConcluidos.size() * 10; // Exemplo de XP.
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + ''' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
