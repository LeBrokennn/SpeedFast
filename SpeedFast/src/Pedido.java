public class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() { return idPedido; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public String getTipoPedido() { return tipoPedido; }

    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }
    public void setDireccionEntrega(String direccionEntrega) { this.direccionEntrega = direccionEntrega; }
    public void setTipoPedido(String tipoPedido) { this.tipoPedido = tipoPedido; }

    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de forma genérica...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
