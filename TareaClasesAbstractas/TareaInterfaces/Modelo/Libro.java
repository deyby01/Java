package POO.com.dcamacho.herencia.Interfaces.TareaInterfaces.Modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;

    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.7;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }
}
