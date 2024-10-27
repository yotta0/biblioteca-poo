public class Funcionario extends Pessoa {
    // Atributos adicionais, se necessário
    private String cargo;

    // Construtor
    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf); // Chama o construtor da classe base
        this.cargo = cargo;
    }

    // Getter e Setter para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Outros métodos específicos do Funcionario, se necessário
}
