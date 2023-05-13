package EjerciciosTema7_8_9;

// 6.- Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de
// cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Numero_6 {

    public static void main(String[] args) {

        // Creo el arrayList de tipo String.
        ArrayList<String> arrayList = new ArrayList<>();
        // Agregamos los datos.
        arrayList.add("ElementoUno");
        arrayList.add("ElementoDos");
        arrayList.add("ElementoTres");
        arrayList.add("ElementoCuatro");

        // enlazamos el arrayList a la linkedList.
        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        // Ahora recorro el arrayList.
        for (String elemento : arrayList){
            System.out.println("Estoy en el arrayList: " + elemento);
        }
        System.out.println();

        // aqui recorro el linkedList.
        for(String element : linkedList){
            System.out.println("Estoy en el linkedList: " + element);
        }

    }

}
