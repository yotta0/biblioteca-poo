import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); // Crie uma instância da sua classe Biblioteca

        while (true) {
            System.out.println("Bem-vindo à Biblioteca!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Alugar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar Livros");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    // Adicionar Livro
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    // Chame o método para adicionar o livro na biblioteca
                    biblioteca.adicionarLivro(new Livro(titulo, autor)); // Supondo que você tenha um método adicionarLivro
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    // Alugar Livro
                    System.out.print("Digite o título do livro que deseja alugar: ");
                    String livroAluguel = scanner.nextLine();
                    // Chame o método para alugar o livro
                    biblioteca.alugarLivro(livroAluguel); // Supondo que você tenha um método alugarLivro
                    break;

                case 3:
                    // Devolver Livro
                    System.out.print("Digite o título do livro que deseja devolver: ");
                    String livroDevolucao = scanner.nextLine();
                    // Chame o método para devolver o livro
                    biblioteca.devolverLivro(livroDevolucao); // Supondo que você tenha um método devolverLivro
                    break;

                case 4:
                    // Listar Livros
                    biblioteca.listarLivros(); // Supondo que você tenha um método listarLivros
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo da biblioteca. Até logo!");
                    scanner.close();
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
