public class Main {
    public static void main(String[] args) {
        Pedido comida = new PedidoComida(1, "Av. Providencia 100");
        Pedido encomienda = new PedidoEncomienda(2, "Av. Apoquindo 200");
        Pedido express = new PedidoExpress(3, "Av. Vitacura 300");

        comida.asignarRepartidor();
        comida.asignarRepartidor("Juan Pérez");
        System.out.println();

        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Camila Soto");
        System.out.println();

        express.asignarRepartidor();
        express.asignarRepartidor("Luis Díaz");
    }
}
