package EjerciciosTema7_8_9;

/*
7.- Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo
y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos
pasos, siempre y cuando cumplas el primer "for" de relleno. */

import java.util.ArrayList;

public class Numero_7 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i <= 10 ; i++) {
            numeros.add(i);
        }

        System.out.println("ArrayList original: ");
        System.out.println(numeros);

        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
                i--;
            }
        }

        System.out.println("ArrayList final: ");
        for(int numero : numeros){
            System.out.print(numero + " ");
        }

    }
}