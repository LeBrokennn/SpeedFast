# SpeedFast

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos II – Semana 2**.

## Descripción

SpeedFast es un sistema de gestión de pedidos desarrollado en **Java**, que permite representar distintos tipos de servicios de reparto y calcular sus tiempos estimados de entrega.

En esta segunda etapa se aplican conceptos de **Programación Orientada a Objetos**, principalmente:

- Abstracción.
- Herencia.
- Polimorfismo.
- Sobrescritura de métodos.
- Clases y métodos abstractos.

## Tipos de pedidos

El sistema contempla tres tipos de pedidos:

- **PedidoComida:** tiempo base de 15 minutos + 2 minutos por kilómetro.
- **PedidoEncomienda:** tiempo base de 20 minutos + 1,5 minutos por kilómetro.
- **PedidoExpress:** tiempo base de 10 minutos y agrega 5 minutos si la distancia supera los 5 km.

## Clases principales

- `Pedido` - Clase abstracta base.
- `PedidoComida`
- `PedidoEncomienda`
- `PedidoExpress`
- `Main`

## Funcionalidades

La clase abstracta `Pedido` contiene los datos comunes:

- ID del pedido.
- Dirección de entrega.
- Distancia en kilómetros.

Cada tipo de pedido implementa su propia versión del método `calcularTiempoEntrega()`.

El programa también utiliza `mostrarResumen()` para presentar los datos principales de cada pedido.

## Ejecución

El proyecto fue desarrollado y probado utilizando **IntelliJ IDEA** y **Java**.

Ejemplo de resultados:

- PedidoComida: 23 minutos.
- PedidoEncomienda: 29 minutos.
- PedidoExpress: 15 minutos.

## Autor

**Javiera Saavedra**
