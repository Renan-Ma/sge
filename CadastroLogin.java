import java.util.Scanner;

public class CadastroLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        String sobrenome = nome.substring(nome.lastIndexOf(" "), nome.length());
        sobrenome = sobrenome.trim();

        String login = nome.charAt(0) + "_" + sobrenome;
        System.out.println("Seu login é: " + login);

        String senha = "";

        boolean cadastro = false;

        while (cadastro == false){

        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();

        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
            System.out.println("Cadastro efetuado com sucesso!");
            cadastro = true;

        } else {
            System.out.println("Sua senha não contém os requisitos mínimos de segurança. Digite outra senha!");
        }
        }

        boolean autenticando = false;

        while(autenticando == false) {
            System.out.println("Digite seu login: ");
            String validaLogin = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            String validaSenha = scanner.nextLine();

            if (login.equals(validaLogin) && validaSenha.equals(senha)) {
                autenticando = true;
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Login ou Senha invalidos!");
            }
        }
    }
}
