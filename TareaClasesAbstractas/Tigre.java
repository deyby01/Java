package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Tigre extends Felino{
    private String especieTigre;
    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad,
                 String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + " esta comiendo su presa cerca de su habitat " + habitat;
    }

    @Override
    public String dormir() {
        return "El tigre " + especieTigre + " esta durmiendo luego de comer";
    }

    @Override
    public String correr() {
        return "El tigre " + especieTigre + " salio corriendo tras su presa a una velocidad de " + getVelocidad() + "km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " se esta comunicando con otro tigre para formar un grupo";
    }

    public String getEspecieTigre() {
        return especieTigre;
    }
}
