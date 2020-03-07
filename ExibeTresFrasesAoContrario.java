import javax.swing.JOptionPane;
public class ExibeTresFrasesAoContrario
{
  public static void main(String[] args)
  {  //Variaveis: As palavras 1,2 e 3; resultado
     String palavra1 ;
     String palavra2 ;
     String palavra3 ;
     
     palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
     palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
     palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
     //Processamento
     String resultado = palavra3 +" " +palavra2 +" "+palavra1;
     // Saída
     JOptionPane.showMessageDialog (null,resultado);
     System.out.println(resultado);
     
     
     
  } 
}
