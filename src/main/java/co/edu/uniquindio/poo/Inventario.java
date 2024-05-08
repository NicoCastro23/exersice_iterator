package co.edu.uniquindio.poo;

import java.util.NoSuchElementException;

public class Inventario implements IterableCollection<Producto>{
    private Producto[] productos;

    public Inventario(Producto[] productos){
        this.productos = productos;
    }

    @Override
    public Iterator<Producto> iterator(String categoria) {      
        return new ProductosIterator(categoria);
    }
    
    private class ProductosIterator implements Iterator<Producto>{
        private int indice;
        private String categoria;

        public ProductosIterator(String categoria){
            this.indice = 0;
            this.categoria = categoria;
        }

        @Override
        public boolean hasNext() {
            // Itera desde el índice actual hasta encontrar un producto que coincida con la categoría
            while (indice < productos.length) {
                if (productos[indice].getCategoria().equals(categoria)) {
                    return true;
                }
                indice++;
            }
            return false;
        }

        @Override
        public Producto next() {
            if (hasNext()) {
                // Devuelve el producto actual y avanza al siguiente que coincida con la categoría
                Producto producto = productos[indice];
                indice++;
                return producto;
            }
            throw new NoSuchElementException("No hay más elementos en la lista.");
        }
    }
}