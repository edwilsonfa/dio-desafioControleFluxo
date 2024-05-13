import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.print("Informe o primeiro número: ");
                int param01 = sc.nextInt();

                System.out.print("Informe o segundo número: ");
                int param02 = sc.nextInt();


                contar(param01, param02);
                continua = !continua;

            } catch (ParametrosInvalidosException e) {
                System.out.println("Parâmetros informados incorretamente: " + e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Devem ser informados somente números!");
                sc.nextLine();
            }
        }while (continua);

        sc.close();
    }

    static void contar(int param01, int param02) throws ParametrosInvalidosException {
        if (param01 > param02) {
            throw new ParametrosInvalidosException("O primeiro número informado não poderá ser maior do que o segundo!");
        }

        int contagem = param02 - param01;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}