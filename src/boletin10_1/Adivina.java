package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Adivina {
    private int jugador1,jugador2,intentos,z;
    public Adivina(){
        
    }
    public void adivinar(){
      String numero1=JOptionPane.showInputDialog("Jugador 1:Escribe el número");
      jugador1=Integer.parseInt(numero1);
      String maxintentos=JOptionPane.showInputDialog("Número máximo de intentos");
      intentos=Integer.parseInt(maxintentos);
      String j2=JOptionPane.showInputDialog("Introduce el número");
      jugador2=Integer.parseInt(j2);
      for(z=0;z==intentos;z++){
          if(jugador1<jugador2){
             
              JOptionPane.showMessageDialog(null,"Tú número es mas grande");
          }
          else if(jugador1>jugador2){
              JOptionPane.showMessageDialog(null,"Tu número es mas pequeño");
          }
          else{
              JOptionPane.showMessageDialog(null,"Acertaste");
          }
            
      }
        
    }
    
}
