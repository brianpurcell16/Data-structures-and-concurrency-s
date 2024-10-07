import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab1fileHandling {
    public static void main(String[] args) {


        String fileName = "/C://Users//t00223518//Downloads//hamlet.txt/";
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;

            TreeSet<String> tree = new TreeSet<>();

            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''" + word + lineNumber);
                    tree.add(word);
                }
                lineNumber++;
                lineParser.close();
            }
            in.close();

            Iterator<String> iterator = tree.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
