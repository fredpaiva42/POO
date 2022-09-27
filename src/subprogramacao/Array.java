package subprogramacao;
public class Array {
    public static void mostra(int[] array) {
        System.out.println(array[0] + ", " + array[1]);
    }

    public static void troca(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args){
        int[] array = {10, 20};
        mostra(array);
        troca(array);
        mostra(array);
    }
}
