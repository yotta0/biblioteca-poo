public class Cliente extends Pessoa {
    // Atributos adicionais, se necessário
    private String telefone;

    // Construtor
    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf); // Chama o construtor da classe base
        this.telefone = telefone;
    }

    // Getter e Setter para telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Outros métodos específicos do Cliente, se necessário
}
