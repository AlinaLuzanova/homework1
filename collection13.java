import java.util.Scanner;
import java.util.Stack;
import java.io.*;
import java.util.LinkedList;


public class collections13 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:путь к файлу, я разберусь с этим на гите");
        PrintWriter writer = new PrintWriter("C:путь к файлу, я разберусь с этим на гите");
        Scanner scanner = new Scanner(reader);
        LinkedList<Integer> linkedlist = new LinkedList<>();
        int c;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0){
                break;
            } else if(number>0) {
                linkedlist.add(number);
            }
        }
        while (linkedlist.size() != 0){
            writer.println(linkedlist.peekLast());
        }
        writer.close();
    }
}