public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        musica.titulo = "5 da manha";
        musica.artista = "Rai Saia Rodada & João Gomes";
        musica.anolancamento = 2023;
        musica.avaliacao = 100;
        musica.totalAvalia = 70;
        musica.avalia(9);
        musica.avalia(10);
        musica.avalia(2);


        carro.modelo = "Voyage";
        carro.ano = 2014;
        carro.cor = "Prata";


        aluno.nome = "Vinicius";
        aluno.idade = 30;

        pessoa1.exibir();
        System.out.println("\n###################################");
        System.out.println(calculadora1.numeroDobrado());
        System.out.println("\n###################################");
        musica.fichaTecnica();
        //System.out.println("\n###################################");
        System.out.println(musica.pegaMedia());
        System.out.println("\n###################################");
        carro.exibirFichaCarro();
        System.out.println("carro tem"+carro.calcAno()+"Anos");
        System.out.println("\n###################################");
        aluno.exibirAluno();




    }
}
