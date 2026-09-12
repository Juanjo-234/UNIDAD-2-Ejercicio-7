 class Plato {
     String nombre;
     double precio;
     int tiempoEstimadoPreparacion;

    public Plato(String nombre, double precio, int tiempoEstimadoPreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoEstimadoPreparacion = tiempoEstimadoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoEstimadoPreparacion() {
        return tiempoEstimadoPreparacion;
    }
}
