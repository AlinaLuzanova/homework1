import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class IO13 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("путь к файлу я с ним обязательно разберусь");
        Scanner scanner = new Scanner(reader);
        int max = 0;

        String stroka = null;
        String answer = null;
        

       while (scanner.hasNext()){
           stroka = scanner.nextLine();
            if (stroka.length()>max){
                max = stroka.length();
                answer = stroka;
            }
        }
        System.out.println(answer);
    }
}