public class Musica {

    String titulo ;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numDeAvaliacoes;


    void exibirFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }

    void avaliar(int nota){
        avaliacao += nota;
        numDeAvaliacoes++;
    }

    double calcularMediaAvaliacoes(){
        if (numDeAvaliacoes == 0){
            return 0;
        }else{
            double media = avaliacao / numDeAvaliacoes;
            System.out.println("A media das avaliações é: " + media);
            return media;

        }
    }

}
