public class PedidoComida extends Pedido {
    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        repartidorAsignado = "Juan Pérez";
        System.out.println("-> Verificando mochila térmica... OK");
        System.out.println("-> Pedido asignado automáticamente a " + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int) (distanciaKm * 2);
    }
}
