import java.util.Scanner;

public class CalculaIdade{
             //Criando um método
              public static void main(String[] args) { 
             //Criando varáveis 
             String nome;
             int AnoNasc,AnoAtual,Resposta;

            //Utilizar o objeto Scanner
            Scanner teclado = new Scanner(System.in);
            //Mostrar as mensagens na tela
            
            System.out.println("Digite o seu nome: ");
            // Vicnulando o conteúdo digitado a variável nome
            nome = teclado.nextLine();
            
            System.out.println("Digite o seu ano de nascimento");
            // Vinculando o conteúdo digitando a variável AnoNasc
            AnoNasc = teclado.nextInt();
            
            System.out.println("Digite o ano atual");
         // Vinculando o conteúdo digitando a variável AnoAtual
            AnoAtual = teclado.nextInt();
            
         //Dica para saber se a variável está recebendo valor
            System.out.println(nome+" "+AnoNasc+" "+AnoAtual);
            
            //Calcular
            Resposta = AnoAtual-AnoNasc;
            
            //Moostrando o resultado final
            System.out.println(nome+ " a sua idade é "+ Resposta);
            
              }
                               
}