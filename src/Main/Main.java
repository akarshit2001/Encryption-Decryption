package Main;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decryption decryption = new Decryption();
        Encryption encryption = new Encryption();
        int count = 2;
        while (count != 0) {
            System.out.println("Enter the mode");
            String mode = sc.next();
            sc.nextLine();
            if (mode.equals("enc")) {
                System.out.println("Enter the string thar you want to encrypt");
                String input = sc.nextLine();

                System.out.println("Enter the key");
                int key = sc.nextInt();
                String encrypt = encryption.encryption(input, key);
                System.out.println(encrypt);
            } else if (mode.equals("dec")) {
                System.out.println("Enter the string thar you want to decrypt ");
                String input = sc.nextLine();

                System.out.println("Enter the key");
                int key = sc.nextInt();
                String decryption1 = decryption.decryption(input, key);
                System.out.println(decryption1);

            }
            count--;
        }
    }

}
