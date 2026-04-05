package util;

import computador.Computador;

public class ProcessarPedido {

    public static void processarPedido(Computador[] computadores) {
        System.out.println("Pedido enviado...\n");
        float total = 0;
        for (Computador c : computadores) {
            c.mostraPCConfigs();
            total += c.getPreco();
        }
        System.out.println("Total: R$" + String.format("%.2f", total));
        System.out.println("A PC Mania agradece a sua confiança!");
    }
}
