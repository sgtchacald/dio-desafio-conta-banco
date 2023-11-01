import java.util.Scanner;

public class DesafioEscopoEstruturasDeControleJogoPedraPapelAtaque {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com a quantidade de partidas: ");

        int n = leitor.nextInt();
        String jogador1, jogador2;

        for (int i = 0; i < n; i++) {

            System.out.println("Entre com seu movimento jogador 1: ");
            jogador1 = leitor.next();

            System.out.println("Entre com seu movimento jogador 2: ");
            jogador2 = leitor.next();


            if (
                !(
                    jogador1.equalsIgnoreCase("ataque")
                    || jogador1.equalsIgnoreCase("pedra")
                    || jogador1.equalsIgnoreCase("papel")
                )

                ||

                !(
                    jogador2.equalsIgnoreCase("ataque")
                    || jogador2.equalsIgnoreCase("pedra")
                    || jogador2.equalsIgnoreCase("papel")
                )
            ){
                System.out.println("Sem Ganhador");
            }else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")){
                System.out.println("Aniquilacao mutua");
            } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) {
                System.out.println("Sem Ganhador");
            } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")){
                System.out.println("Ambos venceram");
            }else if (jogador1.equalsIgnoreCase("ataque")){
                System.out.println("Jogador 1 venceu");
            }else if (jogador2.equalsIgnoreCase("ataque")){
                System.out.println("Jogador 2 venceu");
            }else if (jogador1.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 1 venceu");
            }else if (jogador2.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 2 venceu");
            }else if (jogador2.equalsIgnoreCase("papel")){
                System.out.println("Jogador 1 venceu");
            }else if (jogador1.equalsIgnoreCase("papel")){
                System.out.println("Jogador 2 venceu");
            }else{
                System.out.println("Sem Ganhador");
            }
        }
    }
}

