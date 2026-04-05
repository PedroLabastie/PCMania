import cliente.Cliente;
import computador.*;
import util.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Computador[] promocoes = new Computador[3];

        HardwareBasico[] h1 = {
                new HardwareBasico("Processador Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)
        };
        HardwareBasico[] h2 = {
                new HardwareBasico("Processador Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000)
        };
        HardwareBasico[] h3 = {
                new HardwareBasico("Processador Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000)
        };

        promocoes[0] = new Computador("Apple", 2172, new SistemaOperacional("macOS Sequoia", 64), h1);
        promocoes[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        promocoes[1] = new Computador("Samsung", 3406, new SistemaOperacional("Windows 8", 64), h2);
        promocoes[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        promocoes[2] = new Computador("Dell", 7850, new SistemaOperacional("Windows 10", 64), h3);
        promocoes[2].addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        System.out.print("Olá! Qual é seu nome?: ");
        String nome = input.nextLine();
        System.out.println("Para maior segurança, insira seu CPF: ");
        String cpf = input.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        int codigoPc;
        do {
            System.out.println("Escolha uma promoção (1, 2 ou 3) ou 0 para finalizar: ");
            codigoPc = input.nextInt();
            if (codigoPc >= 1 && codigoPc <= 3) {
                cliente.addComputador(promocoes[codigoPc - 1]);
                System.out.println("Promoção do computador " + promocoes[codigoPc - 1].getMarca() + " adicionada ao carrinho!\n");
            }
        } while (codigoPc != 0);

        System.out.println("\nCliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf());
        ProcessarPedido.processarPedido(cliente.getComputadores());
    }
}