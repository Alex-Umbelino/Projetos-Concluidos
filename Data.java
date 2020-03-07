import javax.swing.JOptionPane;
public class Data
{
  public static void main(String[] args)
  {  //Variaveis: As palavras 1,2 e 3; resultado
     String dia,mes,ano;
     
     dia = JOptionPane.showInputDialog ("Digite o dia:");
     mes = JOptionPane.showInputDialog ("Digite o mês:");
     ano = JOptionPane.showInputDialog ("Digite o ano:");
     
     
     // Saída
     JOptionPane.showMessageDialog (null, dia+"/"+mes+"/"+ano);
       
     
  } 
}