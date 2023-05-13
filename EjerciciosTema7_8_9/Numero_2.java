package EjerciciosTema7_8_9;

//2.- Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

public class Numero_2 {

    public static void main(String[] args) {

        String[] arrayDato = {
                "dato1",
                "dato2",
                "dato3",
                "dato4"
        };

        for(String datos : arrayDato) {
            System.out.println("Los valores son: " + datos);
        }



    }

}
