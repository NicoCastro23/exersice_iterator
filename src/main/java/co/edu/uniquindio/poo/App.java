package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear inventario y agregar productos
        Producto producto1 = new Producto("Camiseta", "Ropa", 19.99);
        Producto producto2 = new Producto("Pantalón", "Ropa", 29.99);
        Producto producto3 = new Producto("Zapatos", "Calzado", 39.99);
        Producto producto4 = new Producto("Mochila", "Accesorios", 49.99);
        Producto producto5 = new Producto("Mochila", "Accesorios", 49.99);
        Producto[] productos = {producto1, producto2, producto3, producto4, producto5};
        Inventario inventario = new Inventario(productos);
        //Se crea el iterador de "Ropa"

        Iterator<Producto> iterator = inventario.iterator("Ropa");

        // Mostrar productos de la categoría "Ropa"
        System.out.println("Productos de la categoría 'Ropa':");
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }

        //Se crea el iterador de "Calzado"
        Iterator<Producto> iterator2 = inventario.iterator("Calzado");

        // Mostrar productos de la categoría "Ropa"
        System.out.println("Productos de la categoría 'Calzado':");
        while (iterator2.hasNext()) {
            Producto producto = iterator2.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
        
    }
}
