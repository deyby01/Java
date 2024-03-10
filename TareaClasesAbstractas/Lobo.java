package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Lobo extends Canino{
    private int numeroCamada;
    private String especieLobo;
    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos,
                int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + getColor() + " de especie " + especieLobo + " salio a cazar con su camada de " + numeroCamada + " lobos para comer, " +
                "ahora comen y despedazan la carne gracias a el tamaño de sus dientes que es de " + getTamanioColmillos() +
                " cm de largo.";
    }

    @Override
    public String dormir() {
        return "El lobo " + getColor() + " esta durmiendo con toda su camada de " + numeroCamada + " lobos.";
    }

    @Override
    public String correr() {
        return "El lobo " + getColor() + " esta corriendo con toda su camada de " + numeroCamada + " lobos.";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + getColor() + " esta comunicandose con toda su camada de " + numeroCamada + " lobos.";
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }
}
