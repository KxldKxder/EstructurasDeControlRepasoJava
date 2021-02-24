package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String[] args) {
        //Pedimos el valor
        String numS = JOptionPane.showInputDialog(null,"Dame un entero");
        //Creamos un objeto de la clase Operaciones
        Operaciones op = new Operaciones();  
        //pasamos el argumento a los metodos de nuestro objeto
        //op.comprobar(numS);
        op.comprobarRedondeo(numS);
    }
}
