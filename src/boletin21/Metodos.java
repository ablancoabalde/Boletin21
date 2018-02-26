package boletin21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Metodos {

    public void guardar(String frase) throws IOException {
        String[] separador = frase.split("\\s*, \\s*");
        TreeSet<String> lOrdenada = new TreeSet<>();

//        for(int i=0;i<separador.length;i++){
//            lOrdenada.add(separador[i]);
//        }

        /*Metodo del TreeSet que recoge la lista y la separa, como si fuera un for */
        lOrdenada.addAll(Arrays.asList(separador));
        Iterator<String> it = lOrdenada.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        String sFichero = "frases.txt";
        File fichero = new File(sFichero);
        BufferedWriter bw;
        FileWriter fw;

        if (fichero.exists()) {
            try {
                fw = new FileWriter(new File("frases.txt"), true);
                while (it.hasNext()) {
                    fw.write(it.next());
                }

                fw.close();
            } catch (IOException ex) {
                System.out.println("Error 4");
            }
        } else {
            bw = new BufferedWriter(new FileWriter(sFichero));
            while (it.hasNext()) {
                bw.write(it.next());
            }
            bw.close();
        }

    }
}
