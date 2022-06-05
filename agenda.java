import java.util.Scanner; //importa scanner

public class agenda { //inicia classe
    public static void main(String[] args) { //inicia metodo main
        String[][] agenda = new String[10][5]; //cria uma matriz vazia 10x5
        Scanner sc = new Scanner(System.in); //cria um scanner
        int i = 0, j = 0; //inicia variavies i e j e atribui valor zero

            while (true) { //inicia loop infinito
                j = 0; //define/reseta j como zero
                System.out.println("Digite o nome do contato "+ (i+1) +": "); //mostra instrucoes na terla
                agenda[i][j] = sc.nextLine(); //define a atring digitada como o membro i x j da matriz
                j++; //soma 1 ao valor atual de j
                System.out.println("Digite o endereco do contato "+ (i+1) +":"); //mostra instrucoes na terla
                agenda[i][j] = sc.nextLine(); //define a atring digitada como o membro i x j da matriz
                j++; //soma 1 ao valor atual de j
                System.out.println("Digite o codigo postal do contato "+ (i+1) +":"); //mostra instrucoes na terla
                agenda[i][j] = sc.nextLine(); //define a atring digitada como o membro i x j da matriz
                j++; //soma 1 ao valor atual de j
                System.out.println("Digite o bairro do contato "+ (i+1) +":"); //mostra instrucoes na terla
                agenda[i][j] = sc.nextLine(); //define a atring digitada como o membro i x j da matriz
                j++; //soma 1 ao valor atual de j
                System.out.println("Digite o telefone do contato "+ (i+1) +":"); //mostra instrucoes na terla
                agenda[i][j] = sc.nextLine(); //define a atring digitada como o membro i x j da matriz
                i++; //soma 1 ao valor atual de j
                if (j==4 && i==10) break; //encerra o loop caso j seja 4 e i seja 10
            }
        System.out.println("Contatos:"); //exibe o texto
            for (i =0; i<10;i++) { // inicia loop for, para selecionar colunas da matriz
                System.out.print("Contato " + (i+1) + ": "); //exibe a frase
                for (j = 0; j<5; j++){ //inicia um loop for, para exibir as colunas pertencetes a linha selecionada no loop acima
                    System.out.print(agenda[i][j] +" "); //exibe membro i x j da matriz
                }
                System.out.println(); //pula linha
            }
        }
    }
