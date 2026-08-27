public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca da Faculdade");

        Livro livro1 = new Livro("O Hobbit", "J. R. R. Tolkien");
        Livro livro2 = new Livro("Java: Como Programar", "Deitel");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario aluno = new Usuario("Matheus");

        biblioteca.listarAcervo();
        aluno.pegarEmprestado(livro1);
        biblioteca.listarAcervo();
        aluno.devolverLivro(livro1);
        biblioteca.listarAcervo();
    }
}
