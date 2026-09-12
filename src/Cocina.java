import java.util.LinkedList;
import java.util.Queue;

public class Cocina {
    private Queue<Pedido> colaPendientes;

    public Cocina() {

        this.colaPendientes = new LinkedList<>();
    }

    void recibirComanda(Pedido pedido) {
        colaPendientes.offer(pedido);
        System.out.println("Pedido registrado para la mesa : " + pedido.getNumeroMesa());
    }


    void estadoCocina() {
        System.out.println("=====Estado de la cocina=====");
        System.out.println("Pedidos pendientes : ");
        int contador = 1;
        for (Pedido p : colaPendientes) {
            System.out.println("  " + contador + ". Mesa: " + p.getNumeroMesa());
            System.out.println("Lisa de platos: " + p.getPlatos());
            System.out.println("---------------------------\n");
        }
    }
}