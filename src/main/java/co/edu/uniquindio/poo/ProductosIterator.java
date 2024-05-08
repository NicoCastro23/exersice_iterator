package co.edu.uniquindio.poo;

public class ProductosIterator implements Iterator<Producto>{

    private final Producto[] productos;
    private int indice;

    public ProductosIterator(Producto[] productos){
        this.productos = productos;
        this.indice = 0;
    }


    @Override
    public boolean hasNext() {
        return indice < productos.length;
    }

    @Override
    public Producto next() {
        if (hasNext()) {
            return productos[indice++];
        }
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
