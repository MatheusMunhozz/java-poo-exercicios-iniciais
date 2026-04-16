public class Carro {

    String modelo;
    int anoDocarro;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoDocarro);
        System.out.println("Cor: " + cor);
    }

    int calcularIdadeDoCarro(int anoAtual){
        int idadeDoCarro = anoAtual - anoDocarro;
        System.out.println("A idade do carro é de : " + idadeDoCarro + " anos.");
        return  idadeDoCarro;
    }


}
