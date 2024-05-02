package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear inventario y agregar productos
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("Camiseta", "Ropa", 19.99));
        inventario.agregarProducto(new Producto("Pantalón", "Ropa", 29.99));
        inventario.agregarProducto(new Producto("Zapatos", "Calzado", 39.99));
        inventario.agregarProducto(new Producto("Mochila", "Accesorios", 49.99));

        // Crear iterador para productos de la categoría "Ropa"
        IteratorProducto iteradorRopa = inventario.crearIteradorPorCategoria("Calzado");

        // Mostrar productos de la categoría "Ropa"
        System.out.println("Productos de la categoría 'Ropa':");
        while (iteradorRopa.hasNext()) {
            Producto producto = iteradorRopa.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
    }
}
