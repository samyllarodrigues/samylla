import java.util.Scanner;

public class q1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Declarar variáveis para as 8 notas anuais
            double nota1Bimestre;
            double nota2Bimestre;
            double nota3Bimestre;
            double nota4Bimestre;
            double nota5Bimestre;
            double nota6Bimestre;
            double nota7Bimestre;
            double nota8Bimestre;

            // ... e assim por diante para as 8 notas se for o caso de 2 notas por bimestre

            // Receber as 8 notas anuais do aluno
            System.out.print("Digite a nota do 1º Bimestre: ");
            nota1Bimestre = scanner.nextDouble();

            System.out.println("Digite a nota do 2° Bimestre; ");
            nota2Bimestre = scanner.nextDouble();

            double b1 = (nota1Bimestre + nota2Bimestre) / 2;

            System.out.println("Digite a nota do 3° Bimestre; ");
            nota3Bimestre = scanner.nextDouble();

            System.out.println("Digite a nota do 4° Bimestre; ");
            nota4Bimestre = scanner.nextDouble();

            double b2 = (nota3Bimestre + nota4Bimestre) / 2;
            double s1 = (b1 + b2) /2;

            System.out.println("Digite a nota da 5° Bimestre;");
            nota5Bimestre = scanner.nextDouble();

            System.out.println("Digite a nota da 6°; ");
            nota6Bimestre = scanner.nextDouble();

            double b3 = (nota5Bimestre + nota6Bimestre) / 2;

            System.out.println("Digite a nota da 7°; ");
            nota7Bimestre = scanner.nextDouble();

            System.out.println("Digite a nota da 8°; ");
            nota8Bimestre = scanner.nextDouble();
            double b4 = (nota7Bimestre + nota8Bimestre) / 2;
            double s2 = ( b3 + b4) /2;

            double media = ( s1 + s2) / 2;

            System.out.println("Primeiro Bimestre: " + b1);
            System.out.println("Segundo Bimestre: " + b2);
            System.out.println(" Primeiro Semestre: " + s1);
            System.out.println("==================================");
            System.out.println("Teceiro Bimestre: " + b3);
            System.out.println("Quarto Bimestre: " + b4);
            System.out.println("Segundo Semestre: " + s2 );
            System.out.println("==================================");
            System.out.println("Media Final: " + s1 + s2);




        }
    }
