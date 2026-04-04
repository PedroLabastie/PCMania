package computador;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwares;
    private MemoriaUSB musb;

    public void mostraPCConfigs() {
        System.out.println("Informações do dispositivo:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + "(" + sistemaOperacional.getTipo() + " bits)");
        System.out.println("Processador: " + hardwares[0].getNome() + "(" + hardwares[0].getCapacidade() + " Mhz)");
        System.out.println("Memória interna: " + hardwares[1].getNome() + " de " + hardwares[1].getCapacidade() + " GB");
        System.out.println("Armazenamento interno: " + hardwares[2].getNome() + " de " + hardwares[2].getCapacidade() + " GB");
        if(musb != null) {
            System.out.println("* Acompanha " + musb.getNome() + " de " + musb.getCapacidade() + " GB");
        }
        System.out.println("\nPreço: R$" + this.preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico[] hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwares = hardwares;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }
}
