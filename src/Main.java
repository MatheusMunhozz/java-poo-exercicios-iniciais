//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.exibirMensagem();
        System.out.println("----------------------------------------------");

        Calculadora calculadora1 = new Calculadora();
        calculadora1.dobrarValor(2);
        System.out.println("----------------------------------------------");

        Musica sprinter = new Musica();
        sprinter.titulo = "Sprinter";
        sprinter.anoDeLancamento = 2023;
        sprinter.artista = "Central Cee";

        sprinter.exibirFichaTecnica();
        sprinter.avaliar(1);
        sprinter.avaliar(6);
        sprinter.avaliar(3);
        System.out.println("----------------------------------------------");
        sprinter.exibirFichaTecnica();
        sprinter.calcularMediaAvaliacoes();
        System.out.println("----------------------------------------------");
        Carro c1 = new Carro();
        c1.modelo = "HB20";
        c1.cor = "Branco";
        c1.anoDocarro = 2015;
        c1.exibirFichaTecnica();
        c1.calcularIdadeDoCarro(2026);
        System.out.println("----------------------------------------------");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Antonio Braga";
        aluno1.idade = 17;
        aluno1.exibirInformacoes();





    }
}
