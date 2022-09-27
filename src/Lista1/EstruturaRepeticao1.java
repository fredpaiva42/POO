package Lista1;
/*
Construa a tabela de multiplicação de número de 1 a 10
 */
public class EstruturaRepeticao1 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }
    }
}
