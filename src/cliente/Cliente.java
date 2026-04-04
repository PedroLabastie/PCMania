package cliente;

public class Cliente {
    private final String nome;
    private final String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float calculaTotalCompra() {
        return 0.0f;
    }
}
