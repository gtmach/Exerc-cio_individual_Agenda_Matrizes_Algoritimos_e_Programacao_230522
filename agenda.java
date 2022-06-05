import java.util.Scanner;

public class agenda {
    public static void main(String[] args) {
        String[][] agenda = new String[10][5];
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;

            while (true) {
                j = 0;
                System.out.println("Digite o nome do contato "+ (i+1) +": ");
                agenda[i][j] = sc.nextLine();
                j++;
                System.out.println("Digite o endereco do contato "+ (i+1) +":");
                agenda[i][j] = sc.nextLine();
                j++;
                System.out.println("Digite o codigo postal do contato "+ (i+1) +":");
                agenda[i][j] = sc.nextLine();
                j++;
                System.out.println("Digite o bairro do contato "+ (i+1) +":");
                agenda[i][j] = sc.nextLine();
                j++;
                System.out.println("Digite o telefone do contato "+ (i+1) +":");
                agenda[i][j] = sc.nextLine();
                i++;
                if (j==4 && i==10) break;
            }
        System.out.println("Contatos:");
            for (i =0; i<10;i++) {
                System.out.print("Contato " + (i+1) + ": ");
                for (j = 0; j<5; j++){
                    System.out.print(agenda[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
