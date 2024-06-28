import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cadastro de Funcionário:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Alergias: ");
            String alergias = scanner.nextLine();

            System.out.print("Problemas Médicos: ");
            String problemasMedicos = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("E-mail: ");
            String email = scanner.nextLine();

            // Criar objeto Funcionario com as informações fornecidas
            Funcionario funcionario = new Funcionario(nome, id, alergias, problemasMedicos, telefone, email);

            // Exibir informações do funcionário
            System.out.println("\nInformações do Funcionário:");
            funcionario.exibirInformacoes();

            scanner.close(); // Fechar o scanner

        }

        private static class Funcionario {
            private String nome;
            private int id;
            private String alergias;
            private String problemasMedicos;
            private String telefone;
            private String email;

            // Construtor
            public Funcionario(String nome, int id, String alergias, String problemasMedicos, String telefone, String email) {
                this.nome = nome;
                this.id = id;
                this.alergias = alergias;
                this.problemasMedicos = problemasMedicos;
                this.telefone = telefone;
                this.email = email;
            }

            // Método para exibir informações do funcionário
            public void exibirInformacoes() {
                System.out.println("Nome: " + nome);
                System.out.println("ID: " + id);
                System.out.println("Alergias: " + alergias);
                System.out.println("Problemas Médicos: " + problemasMedicos);
                System.out.println("Telefone: " + telefone);
                System.out.println("E-mail: " + email);
            }
        }
}