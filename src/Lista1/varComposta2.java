package Lista1;

public class varComposta2 {
    public static void main(String[] args){
        int[] numerosAleatorios = new int[100];

        for(int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.printf("V[%d] = %d%n", i, numerosAleatorios[i]);
        }
    }
}
