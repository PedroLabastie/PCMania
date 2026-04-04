package computador;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }


    public String getNome() {
        return nome;
    }

    public float getCapacidade() {      //dava pra ser int, mas no uml tava como float
        return capacidade;
    }
}
