import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String spec = "<>,.?/{}[]+=_-()!@#$%^&*";
        String combination = upper + lower + spec + dig;

        System.out.println("Insert password length: ");
        int len = in.nextInt();
        char[] password = new char[len];
        Random r = new Random();
        
        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        } System.out.println("Generated Password is: " + new String(password));
    }
}