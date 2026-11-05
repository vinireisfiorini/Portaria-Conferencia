import java.util.Scanner;

public class PortariaConferencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu vip (True/False)");
        boolean vip = scanner.nextBoolean();



        if(idade >= 18 || vip){
            System.out.println("Voce esta liberado");
        }
        else{
            System.out.println("Voce e menor de idade ");

        }

    }
}
