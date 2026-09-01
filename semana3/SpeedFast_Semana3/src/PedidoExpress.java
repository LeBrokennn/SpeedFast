public class PedidoExpress extends Pedido {
    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        repartidorAsignado = "Luis Díaz";
        System.out.println("-> Buscando repartidor más cercano... OK");
        System.out.println("-> Pedido asignado automáticamente a " + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 8 + (int) distanciaKm;
    }
}
