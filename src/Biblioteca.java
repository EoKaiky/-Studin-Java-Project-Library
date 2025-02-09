import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro (Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " +livro.getTitle());
    }

    public void adicionarUsuario (Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario adicionado: " +usuario.getNameUser());
    }

    public Livro buscarLivro(String title){
        for (Livro livro: livros) {
            if (livro.getTitle().equals(title)) {
                return livro;
            }
        }

        return null;
    }

    public Usuario buscarUsuario(String nameUser) {
        for (Usuario usuario: usuarios) {
            if (usuario.getNameUser().equals(nameUser)){
                return usuario;
            }
        }

        return null;
    }
}
