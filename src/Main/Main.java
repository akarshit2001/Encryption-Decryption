package Main;

import Execution.Decryption;
import Execution.Encryption;

public class Main {
    public static void main(String[] args) {
        Encryption wc = new Encryption();
        Decryption dc = new Decryption();


        String encrypt = wc.encryption(args[1], Integer.parseInt(args[0]));
        System.out.println(encrypt);
        System.out.println("Decryption");
        String decrypt = dc.decryption(encrypt, 26 - 5);
        System.out.println(decrypt);
    }

}
