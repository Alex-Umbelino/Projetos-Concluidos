import javax.swing.JOptionPane;
public class ExemploSubString
{
 public static void main(String[] arg)
  { String nome;
    nome = javax.swing.JOptionPane.showInputDialog("Digite um nome");
    String exemplo1 = nome.substring(3);
    String exemplo2 = nome.substring(2);
    
    JOptionPane.showMessageDialog(null, exemplo1);
     JOptionPane.showMessageDialog(null, exemplo2);
    
  }
}