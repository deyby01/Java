package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Gueopardo extends Felino{
    public Gueopardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Gueopardo salio a cazar para comer en su habitat " + getHabitat() ;
    }

    @Override
    public String dormir() {
        return "El Gueopardo esta durmiendo luego de comer, y duerme en un arbol que soporta su tamaño de " + getAltura() +
                "mts. de altura y peso de " + getPeso() + " Kg.";
    }

    @Override
    public String correr() {
        return "El Gueopardo salio a correr con una velocidad de " + getVelocidad() + " Km/h gracias a sus garras de "
                + getTamanioGarras() + " de largo.";
    }

    @Override
    public String comunicarse() {
        return "El Gueopardo se esta comunicando con otros felinos en " + getHabitat();
    }
}
