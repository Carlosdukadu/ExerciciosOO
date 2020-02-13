package exercicio03;

public class Livro {
    private String titulo;
    private String autor;
    private int quantPaginas;



    public void trocarNome(String nome){
        this.titulo = nome;
    }



    //Construtor
    public Livro(String titulo, String autor, int quantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantPaginas = quantPaginas;
    }




    //Get
    public String getTitulo(String outro) {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }
}
