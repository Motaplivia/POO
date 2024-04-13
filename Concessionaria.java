// Classe Carro
class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int numeroPortas;


    // Construtor
    public Carro(String marca, String modelo, int ano, String cor, int numeroPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroPortas = numeroPortas;
    }


    // Método para obter a descrição do carro
    public String descricao() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d, Cor: %s, Portas: %d",
                marca, modelo, ano, cor, numeroPortas);
    }
}


// Classe Moto
class Moto {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int cilindradas;


    // Construtor
    public Moto(String marca, String modelo, int ano, String cor, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.cilindradas = cilindradas;
    }


    // Método para obter a descrição da moto
    public String descricao() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d, Cor: %s, Cilindradas: %d",
                marca, modelo, ano, cor, cilindradas);
    }
}


class Concessionaria {
    public static void main(String[] args) {
        // Criando uma instância de Carro e uma instância de Moto
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata", 4);
        Moto minhaMoto = new Moto("Honda", "CBR 650R", 2023, "Vermelha", 650);


        // Chamando o método descricao() de cada instância para exibir as informações
        System.out.println(meuCarro.descricao());
        System.out.println(minhaMoto.descricao());
    }
}

