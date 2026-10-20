Este programa está diseñado para modelar y gestionar el flujo de pedidos en un restaurante, coordinando la comunicación entre el personal de sala (**Mozo**), las comandas (**Pedido** y **Plato**) y el área de preparación (**Cocina**) utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Plato`:** Modela una opción del menú conteniendo sus atributos principales: el nombre del plato (`nombre`), el precio unitario (`precio`) y el tiempo estimado de preparación en minutos (`tiempoEstimadoMinutos`).
* **Crea la clase `Pedido`:** Modela la comanda de una mesa agrupando una lista de platos seleccionados (`List<Plato>`) y el número de mesa correspondiente (`numeroMesa`), incorporando métodos para agregar elementos y calcular totales.
* **Diseña la clase `Cocina`:** Implementa el área de preparación que almacena una cola o lista de pedidos pendientes (`List<Pedido>` o `Queue<Pedido>`) y expone el método `recibirComanda(Pedido pedido)` para registrar y encolar las solicitudes entrantes.
* **Implementa la clase `Mozo`:** Modela al personal de sala, dotándolo de un método específico (`enviarPedidoACocina(Pedido pedido, Cocina cocina)`) que gestiona la comunicación directa entre la mesa y el centro de preparación.
* **Ejecuta la prueba (`main`):** Instancia una cocina, un mozo, crea un pedido con varios platos variados, dispara el mensaje de envío a través del mozo y muestra el estado actual de la cocina y su cola de pedidos por consola.
