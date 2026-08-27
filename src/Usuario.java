import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarEmprestado(Livro livro) {
        if (livro.emprestar()) {
            livrosEmprestados.add(livro);
            System.out.println(nome + " pegou: " + livro.getTitulo());
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
            System.out.println(nome + " devolveu: " + livro.getTitulo());
        }
    }
}
