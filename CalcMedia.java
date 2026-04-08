import java.util.Scanner;
public class CalcMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nomeAluno = new String[n];
        int notaAluno = scanner.nextInt();



        if (notaAluno > 7){
            System.out.println("Aluno Aprovado");
        }
    }
}

