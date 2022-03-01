import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.io.FileNotFoundException;
import java.io.IOException;



public class collection12 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("путь к файлу, я разберусь с этим на гите");
        Scanner scanner = new Scanner(reader);
        int number = scanner.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            arrayDeque.add(scanner.nextInt());
        }

        Object [] array = arrayDeque.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}