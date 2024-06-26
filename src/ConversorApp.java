import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        //OBJETOS INSTANCIADOS
        Scanner sc = new Scanner(System.in);
        ConectandoApi app = new ConectandoApi();

        //MENU DE ESCOLHA
        Menu menu = new Menu();
        menu.imprimirMenu(sc);
        int escolha = sc.nextInt();

        //CONVERSOES
        double valor;
        switch (escolha) {
            case 1:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                double rate = app.conversao("USD", "ARS");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 2:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                rate = app.conversao("ARS", "USD");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 3:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                rate = app.conversao("USD", "BRL");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 4:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                rate = app.conversao("BRL", "USD");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 5:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                rate = app.conversao("USD", "COP");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 6:
                System.out.println("Insira o valor para conversão:");
                valor = sc.nextDouble();
                rate = app.conversao("COP", "USD");
                if (rate != 0) {
                    app.setValorEscolhido(valor);
                    double resultado = app.calculoConversao();
                    System.out.println("Resultado da conversão: " + resultado);
                } else {
                    System.out.println("Não foi possível obter a taxa de conversão.");
                }
                break;
            case 7:
                System.out.println("Programa finalizado!");
                break;
        }
    }
}

//TO-DO
//- colocar o switch em uma classe
