import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livrosDisponiveis;
    private List<Aluguel> alugueisAtivos;

    public Biblioteca() {
        this.livrosDisponiveis = new ArrayList<>();
        this.alugueisAtivos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void alugarLivro(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                // Aqui você pode solicitar o cliente antes de alugar
                // Por simplicidade, vamos criar um cliente padrão
                Cliente cliente = new Cliente("Cliente Padrão", "000.000.000-00", "0000-0000");
                Aluguel aluguel = new Aluguel(livro, cliente);
                alugueisAtivos.add(aluguel);
                System.out.println("Livro alugado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não disponível ou não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Aluguel aluguel : alugueisAtivos) {
            if (aluguel.getLivro().getTitulo().equalsIgnoreCase(titulo)) {
                aluguel.devolver();
                alugueisAtivos.remove(aluguel);
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado entre os alugueis ativos.");
    }

    public void listarLivros() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
            return;
        }
        System.out.println("Livros disponíveis:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println("- " + livro.getTitulo() + (livro.isDisponivel() ? " (Disponível)" : " (Indisponível)"));
        }
    }
}
