package CriandoUmaClasse;

public class Calculator {
    public double sum(double num1){
        return num1;
    }

    //Different number of parameters
    public double sum(double num1, double num2){
        return num1 + num2;
    }

    //Different type of parameters
    public double sum(int num1, int num2){
        return num1 + num2;
    }

    public double sum(int num1, double num2){
        return num1 + num2;
    }

    //Different order of parameters
    public double sum(double num1, int num2){
        return num1 + num2;
    }

    public double sum(double num1, double num2, double num3){
        return num1 + num2 +num3;
    }
}
