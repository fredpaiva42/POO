package CriandoUmaClasse;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        calc.sum(1,2);
        calc.sum(1,2,3);
        calc.sum(1.5,4.5);
    }
}
