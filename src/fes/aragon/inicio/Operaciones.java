package fes.aragon.inicio;

import javax.swing.JOptionPane;
//Comit
public class Operaciones {
    
    public void comprobarRedondeo(String numS){
        /*
        comprueba si es par o impar con redondeo cuando se pasa un dato de tipo flotante
        public: Modificador de acceso
        void: valor de retorno (no regresa ningun valor)
        comprobarRedondeo: Nombre del metodo
        */
        try{   
                //Bloque de código que se intentará ejecutar
                float num = Float.parseFloat(numS);
                int comp = Math.round(num%2);
                switch(comp){
                    case 0:
                        JOptionPane.showMessageDialog(null, "Es un numero par");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Es un numero impar");
                        break;    
                }
            }catch(Exception e){
                //Bloque de código para manejar errores
                JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado");
            }
    }
    
    public void comprobar(String numS){
        /*
        comprueba si es par o impar sin redondeo cuando se pasa un dato de tipo flotante
        public: Modificador de acceso
        void: valor de retorno (no regresa ningun valor)
        comprobar: Nombre del metodo
        */
        try{   
                //Bloque de código que se intentará ejecutar
                
                int num = Integer.parseInt(numS);
                int comp = num%2;
                switch(comp){
                    case 0:
                        JOptionPane.showMessageDialog(null, "Es un numero par");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Es un numero impar");
                        break;    
                }
            }catch(Exception e){
                //Bloque de código para manejar errores
                JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado");
            }
    }
    
}