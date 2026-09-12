public class Mozo {
    String nombre;

    public Mozo(String nombre) {
        this.nombre = nombre;
    }

    void enviarPedidoAcocina(Pedido pedido, Cocina cocina){
        System.out.println("Mozo " + nombre + " enviando pedido desde la mesa " + pedido.getNumeroMesa());
cocina.recibirComanda(pedido);
    }
}
