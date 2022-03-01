import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class IO11 {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        FileReader filereader = new FileReader("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//2.txt");
        String answer;
        int kitty;

        System.out.println("Answer YES and file will be printed, answer NO and file won't be printed");
        name = buffer.readLine();

        if(answer.equals("YES"))
            while ((kitty = fin.read()) != -1) 
                System.out.print((char) kitty);
    }
}