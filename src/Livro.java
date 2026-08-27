public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean emprestar() {
        if (!disponivel) {
            return false;
        }

        disponivel = false;
        return true;
    }

    public void devolver() {
        disponivel = true;
    }

    public void exibirDados() {
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.printf("%s - %s [%s]%n", titulo, autor, status);
    }
}
