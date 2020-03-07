import javax.swing.JOptionPane;
public class CharNumericos
{
  public static void main(String[] args)
  { //Variveis, onde n signifíca "número"
    char n1,n2,n3,n4;
    String unidos;
    //Guardando os valores
    n1=JOptionPane.showInputDialog("Digite um número de milhar:").charAt(0);
    n2=JOptionPane.showInputDialog("Digite um número de centena de milhar:").charAt(0);
    n3=JOptionPane.showInputDialog("Digite um número de dezena de milhar:").charAt(0);
    n4=JOptionPane.showInputDialog("Digite um número de unidade de milhar:").charAt(0);
    
    unidos = n1+""+n2+""+n3+""+n4;
    
    JOptionPane.showMessageDialog(null,"A união fica assim:"+unidos);
    
    
    
    
  }
}