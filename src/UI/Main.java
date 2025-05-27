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

                    int y;

                    System.out.println("O que deseja fazer?");
                    System.out.println("[1] Criar rota."); 
                    System.out.println("[2] Atualizar rota.");
                    System.out.println("[3] Deletar rota.");
                    System.out.println("[0] Encerrar programa.");
                    System.out.print("Opção: ");

                    y = scanner.nextInt();

                    switch (y) {
                        case 1:

                            System.out.println("Insira a partida da rota: ");
                            String partida = scanner.next();

                            System.out.println("Insira o destino da rota: ");
                            String destino = scanner.next();

                            System.out.println("Insira a distância da rota: ");
                            double distancia = scanner.nextDouble();

                            System.out.println("Rota criada com sucesso!");

                            break;

                        case 2:

                            System.out.println("Qual rota deseja atualizar? ");

                            break;

                        case 3:

                            System.out.println("Qual rota deseja deletar? ");

                            break;

                        case 0:
                            System.out.println("Encerrando o programa...");
                            time.sleep(2000);
                            break;
                    }

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
                            String marca = scanner.next();

                            System.out.println("Insira o modelo do veículo: ");
                            String modelo = scanner.next();

                            System.out.println("Insira o ano do veículo: ");
                            int ano = scanner.nextInt();
                            scanner.nextLine();  

                            System.out.println("Insira a placa do veículo: ");
                            String placa = scanner.nextLine();

                            System.out.println("Insira se o veículo está disponível (true/false): ");
                            boolean isDisponivel = scanner.nextBoolean();

                            System.out.println("Insira a capacidade do veículo: ");
                            int capacidade = scanner.nextInt();
                            scanner.nextLine();

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

                    int z;

                    System.out.println("O que deseja fazer?");
                    System.out.println("[1] Criar passagem.");
                    System.out.println("[2] Atualizar passagem.");
                    System.out.println("[3] Deletar passagem.");
                    System.out.println("[0] Encerrar programa.");
                    System.out.print("Opção: ");

                    z = scanner.nextInt();

                    switch (z) {
                        case 1:

                            System.out.println("Insira o número da passagem: ");
                            String numeroPassagem = scanner.next();

                            System.out.println("Insira o nome do passageiro: ");
                            String nomePassageiro = scanner.next();

                            System.out.println("Insira o CPF do passageiro: ");
                            String cpfPassageiro = scanner.next();

                            System.out.println("Insira a origem da viagem: ");
                            String origem = scanner.next();

                            System.out.println("Insira o destino da viagem: ");
                            String destinoPassagem = scanner.next();

                            System.out.println("Insira a data da viagem (formato YYYY-MM-DD): ");
                            String dataViagemStr = scanner.next();
                            LocalDate dataViagem = LocalDate.parse(dataViagemStr);

                            System.out.println("Insira o horário de saída (formato HH:MM): ");
                            String horarioSaidaStr = scanner.next();
                            LocalTime horarioSaida = LocalTime.parse(horarioSaidaStr);

                            System.out.println("Insira a poltrona: ");
                            String poltrona = scanner.next();

                            System.out.println("Insira o preço da passagem: ");
                            double preco = scanner.nextDouble();

                            System.out.println("Passagem criada com sucesso!");

                            break;

                        case 2:

                            System.out.println("Qual passagem deseja atualizar? ");

                            break;

                        case 3:

                            System.out.println("Qual passagem deseja deletar? ");

                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    time.sleep(2000);
                    break;
            }
        }
    }
}
