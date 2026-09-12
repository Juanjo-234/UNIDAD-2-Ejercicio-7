import java.util.ArrayList;
import java.util.List;

class Pedido {
     int numeroMesa;
     List<String> platos;

     public Pedido(int numeroMesa){
         this.numeroMesa = numeroMesa;
         this.platos = new ArrayList<>();
     }

void agregarPlato(String plato){

         this.platos.add(plato);
}

public int getNumeroMesa() {

         return numeroMesa;
     }

   public List<String> getPlatos() {

         return platos;
     }

 }