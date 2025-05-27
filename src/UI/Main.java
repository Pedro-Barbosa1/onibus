package UI;

import java.util.Scanner;

public Class Main(){
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;

        while (true){
            System.out.println("Insira uma das opções abaixo: ");
            System.out.println("[1] Gerenciar rota.");
            System.out.println("[2] Gerenciar veículo.");
            System.out.println("[3] Venda de passagens.");
            System.out.println("[0] Encerrar programa.");
            System.out.print("Opção: ");

            entrada = scanner.nextInt();

            switch (entrada) {

                case 1:

                    break;

                case 2:

                    int x;

                    System.out.println("O que deseja fazer?");
                    System.out.println("[1] Criar veículo.");
                    System.out.println("[2] Atualizar veículo.");
                    System.out.println("[3] Deletar veículo.");
                    System.out.println("[0] Encerrar programa.");
                    System.out.print("Opção: ");

                    x = scanner.nextInt();

                    switch (x){
                        case 1:

                            System.out.println("Insira a marca do veículo: ");

                            System.out.println("Insira o modelo do veículo: ");

                            System.out.println("Insira o ano do veículo: ");

                            System.out.println("Insira a placa do veículo: ");

                            System.out.println("Insira a capacidade do veículo: ");

                            break;

                        case 2:

                            System.out.println("Qual veículo deseja atualizar? ");

                            break;

                        case 3:

                            System.out.println("Qual veículo deseja deletar? ");

                            break;

                        case 0:

                            System.out.println("Encerrando o programa...");
                            time.sleep(2000);
                            break;
                    }

                    break;

                case 3:

                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    time.sleep(2000);
                    break;
            }
        }
    }
}