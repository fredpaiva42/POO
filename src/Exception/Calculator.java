package Exception;
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException{
        try{
            return x / y;
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return 0.0;
    }
}
