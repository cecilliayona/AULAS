

public class Bob{

    String nome;
    int vida;
    Arma arma;
    //não entendi

    //usou arma - perdeu 2 pts de resistencia
    void usarArma(){
        arma.resistencia -= 2;
    }
    //sofre dano perde 5 pts de vida
    void tomaDano(){
        vida -= 5;
    }

}