package Tema1_Conceptos;

public class EjercicioBucle {

    public static void main(String[] args) {

        String[] nombres = {"deyby","daniel","carlos","juan"};
        StringBuilder sb = new StringBuilder();

        for (int i=0;i < nombres.length;i++){
            sb.append(nombres[i]);
        }

        String resultado = sb.toString();
        System.out.println(resultado);

    }
}
