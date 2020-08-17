package src.CadastroLogin;

import java.util.Scanner;

public class CadastroLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha = null;

        System.out.println("Digite o seu Nome Completo: ");
        String Nome = scanner.nextLine();

        String[] array = Nome.split(" ");
        String sobrenome = array[array.length - 1];

        String Username = Nome.charAt(0) + "_" + sobrenome;
        System.out.println("Seu username é : " + Nome.charAt(0) + "_" + sobrenome);


        int cont = 0;

        while (cont < 10) {
            System.out.println("Digite uma Senha: " + System.lineSeparator() + "Pelo menos 8 caracteres,1 Letra maiuscula,1 Letra minuscula,1 numero e 1 caractere especial: ");
            senha = scanner.nextLine();
            if (senha.length() > 7 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!,@,#,$,%,&,*])(?=.*[A-Z])(?=.*\\d).+")) {
                System.out.println("Senha Cadastrado com sucesso");
                break;
            } else {
                System.out.println("Senha Invalida, Senha nao segue as Regras");
                cont++;
            }
        }

        boolean login = false;


        while (login == false) {
            System.out.println("Digite o seu Username para Login: ");
            String usuario = scanner.nextLine();

            System.out.println("Digite a sua Senha: ");
            String password = scanner.nextLine();

            if (!usuario.equals(Username) && !password.equals(senha)) {
                System.out.println("Usuario e Senha Invalidos");
                login = false;
            } else if (!usuario.equals(Username) && password.equals(senha)) {
                System.out.println("Usuario Invalido");
                login = false;
            } else if (usuario.equals(Username) && !password.equals(senha)) {
                System.out.println("Senha Invalida");
                login = false;
            } else {
                System.out.println("Acesso Permitido");
                login = true;
                break;
            }
        }
    }
}