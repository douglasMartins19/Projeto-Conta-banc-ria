import java.util.Scanner;

public class ContaBancaria {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // entrada do scanner

        //inicialização das variáveis que serão utilizadas no decorrer do código
        String nome = ("Douglas Antônio Correa Martins");
        String tipoDeConta = "Conta corrente";
        double valorSaldo = 2400.00;
        double valorDeposito = 0;
        double valorSaque = 0;
        int infoConta = 1; // variável para manter o processamento se repetindo após cada operação concluída

        //header da conta com variáveis fixas
        System.out.println("***Conta Bancária***");
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Nome: " + nome);
        System.out.printf("Saldo: R$ %.2f\n", valorSaldo );

        //processamento
        while (infoConta == 1) {
                System.out.println("""
                        
                        **MENU DE OPERAÇÕES**
                        Selecione a opcão desejada:
                        1. Consultar saldo;
                        2. Depositar valor;
                        3. Sacar valor;
                        4. Sair.
                        """);
                int escolha = scanner.nextInt();

                //início do loop if else para avançar para as operações
                if (escolha < 1 || escolha > 4) {
                        System.out.println("Opção inválida!");
                } else {
                        switch (escolha) { //início do switch case para separar operações de acordo com opção escolhida
                                case 1:
                                        System.out.printf("Seu saldo é de: R$ %.2f\n", valorSaldo);
                                        break;
                                case 2:
                                        System.out.println("Insira o valor a ser depositado:");
                                        valorDeposito = scanner.nextDouble();
                                        valorSaldo += valorDeposito;
                                        System.out.printf("Seu depósito foi de R$ %.2f\n", valorDeposito);
                                        System.out.printf("Seu saldo agora é de R$ %.2f\n", valorSaldo);
                                        break;
                                case 3:
                                        System.out.printf("Insira o valor a ser sacado:");
                                        valorSaque = scanner.nextDouble();
                                        if (valorSaque < valorSaldo) {
                                                valorSaldo -= valorSaque;
                                                System.out.printf("Seu saque foi de R$ %.2f\n", valorSaque);
                                                System.out.printf("Seu saldo agora é de R$ %.2f\n", valorSaldo);
                                        } else {
                                                System.out.println("Valor de saque informado é insuficiente para o saldo da conta.");
                                        }
                                        break;
                                case 4:
                                        System.out.println("Operação finalizada com êxito.");
                                        infoConta = 2; // novo valor à variável para fechar a repetição do código
                        }
                }
        }
        }
}