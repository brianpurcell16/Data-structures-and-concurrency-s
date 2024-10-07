import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1fileHandling {
    public static void main(String[] args) {


        String fileName = "/C://Users//t00223518//Downloads//hamlet.txt/";
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''" + word + lineNumber);
                    lineNumber++;
                }
                in.close();
                //lineParser.close();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
