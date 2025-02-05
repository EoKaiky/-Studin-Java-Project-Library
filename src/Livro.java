public class Livro {
    private String title;
    private String autorName;
    private boolean disponovel;

    public Livro(String title, String autorName){
        this.title = title;
        this.autorName = autorName;
        this.disponovel = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public boolean isDisponovel() {
        return disponovel;
    }

    public void setDisponovel(boolean disponovel) {
        this.disponovel = disponovel;
    }

    @Override
    public String toString() {
        return  "Livro {"+
                "Titulo: " +title + '\''+
                ", autor: '" +autorName + '\''+
                ", disponivel: " +disponovel +
                '}';
    }
}
