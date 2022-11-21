package ArrayLists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListEx1 {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");
        System.out.println(students);
        System.out.println(students.size());
        students.add(0, "Nick");
        students.add(1, "Mike");
        students.remove(3);
        System.out.println(students);
        System.out.println(students.size());

        for(String student: students){
            System.out.println("Name is " + student);
        }

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println("Name is "+ iterator.next());
        }

        ListIterator<String> litr = students.listIterator();
        System.out.println("Percorrendo a lista de frente para trás: ");
        while (litr.hasNext()){
            System.out.println("Name is "+litr.next());
        }
        System.out.println("Percorrendo de trás para frente");
        while (litr.hasPrevious()){
            System.out.println("Name is "+litr.previous());
        }
    }
}
