package varCompostas;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args){
        final int QTD_ALUNOS = 40;
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[QTD_ALUNOS];
        float[] notas = new float[QTD_ALUNOS];
        float media = 0;

        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.printf("Informe o nome do aluno %d: ", i+1);
            nomes[i] = input.nextLine();
            System.out.printf("Informe a nota de %s: ", nomes[i]);
            notas[i] = input.nextFloat();
            media += notas[i];
            input.nextLine();
        }

        media /= QTD_ALUNOS;

        for (int i = 0; i < QTD_ALUNOS; i++) {
            if(notas[i] > media)
                System.out.println("Parabéns " + nomes[i]);
        }
    }
}
