0package desafiojava;
import javax.swing.JOptionPane;

public class DesafioJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite um número de 4 digitos");
        if(n1 != null){
        int n = Integer.parseInt(n1);
        
        n = (n%10 * 1000) + ((n/10)%10 * 100) + ((n/100)%10 * 10) + ((n/1000)%10);
        
        JOptionPane.showMessageDialog(null, n);
        
        } else System.exit(0);
    }
}