package EjerciciosTema7_8_9;

//1.- Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

public class Numero_1 {

    public static void main(String[] args) {

        String texto = "hola mundo";
        String inversa = "";

        for(int i = texto.length() - 1; i >= 0; i--){
            inversa += texto.charAt(i);
        }
        System.out.println("El texto original es: " + texto);
        System.out.println("El texto inverso es: " + inversa);

    }

}
