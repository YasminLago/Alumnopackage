package alumnopaquetes;

import datos_academicos.Alumno;
import datos_persoais.DatosPersoais;
import javax.swing.JOptionPane;
import pedir_datos.Metodos;

public class AlumnoPaquetes {

   
    public static void main(String[] args) {
         String nom,tele,correo,resposta;
        float teorica,practica,boletins ;
      do{
        nom = Metodos.datoString("nome :");
        tele = Metodos.datoString("telefono :");
        correo = Metodos.datoString("correo electronico :");
        teorica = Metodos.datoFloat("teoria :");
        practica =Metodos.datoFloat("practica :");
        boletins = Metodos.datoFloat("boletins :");
        DatosPersoais per = new DatosPersoais(nom,correo,tele);
        Alumno alum = new Alumno (teorica,practica,boletins,per);
        JOptionPane.showMessageDialog(null, alum);
        resposta= JOptionPane.showInputDialog(" outro alumno :");
        
    }while(resposta.equalsIgnoreCase("si")); 
    }
    
}
