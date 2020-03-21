package Main;

import Execution.Decryption;
import Execution.Encryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encryption wc = new Encryption();
        Decryption dc = new Decryption();
        System.out.println("Enter the String");
        String input = sc.nextLine();
        System.out.println("Enter the no. that you want to shift ");
        System.out.println(input);
        int n = sc.nextInt();
        System.out.println("Encryption :-");
        String encrypt = wc.encryption(input, n);
        System.out.println(encrypt);
        System.out.println("Decryption :-");
        String decrypt = dc.decryption(encrypt, n);
        System.out.println(decrypt);
    }

}
