package POO.com.dcamacho.herencia.TareaClasesAbstractas;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getTamanioColmillos() {
        return tamanioColmillos;
    }
}
