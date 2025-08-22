public class Motor {
    String cilindradas;
    float velocidadeMaxima;


    void VerificarCilindradas() {
        if (cilindradas.equals("50")) {
            System.out.println(cilindradas);
        }
        if (cilindradas.equals("100")) {
            System.out.println("Cilindradas"+cilindradas);
        }

        if (cilindradas.equals("150")) {
            System.out.println(cilindradas);
        } else {
            System.out.println("valor não é compativel");
        }
    }

    void MostraInfo() {
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
    }

    void verificarVelocidadeMaxima() {
        if (velocidadeMaxima > 0 || velocidadeMaxima < 150) {
            System.out.println("Velocidade Maxima: " + velocidadeMaxima);;
        } else {
            System.out.println("velocidade Maxima invalida");
        }
    }

    void mostraInfo() {
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
    }
}
