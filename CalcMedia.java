import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nomeAluno = new String[n];
        int[] notaAluno = new int[n];

        for (int i = 0; i < n; i++) {
            nomeAluno[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            notaAluno[i] = scanner.nextInt();
            if (notaAluno[i] < 7) {
                System.out.println("fosse reprovado, boyzinho. sinto muito!");
            } else {
                System.out.println("aprovado!");
            }


        }
    }
}

