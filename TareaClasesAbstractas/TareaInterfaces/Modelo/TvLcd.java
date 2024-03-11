package POO.com.dcamacho.herencia.Interfaces.TareaInterfaces.Modelo;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public double getPrecioVenta() {
        return getPrecio() * 0.11;
    }

    public int getPulgada() {
        return pulgada;
    }
}
