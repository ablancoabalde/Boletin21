/*
*  lea unha lista de palabras dende o teclado.
* Ordene alfabéticamente estas palabras.
* Escriba o resultado nun ficheiro de texto de xeito que, cada palabra estea nunha liña e éstas esten numeradas 
*/
package boletin21;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Boletin21 {


    public static void main(String[] args) throws IOException {
        Metodos met = new Metodos();
       String frase=JOptionPane.showInputDialog(null, "Introduzca frase");
       met.guardar(frase);
    }

}
