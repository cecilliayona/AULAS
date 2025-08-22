public class Main{

    public static void main(String args[]){

        //usou arma - perdeu 2 pts de resistencia
        //sofre dano perde 5 pts de vida
        Bob bob1 = new Bob();
        Bob bob2 = new Bob();

        bob1.vida = 100;
        bob2.vida = 100;

        // declara classe Arma
        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "Sniper";
        arma2.descricao = "Fuzil";

        arma1.resistencia = 50;
        arma2.resistencia = 50;

        //declara a arma de cada personagem
        bob1.arma = arma1;
        bob2.arma = arma2;

        System.out.println("vida bob 1: "+bob1.vida);
        bob1.arma.mostrarInfoArma();

        System.out.println("vida bob 2: "+bob2.vida);
        bob2.arma.mostrarInfoArma();

        System.out.println("-------------------");

        bob2.usarArma();
        System.out.println("Bob2 Usou a Arma");
        bob1.usarArma();
        bob1.tomaDano();
        System.out.println("Bob1 usou a arma e levou 1 tiro");


        System.out.println("-------------------");
        System.out.println("Nova Info Bob2");
        bob2.arma.mostrarInfoArma();
        System.out.println("vida bob 2: " + bob2.vida);

        System.out.println("-------------------");
        System.out.println("Nova Info Bob1");
        bob1.arma.mostrarInfoArma();
        System.out.println("vida bob 1: "+bob1.vida);
    }
}