package boletin21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Metodos {

    public void guardar(String frase) throws IOException {
        String[] separador=frase.split("\\s*, \\s*");
        TreeSet<String> lOrdenada=new TreeSet<>();

//        for(int i=0;i<separador.length;i++){
//            lOrdenada.add(separador[i]);
//        }

        /*Metodo del TreeSet que recoge la lista y la separa, como si fuera un for */
        lOrdenada.addAll(Arrays.asList(separador));
        Iterator<String> it=lOrdenada.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        String sFichero="frases.txt";
        File fichero;
        PrintWriter fw;
        String a;
        int i=0;
        try {

            fichero=new File(sFichero);
            // escribir=new PrintWriter(fich)
            fw=new PrintWriter(new FileWriter(fichero));// Abrir fichero y añadir sin sobreescribir
            // escribir=new PrintWriter(new File("frases.txt"));// otra opción
            while (it.hasNext()) {
                a= it.next();
               fw.println(i+" "+a);
               i+=1;
            }
            fw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error de escritura");
        } catch (IOException ex1) {
            System.out.println("Error 4");
        }

    }
}
