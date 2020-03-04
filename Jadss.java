/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadss;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Jadss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Numero1=
               JOptionPane.showInputDialog("digite o primeiro numero");
       String Numero2 =
               JOptionPane.showInputDialog("digite o segundo numero");
       int n1 = Integer.parseInt (Numero1);
       int n2 = Integer.parseInt (Numero2);
       String Operacao = 
               JOptionPane.showInputDialog("Digite a operacao 1-Soma, 2-Subtraçao, 3-Multiplicaçao, 4- Divisao");
       int ope = Integer.parseInt(Operacao);
          
       if (ope == 1){    
           int sum = n1 + n2;
           JOptionPane.showMessageDialog(null , "a soma é " + sum, "koe", JOptionPane.PLAIN_MESSAGE );
       }
       
       if (ope == 2){
           int sub = n1 - n2;
           JOptionPane.showMessageDialog(null , "a subtraçao é " + sub, "koe", JOptionPane.PLAIN_MESSAGE );
       }
       
       if (ope == 3){
           int mul = n1 * n2;
           JOptionPane.showMessageDialog(null , "a multiplicaçao é " + mul, "koe", JOptionPane.PLAIN_MESSAGE );
       }
       if (ope == 4){
           int div = n1 / n2;
           JOptionPane.showMessageDialog(null , "a divisao é " + div, "koe", JOptionPane.PLAIN_MESSAGE );
       }
        
    }
    
}
