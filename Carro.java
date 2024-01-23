public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaCarro(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);

    }
    int calcAno(){
        return  2024-ano;
    }
}
