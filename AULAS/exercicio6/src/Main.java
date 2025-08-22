//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Piloto piloto = new Piloto();

        Kart kart = new Kart();
        piloto.nome = "joão";
        kart.nome = "Mini Max";
        System.out.println("Nome do piloto: "+ piloto.nome);
        System.out.println("Nome do kart: "+ kart.nome);

        kart.motor.cilindradas = "100";
        kart.motor.velocidadeMaxima = 80;

        System.out.println("/////");
        kart.motor.verificarVelocidadeMaxima();
        kart.motor.VerificarCilindradas();
        System.out.println("---------------");

        System.out.println("mostra as informações");
        kart.motor.mostraInfo();
        System.out.println("--------------------");

        kart.pular();
        kart.soltarTurbo();
        kart.fazerDrift();

        piloto.soltarSuperPodder();

        }
    }