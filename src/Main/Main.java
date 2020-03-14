package Main;

import Execution.Encryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encryption wc = new Encryption();
        System.out.println("Enter the String");
        String input = sc.next();
        System.out.println("Enter the no. that you want to shift ");
        sc.nextLine();
        int n = sc.nextInt();
        wc.encryption(input, 5);
        System.out.println("Decryption");

    }

}
