import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double conta = 0;

        List<String> comidas = new ArrayList<String>();
        List<String> bebidas = new ArrayList<String>();

        String filme = "Nenhum";

//INTRODUÇÃO

            System.out.println("___________________________________\n");
            System.out.println("             CINE COFFE            ");
            System.out.println("___________________________________");
            System.out.println("\nSeja bem vindo!, ficamos felizes com o seu acesso, aqui você poderá escolher qual filme desejar e ainda adicionar uma comida e uma bebida no seu pedido. O diferencial do nosso cinema é a presença de um cardápio de cafeteria, conservando os valores do elegante café da tarde. O espaço ainda acompanha cadeiras inclinavéis com mesas acopladas para tornar sua experiencia mais confortável e agradavél, contamos também com uma equipe de primeira qualidade para atender a todos os nossos clientes. Divirta-se!");

            //FILME

            int voltar = 0;
            while(voltar !=2 ) {

                conta = 0;
                filme = "Nenhum";
                comidas.clear();
                bebidas.clear();

                int escolhaFilme = 0;
                do {

                    System.out.println("_________________________________");
                    System.out.println("\nVamos lá, selecione o número de acordo com o pedido que deseja!");
                    System.out.println("\nFILMES EM CARTAZ:");
                    System.out.println("\n[1] Simplesmente acontece = R$32,00");
                    System.out.println("[2] A culpa é das estrelas = R$25,00");
                    System.out.println("[3] Como eu era antes de você = R$30,00");
                    System.out.println("[4] Nenhuma das opções");
                    System.out.print("\nDigite sua opção de filme: ");

                    escolhaFilme = entrada.nextInt();

                    switch (escolhaFilme) {
                        case 1:
                            conta += 32;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Simplesmente acontece!");
                            filme = "Simplesmente acontece = R$32,00";
                            break;

                        case 2:
                            conta += 25;
                            System.out.println("\nÓtima escolha!!! Você selecionou: A culpa é das estrelas!");
                            filme = "A culpa é das estrelas = R$25,00";
                            break;

                        case 3:
                            conta += 30;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Como eu era antes de você!");
                            filme = "Como eu era antes de você = R$30,00";
                            break;

                        case 4:
                            System.out.println("\nAaaah que pena :( Você não escolheu nenhum filme.");
                            break;

                        default:
                            System.out.println("\n---O número digitado não é válido, por favor selecionar os números que estão no menu!---");
                    }
                }while (escolhaFilme>4);
                System.out.println("\nJá que finalizou a escolha do seu filme, inciaremos a de comidas!");

                //COMIDAS

                System.out.println("_________________________________");
                System.out.println("\nCOMIDAS:");
                System.out.println("\nSelecione o múmero do pedido que deseja");

                int escolhaComida = 0;

                while (escolhaComida != 4) {

                    System.out.println("\n[1] Croissant= R$15,00");
                    System.out.println("[2] Brownie= R$10,00");
                    System.out.println("[3] Torta de frango= R$18,00");
                    System.out.println("[4] Não desejo comer ou ja escolhi o suficiente!");
                    System.out.println("_________________________________");
                    System.out.print("\nDigite sua opção de comida: ");

                    escolhaComida = entrada.nextInt();

                    switch (escolhaComida) {
                        case 1:
                            conta += 15;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Croissant!");
                            comidas.add("Croissant= R$15,00");
                            break;

                        case 2:
                            conta += 10;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Brownie!");
                            comidas.add("Brownie= R$10,00");
                            break;

                        case 3:
                            conta += 18;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Torta de frango!");
                            comidas.add("Torta de frango= R$18,00");
                            break;

                        case 4:
                            System.out.println("\nVocê finalizou a escolha de comidas.");
                            escolhaComida = 4;
                            break;

                        default:
                            System.out.println("\n---O número digitado não é válido, por favor selecionar os números que estão no menu!---");
                    }
                }
                if (escolhaComida == 4) {

                }
                System.out.println("\nJá que finalizou a escolha de comidas, inciaremos a de bebidas!");


                //BEBIDAS

                System.out.println("_________________________________\n");
                System.out.println("BEBIDAS:");
                System.out.println("\nSelecione o múmero do pedido que deseja");
                int escolhaBebida = 0;

                while (escolhaBebida != 4) {
                    System.out.println("\n[1] Café expresso = R$6,00");
                    System.out.println("[2] Capuccino = R$9,00");
                    System.out.println("[3] Chocolate quente = R$11,00");
                    System.out.println("[4] Não desejo beber ou ja escolhi o suficiente!");
                    System.out.println("_________________________________");
                    System.out.print("\nDigite sua opção de bebida: ");

                    escolhaBebida = entrada.nextInt();

                    switch (escolhaBebida) {
                        case 1:
                            conta += 6;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Café expresso!");
                            bebidas.add("Café expresso = R$6,00");
                            break;

                        case 2:
                            conta += 9;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Capuccino!");
                            bebidas.add("Capuccino = R$9,00");
                            break;

                        case 3:
                            conta += 11;
                            System.out.println("\nÓtima escolha!!! Você selecionou: Chocolate quente!");
                            bebidas.add("Chocolate quente = R$11,00");
                            break;

                        case 4:
                            System.out.println("\nVocê finalizou a escolha de bebidas.");
                            escolhaBebida = 4;
                            break;

                        default:
                            System.out.println("\n---O número digitado não é válido, por favor selecionar os números que estão no menu!---");

                    }
                }


                if (escolhaBebida == 4) {
                    System.out.println("\n_________________________________");
                    System.out.println("\nPedido finalizado, veja agora sua conta:");
                    System.out.println("\nCaso não tenha escolhido bebidas ou comidas, sua conta so trará o valor da atração!");
                }

                if (comidas.size() > 0) {
                    System.out.println("\n| As suas comidas escolhidas foram: |");
                    comidas.forEach(System.out::println);
                }

                if (bebidas.size() > 0) {
                    System.out.println("\n| As suas bebidas escolhidas foram: |");
                    bebidas.forEach(System.out::println);
                }

                System.out.println("\n| O seu filme escolhido foi: " + filme + "|");
                System.out.println("_________________________________");
                System.out.println("\nValor total = R$" + conta);

                System.out.println("_________________________________");
                System.out.print("\nDeseja recomeçar?\n");
                System.out.println("\n[1] Sim");
                System.out.println("[2] Não, encerrar programa.");
                System.out.print("\nDigite a opção: ");
                voltar = entrada.nextInt();


            }
    }
}
