import java.util.Scanner;

public class command13 {
    public static void main(String[] args) throws Exceptionnn {
        System.out.println("Type the string, press Enter and then type positive integer number");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number> 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println(text);
                }
            } 
        }
         else {
                throw new ExceptionNotInt("You typed non-integer positive number");
            }

    }
    public static class Exceptionnn extends Exception{
        public Exceptionnn(String message) {
            super(message);
       
        }

    }

}