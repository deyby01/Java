package POO.com.dcamacho.herencia.Interfaces.TareaInterfaces;

import POO.com.dcamacho.herencia.Interfaces.TareaInterfaces.Modelo.*;

public class Principal {
    public static void main(String[] args) {

        IProducto[] products = new IProducto[4];

        products[0] = new Iphone(450000,"Apple","Iphone 12","Gris-Grafito");
        products[1] = new TvLcd(240000,"LG",55);
        products[2] = new Libro(45000,"Robert Kiyosaky","Rich Dad Rich Poor", "NewYork Times");
        products[3] = new Comics(17000,"Stan Lee", "Spider-Man", "Marvel", "Peter Parker");

        for(IProducto pd : products){
            System.out.println("Tipo de: " + pd.getClass().getSimpleName());
            System.out.println("Precio: " + pd.getPrecio());
            System.out.println("Precio final: " + pd.getPrecioVenta());

            if(pd instanceof IElectronico){
                System.out.println("Fabricante: " + ((IElectronico) pd).getFabricante());

                if(pd instanceof Iphone){
                    System.out.println("Modelo: " + ((Iphone) pd).getModelo());
                    System.out.println("Color: " + ((Iphone) pd).getColor());
                }

                if(pd instanceof TvLcd){
                    System.out.println("Pulgadas: " + ((TvLcd) pd).getPulgada());
                }
            }

            if(pd instanceof ILibro){
                System.out.println("Titulo: " + ((ILibro) pd).getTitulo());
                System.out.println("Autor: " + ((ILibro) pd).getAutor());

                if(pd instanceof Comics){
                    System.out.println("Personaje: " + ((Comics) pd).getPersonaje());
                }
            }
            System.out.println();
        }
    }
}
