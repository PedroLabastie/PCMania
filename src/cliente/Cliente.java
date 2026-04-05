package cliente;

import computador.Computador;

public class Cliente {
    private final String nome;
    private final String cpf;
    private Computador[] computadores;
    private int qtd;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[999];
        this.qtd = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void addComputador(Computador c) {
        computadores[qtd] = c;
        qtd++;
    }

    public Computador[] getComputadores() {
        Computador[] comprados = new Computador[qtd];
        for (int i = 0; i < qtd; i++) comprados[i] = computadores[i];
        return comprados;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtd; i++) total += computadores[i].getPreco();
        return total;
    }
}
