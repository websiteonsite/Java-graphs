package oops.Finally_Block;

public class ExceptionDemo {

  public static int fact(int n){

  public static int divide(int a, int b) throw DivideByZeroException{
        if(b==0){
          throw new DivideByZeroException();
        }
        return a/b;
  }

  public static void main(String[] args) {
    try {
      // File f= new File();

      divide(10, 0);
      System.out.println(fact(1));
      System.out.println("Within Try");
    } catch (DivideByZeroException e) {
      System.out.println("Divide by zero exception raised");
    } catch (NegativeNumberException e) {

      System.out.println("Negative Number Excpetion");
    } catch (Exception e) {

      System.out.println("Generic Exception");
    } finally {
      System.out.println("Finally");
    }
    System.out.println("Main");
  }

}
