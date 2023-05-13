package EjerciciosTema7_8_9;

/*
9.- Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la
función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".*/

import java.io.*;

public class Numero_9 {

    public static void main(String[] args) {

        try{
            // En la primer ruta del parametro es donde tengo guardado mi archivo y en el segundo lo que hice fue copiarlo en la misma
            // ruto con otro nombre para que queden en la misma carpeta.
            lecturaCopia("C:\\Users\\piedr\\projects_Java\\Curso Java\\src\\EjerciciosTema7_8_9\\DatosPrueba","C:\\Users\\piedr\\projects_Java\\Curso Java\\src\\EjerciciosTema7_8_9\\DatosPruebaCopia.txt");
            System.out.println("Fichero copiado con exito!!!");
        }catch (Exception e){
            System.out.println(" ¡ERROR! - No se pudo copiar el Archivo: " + e.getMessage());
        }


    }

    public static void lecturaCopia(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();


            PrintStream out = new PrintStream(fileOut);
            out.write(datos);

        } catch (Exception e) {
            System.out.println("No encuentro el archivo" + e.getMessage());
        }
    }
}