public class Kart {
    String nome;

    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    void pular()
    {
        System.out.println("Pulando");
    }
    void soltarTurbo(){
        System.out.println("Soltando Turbo");

    }
    void  fazerDrift()
    {
        System.out.println("Fazendo drift");
    }
}
