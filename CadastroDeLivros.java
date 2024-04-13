package Atividade03;

public class CadastroDeLivros {
    public static void main(String[] args) {

    Livro livro1 = new Livro();
    Livro livro2 = new Livro();
    Livro livro3 = new Livro();
    Livro livro4 = new Livro();

    Autor autor = new Autor();

    autor.nome = "Rodrigo Turini";
    autor.email = "rodrigo.turini@caelum.com.br";
    autor.cpf = "123.456.789.10";

    Livro livro = new Livro();
    livro.nome = "java 8 Pratico";
    livro.descricao = "Novos rescursos da linguagem";
    livro.valor = 59.90;
    livro.isbn = "978-3-16-148410-0";

    livro.autor = autor;

    livro.mostrarDetalhes();

    Autor outroAutor = new Autor();
    outroAutor.nome = "Paulo Silveira";
    outroAutor.email = "paulo.silveira@caelum.com.br";
    outroAutor.cpf = "123.456.789.10";

    Livro outroLivro = new Livro();
    outroLivro.nome = "Lógica de programação";
    outroLivro.descricao = "Crie seus primeiros programas";
    outroLivro.valor = 59.90;
    outroLivro.isbn = "978-85-66250-22-0";

    outroLivro.autor = outroAutor;

    outroLivro.mostrarDetalhes();

    }

}

