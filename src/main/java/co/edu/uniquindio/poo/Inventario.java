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

    public List<Producto> getProductos(){
        return productos;
    }

    public IteratorProducto crearIteradorPorCategoria(String categoria) {
        return new IteradorPorCategoria(categoria);
    }

    
    private class IteradorPorCategoria implements IteratorProducto {
        private String categoria;
        private List<Producto> productosFiltrados;
        private int indice;
    
        public IteradorPorCategoria(String categoria) {
            this.categoria = categoria;
            this.productosFiltrados = new ArrayList<>();
            for (Producto producto : productos) {
                if (producto.getCategoria().equals(categoria)) {
                    productosFiltrados.add(producto);
                }
            }
            this.indice = 0;
        }
    
        @Override
        public boolean hasNext() {
            return indice < productosFiltrados.size();
        }
    
        @Override
        public Producto next() {
            if (hasNext()) {
                Producto producto = productosFiltrados.get(indice);
                indice++;
                return producto;
            }
            return null;
        }
    }
}