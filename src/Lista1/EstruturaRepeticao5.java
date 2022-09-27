package Lista1;

public class EstruturaRepeticao5 {
    public static void main(String[] args){
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }
    /*
    Primeiro: 2, 2, 1
    Segundo: 2, 3, 1
    Terceiro: 2, 3, 3
    Quarto: 2, 4, 1
    Quinto: 2, 4, 3
    Sexto: 4, 4, 1
     */
}
