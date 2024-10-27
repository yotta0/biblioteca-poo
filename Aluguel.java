import java.time.LocalDate;

public class Aluguel {
    private Livro livro;
    private Cliente cliente;
    private LocalDate dataAluguel;

    public Aluguel(Livro livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataAluguel = LocalDate.now();
        livro.emprestar();
    }

    public Livro getLivro() {
        return livro;
    }

    public void devolver() {
        livro.devolver();
    }

    @Override
    public String toString() {
        return "Aluguel: " + livro + " | Cliente: " + cliente.getNome() + " | Data: " + dataAluguel;
    }
}
