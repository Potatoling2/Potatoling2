import java.util.LinkedList;
import java.util.Scanner;
public class TextScroll {
  public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void scroll(String a) {
        int length = a.length();
        LinkedList<Character> newdialogue = new LinkedList<Character>();
        for(int b = 0; b < length; b++) {
            newdialogue.add(a.charAt(b));
        }
        for(int c = 0; c < length; c++) {
            System.out.print(newdialogue.get(c));
            wait(20);
        }
        System.out.println("");
    }
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string you would like to scroll.");
        String text = input.nextLine();
        scroll(text);
    }
}
