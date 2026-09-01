# SpeedFast - Semana 3

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos II**.

## Descripción

SpeedFast es un sistema de gestión de pedidos desarrollado en Java.  
Esta versión integra conceptos de programación orientada a objetos como herencia, polimorfismo, abstracción e interfaces.

El sistema permite gestionar tres tipos de pedidos:

- Pedido de comida
- Pedido de encomienda
- Pedido express

## Funcionalidades

- Asignación automática de repartidores.
- Asignación manual de repartidores.
- Cálculo del tiempo estimado de entrega.
- Despacho de pedidos.
- Cancelación de pedidos.
- Registro y visualización del historial de entregas.

## Programación Orientada a Objetos

### Abstracción

Se utiliza la clase abstracta `Pedido`, que contiene los atributos y comportamientos comunes de los pedidos.

Incluye:

- Método implementado `mostrarResumen()`.
- Método abstracto `calcularTiempoEntrega()`.

### Herencia

Las siguientes clases heredan de `Pedido`:

- `PedidoComida`
- `PedidoEncomienda`
- `PedidoExpress`

### Polimorfismo

Cada tipo de pedido sobrescribe métodos para adaptar su comportamiento.

También se utiliza sobrecarga mediante:

- `asignarRepartidor()`
- `asignarRepartidor(String nombre)`

### Interfaces

El proyecto implementa las interfaces solicitadas:

- `Despachable` → `despachar()`
- `Cancelable` → `cancelar()`
- `Rastreable` → `verHistorial()`

## Ejecución

La clase `Main` realiza una simulación de los diferentes tipos de pedidos, mostrando:

1. Asignación de repartidores.
2. Tiempo estimado de entrega.
3. Despacho.
4. Cancelación.
5. Historial de pedidos.

## Tecnologías

- Java
- IntelliJ IDEA
- Git
- GitHub

## Autora

Javiera Saavedra
