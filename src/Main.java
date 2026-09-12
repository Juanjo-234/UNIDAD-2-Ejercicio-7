//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Cocina cocina = new Cocina();
Mozo mozo = new Mozo(" Pepe ");

Pedido pedidoMesa2 = new Pedido(2);

pedidoMesa2.agregarPlato("Papas Fritas");
pedidoMesa2.agregarPlato("Empanadas de jamos y queso");
pedidoMesa2.agregarPlato("Ravioles");

mozo.enviarPedidoAcocina(pedidoMesa2, cocina);

cocina.estadoCocina();
}
