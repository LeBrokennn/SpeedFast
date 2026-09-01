public class PedidoEncomienda extends Pedido {
    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        repartidorAsignado = "Camila Soto";
        System.out.println("-> Validando peso y embalaje... OK");
        System.out.println("-> Pedido asignado automáticamente a " + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 17 + (int) (distanciaKm * 2);
    }
}
