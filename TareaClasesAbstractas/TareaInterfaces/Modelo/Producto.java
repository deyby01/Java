package POO.com.dcamacho.herencia.Interfaces.TareaInterfaces.Modelo;

abstract public class Producto implements IProducto{
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}