package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Perro extends Canino{
    private int fuerzaMordida;
    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos,
                 int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro de color " + getColor() + " esta comiendo y mordiendo la carne con una fuerza de " + getFuerzaMordida() + " psi";
    }

    @Override
    public String dormir() {
        return "El perro de color " + getColor() + " de altura " + getAltura() + " esta durmiendo.";
    }

    @Override
    public String correr() {
        return "El perro de color " + getColor() + " salio a correr al parque un rato";
    }

    @Override
    public String comunicarse() {
        return "El perro de color " + getColor() + " se esta comunicando con su dueño.";
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }
}
