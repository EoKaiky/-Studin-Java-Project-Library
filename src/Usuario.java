public class Usuario {
    private String nameUser;
    private Livro livroAlugado;

    public Usuario(String nameUser){
        this.nameUser = nameUser;
        this.livroAlugado = null;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Livro getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(Livro livroAlugado) {
        this.livroAlugado = livroAlugado;
    }

    public void alugarLivro(Livro livro){
        if (livro.isDisponovel()){
            livroAlugado = livro;
            livro.setDisponovel(false);
            System.out.println(nameUser+ " alugou o livro " +livro.getTitle());
        } else {
            System.out.println("O livro " + livro.getTitle()+ " nao esta disponivel");
        }
    }

    public void devolverLivro(){
        if (livroAlugado != null ){
            livroAlugado.setDisponovel(true);
            System.out.println(nameUser+ " devolveu o livro: " +livroAlugado.getTitle());
        } else {
            System.out.println(nameUser+ " voce não tem livro para devolver");
        }
    }

}
