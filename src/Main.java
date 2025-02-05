import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("Harry Potter: o prisioneiro de azkaban", "meu saco"));
        biblioteca.adicionarLivro(new Livro("A culpa e das estrelas", "John Green"));
        biblioteca.adicionarLivro(new Livro("Biblia Sagrada", "Apostolo Paulo"));
        biblioteca.adicionarLivro(new Livro("Harry Potter dois", "meu saco"));
        biblioteca.adicionarUsuario(new Usuario("Kaiky"));
        biblioteca.adicionarUsuario(new Usuario("Juliana"));
        biblioteca.adicionarUsuario(new Usuario("nego"));

        while (true) {
            System.out.println("1. Alugar livro");
            System.out.println("2. Devolver Livro");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opcão: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome de usuario: ");
                String Username = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(Username);

                if (usuario != null) {
                    System.out.println("Digite o nome do Livro: ");
                    String nameLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(nameLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado");
                    }
                } else {
                    System.out.println("Usuario não encontrado");
                }
            } else if (opcao == 2) {
                System.out.println("Digite o nome do usuario: ");
                String userName = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(userName);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out.println("Usuario não encontrado");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opcão invalida");
            }
        }

        scanner.close();
    }
}