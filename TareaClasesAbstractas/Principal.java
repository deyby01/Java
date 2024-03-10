package POO.com.dcamacho.herencia.TareaClasesAbstractas;

public class Principal {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[3];
        Mamifero leon = new Leon("Sur Africa", 5.00f, 6.00f, 30.00f, "Lyon", 2.00f, 30, 10,20.0f);
        Mamifero gueopardo = new Gueopardo("Africa", 4.5f, 5.3f, 25.6f, "GPR", 1.0f, 35);
        Mamifero tigre = new Tigre("Africa", 3.5f, 4.5f,70.0f,"TGR",0.3f,70, "De Vengala");

        mamiferos[0] = leon;
        mamiferos[1] = gueopardo;
        mamiferos[2] = tigre;

        for(Mamifero animal : mamiferos){
            System.out.println("======= " + animal.getClass().getSimpleName() + " ======");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if(animal instanceof Canino){
                System.out.println("Colmillos: " + ((Canino) animal).getTamanioColmillos());
                System.out.println("Color: " + ((Canino) animal).getColor());

                if(animal instanceof Lobo){
                    System.out.println("Especie Lobo: " + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Cantidad Integrantes: " + ((Lobo) animal).getNumeroCamada());
                }
                if(animal instanceof Perro){
                    System.out.println("Fuerza de mordida en kg: " + ((Perro) animal).getFuerzaMordida());
                }
            }

            if(animal instanceof Felino){
                System.out.println("Tamaño Garras: " + ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());

                if(animal instanceof Leon){
                    System.out.println("Potencia Rugido: " + ((Leon) animal).getPotenciaRugido());
                    System.out.println("Numero integrantes: " + ((Leon) animal).getNumeroManada());
                }

                if(animal instanceof Tigre){
                    System.out.println("Especie Tigre: " + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());

        }

    }
}
