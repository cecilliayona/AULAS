public class Zumbi{

    double vida; // quantidade da vida do zumbi
    String nome;

    double mostraVida(){
        return this.vida; // retorna a quantidade de vida atual
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        //ZUMbi alvo = zumbi que irá receber a vida
        if(this.vida > quantia){ // a vida desse zumbi
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }else{
            System.out.println("Nao é possivel transferir "
                    + quantia + " pois minha vida é: " + this.vida);
            return false;
        }

    }

}