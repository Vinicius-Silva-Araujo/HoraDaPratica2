public class Musica {
    String titulo;
    String artista ;
    int anolancamento ;
    double avaliacao ;
    int numeroAvaliacao ;
    double somaAvalia;
    double totalAvalia;

    void fichaTecnica(){
        System.out.println("Nome da Musica: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de lançamento: "+anolancamento);
        System.out.println("Avaliação: "+avaliacao);
        System.out.println("Numeor de Avaliação: "+numeroAvaliacao);
    }
    void avalia (double nota){
        somaAvalia += nota;
        totalAvalia++;

    }
    double pegaMedia(){
        return  somaAvalia/totalAvalia;
    }
}
