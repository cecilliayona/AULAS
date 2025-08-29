import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Random rand = new Random();

        //int X = rand.nextInt(2);
        //int Y = rand.nextInt(2);
        //System.out.println("Posição X:"+X+" Posição Y:"+Y);

        Scanner entrada = new Scanner(System.in);
        //int digitado = entrada.nextInt();

        //matriz 2x2
        int[][] campo = new int[2][2];

        int bomba1 = rand.nextInt(2);
        int bomba2 = rand.nextInt(2);

        campo[bomba1][bomba2] = 1;//bomba

        //variaveis

        boolean ganhou = false;
        boolean[][] visitado = new boolean[2][2];//onde já pisou
        int seguro = 0;//contador

        System.out.println("Campo Minado");
        System.out.println("Escolha uma posição para caminhar (x,y)");

        while (ganhou == false) {
            System.out.println("Digite outra posição X: ");
            int X = entrada.nextInt();
            System.out.println("Digite outra posição Y: ");
            int Y = entrada.nextInt();


            if (X < 0 || X > 1 || Y < 0 || Y > 1) {
                System.out.println("Não é possivel");
            }

            if (visitado[X][Y]) {
                System.out.println("voce já passou por aqui");
            }
            visitado[X][Y] = true;

            if (campo[X][Y] == 1) {
                System.out.println("BOMBA!!!");
            } else {
                System.out.println("Continue");
                seguro++;
            }
            if (seguro == 3) {
                System.out.println("VOCÊ GANHOU!");
                ganhou = true;
            }
        }
        System.out.println("Jogo Encerrado");
        entrada.close();
    }
}