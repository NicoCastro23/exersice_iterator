package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public IteratorProducto crearIteradorPorCategoria(String categoria) {
        return new IteradorPorCategoria(categoria);
    }

    
    private class IteradorPorCategoria implements IteratorProducto {
        private String categoria;
        private Iterator<Producto> iterador;

        public IteradorPorCategoria(String categoria) {
            this.categoria = categoria;
            this.iterador = productos.iterator();
        }

        @Override
        public boolean hasNext() {
            while (iterador.hasNext()) {
                Producto producto = iterador.next();
                if (producto.getCategoria().equals(categoria)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Producto next() {
            while (iterador.hasNext()) {
                Producto producto = iterador.next();
                if (producto.getCategoria().equals(categoria)) {
                    return producto;
                }
            }
            return null;
        }
    }
}

