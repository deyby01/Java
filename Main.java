public class Main {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 17;
        int n3 = 9;
        var valor = suma(n1, n2, n3);
        System.out.println(valor);
        Coche miCoche = new Coche();
        var total = miCoche.IncrementoPuertas(2);
        System.out.println(total);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

//Crear una clase coche.
//
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//
//Una función que incremente el número de puertas que tiene el coche.
//
//Crear un objeto miCoche en el main y añadirle una puerta.
//
//Mostrar el número de puertas que tiene el objeto.

class Coche{
    public int puertas = 4;

    public int IncrementoPuertas(int a){
        return puertas + a;
    }
}