import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CelularController controller = new CelularController();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar iPhone");
            System.out.println("2. Cadastrar Android");
            System.out.println("3. Exibir Celulares");
            System.out.println("4. Atualizar Celular");
            System.out.println("5. Deletar Celular");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controller.cadastrarCelular(opcao);
                    break;
                case 2:
                    controller.cadastrarCelular(opcao);
                    break;

                case 3:
                    controller.exibirCelulares();
                    break;

                case 4:
                    System.out.println("Digite o índice do celular que deseja atualizar:");
                    int indiceAtualizacao = scanner.nextInt();

                    System.out.println("Escolha o novo tipo de celular (1 para iPhone, 2 para Android):");
                    int novoTipo = scanner.nextInt();

                    Celular novoCelular = (novoTipo == 1) ? new iPhone() : new Android();
                    controller.atualizarCelular(indiceAtualizacao, novoCelular);
                    break;

                case 5:
                    System.out.println("Digite o índice do celular que deseja deletar:");
                    int indiceDelecao = scanner.nextInt();
                    controller.deletarCelular(indiceDelecao);
                    break;

                case 0:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
