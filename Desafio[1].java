/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        int n1,n2,n3,n4,nr1,nr2,nr3,nr4;
        n1 = n/10; 
        nr1 = n%10;
        n2 = n1/10;
        nr2 = n1%10;
        n3 = n2/10;
        nr3 = n2%10;
        n4 = n3/10;
        nr4 = n3%10;
       System.out.println(nr1 + "" + nr2 + "" +nr3 +"" + nr4);
    }
    
}
