package Day_03;

import java.util.Scanner;

public class P02_End_Of_File {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        // Use hasNext() to check for more lines of input
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
    }
}
