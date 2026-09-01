import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> historial = new ArrayList<>();

        Pedido comida = new PedidoComida("001", "Av. Italia 456", 4.0);
        Pedido encomienda = new PedidoEncomienda("002", "Av. Independencia 123", 6.0);
        Pedido express = new PedidoExpress("003", "Av. Apoquindo 1500", 7.0);

        System.out.println("=== SPEEDFAST - SEMANA 3 ===\n");

        System.out.println("[Pedido Comida]");
        comida.asignarRepartidor();
        comida.mostrarResumen();
        comida.despachar();
        historial.add(comida);

        System.out.println("\n[Pedido Encomienda]");
        encomienda.asignarRepartidor("Daniela Tapia");
        encomienda.mostrarResumen();
        encomienda.despachar();
        historial.add(encomienda);

        System.out.println("\n[Pedido Express]");
        express.asignarRepartidor();
        express.mostrarResumen();
        express.cancelar();
        historial.add(express);

        System.out.println("\n=== HISTORIAL ===");
        for (Pedido pedido : historial) {
            pedido.verHistorial();
        }
    }
}
