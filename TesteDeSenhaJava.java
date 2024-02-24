import java.util.Scanner;

public class TesteDeSenhaJava {
  public static void main(String[] args) {

    String senha;
    String confirmacao;

    System.out.println("Crie uma senha:");     
    Scanner entrada = new Scanner(System.in);
    senha = entrada.nextLine();

    System.out.println("Confirme sua senha:");
    Scanner entrada2 = new Scanner(System.in);
    confirmacao = entrada2.nextLine(); 

    do{
      if(senha.equals(confirmacao)){
        System.out.println("Senha criada com sucesso!");
        break;
      }else{
        System.out.println("Senha não confere, tente novamente:");
        Scanner entrada3 = new Scanner(System.in);
        confirmacao = entrada3.nextLine();
      }
    } while(senha != confirmacao);
    
  }
}