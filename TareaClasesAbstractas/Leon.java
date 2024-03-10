package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Leon extends Felino{
    private int numeroManada;
    private float potenciaRugido;
    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad,
                int numeroManada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El Leon esta con su manada de " + numeroManada + " comiendo es su habitat " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El leon y su grupo de " + numeroManada + " estan durmiendo.";
    }

    @Override
    public String correr() {
        return "El leon y su manada de " + numeroManada + " estan corriendo a una velocidad de " + getVelocidad() + "km/h.";
    }

    @Override
    public String comunicarse() {
        return "El leon Alfa se esta comunicando con su manada de " + numeroManada + " leones.";
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }
}
