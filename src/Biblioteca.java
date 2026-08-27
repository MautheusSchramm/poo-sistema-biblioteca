import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void listarAcervo() {
        System.out.println("\nAcervo da " + nome + ":");
        for (Livro livro : acervo) {
            livro.exibirDados();
        }
    }
}
