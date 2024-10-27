public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // O livro começa disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false; // Marcar como não disponível
        } else {
            System.out.println("O livro já está alugado.");
        }
    }

    public void devolver() {
        disponivel = true; // Marcar como disponível
    }

    @Override
    public String toString() {
        return titulo + " de " + autor;
    }
}
