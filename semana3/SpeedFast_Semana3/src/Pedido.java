public abstract class Pedido implements Despachable, Cancelable, Rastreable {
    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String repartidorAsignado;
    protected String estado;

    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.estado = "Reservado";
    }

    public abstract void asignarRepartidor();
    public abstract int calcularTiempoEntrega();

    // Sobrecarga: asignación manual de repartidor.
    public void asignarRepartidor(String nombre) {
        this.repartidorAsignado = nombre;
        System.out.println("-> Repartidor asignado manualmente: " + nombre);
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Repartidor asignado: " + (repartidorAsignado == null ? "Pendiente" : repartidorAsignado));
        System.out.println("Tiempo estimado: " + calcularTiempoEntrega() + " minutos");
    }

    @Override
    public void despachar() {
        estado = "Despachado";
        System.out.println("-> Pedido despachado correctamente.");
    }

    @Override
    public void cancelar() {
        estado = "Cancelado";
        System.out.println("-> Pedido #" + idPedido + " cancelado exitosamente.");
    }

    @Override
    public void verHistorial() {
        System.out.println("- " + getClass().getSimpleName() + " #" + idPedido + " - " + estado
                + (repartidorAsignado != null ? " por " + repartidorAsignado : ""));
    }
}
