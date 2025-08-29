public class Cantina {
    String Ncantina = "Cantina Inatel";

    Salgado[] salgados = new Salgado[3];

    void addSalgados(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){

            if (salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println("A "+this.Ncantina+" posssui esses salgados: ");
        for (Salgado salgado : salgados) {

            System.out.println(salgado.nome);
        }
    }
}

