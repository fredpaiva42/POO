package ArrayLists;
import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");

        String str = names.get(0);
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");

        System.out.println(names);

        Set<String> palavras = new HashSet<>();

        palavras.add("Flamengo");
        palavras.add("Fluminense");
        palavras.add("Botafogo");
        palavras.add("Botafogo");

        System.out.println(palavras.size());

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        Map<Integer,String> dddPorMunicipio = new HashMap<>();
        List<Integer> numero = new ArrayList<>();

        int num = 121;
        int centena = (num - num % 100);
        int dezena = num % 100;
        int unidade = num%10;

        numero.add(centena);
        numero.add(dezena);
        numero.add(unidade);

        dddPorMunicipio.put(1, "I");
        dddPorMunicipio.put(2, "II");
        dddPorMunicipio.put(21, "XX");
        dddPorMunicipio.put(100, "C");


        System.out.print(dddPorMunicipio.get(centena));
        System.out.print(dddPorMunicipio.get(dezena));
        System.out.print(dddPorMunicipio.get(unidade));

    }
}
