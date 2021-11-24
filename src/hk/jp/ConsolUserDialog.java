package hk.jp;

import java.util.Scanner;

public class ConsolUserDialog {

    private final String  ERROR_MESSAGE = "Error";

    private final Scanner sc = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInfoMessage(String message) {
        System.out.println(message);
        enterString("Nacisnij ENTER");
    }

    public void printErrorMessage(String message) {
        System.err.println(message);
        System.err.println("Nacisnij ENTER");
        enterString("");
    }

    public void clearConsole(){
        System.out.println("\n\n");
    }

    public String enterString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public int enterInteger(String prompt) {
        int i = 0;
        i = Integer.parseInt(enterString(prompt));
        return  i;
    }
}