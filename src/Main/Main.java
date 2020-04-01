package Main;


public class Main {
    public static void main(String[] args) {
        Decryption decryption = new Decryption();
        Encryption encryption = new Encryption();
        int count = 2;
        String mode;
        if (args[0].equals("")) {
            mode = "enc";
        } else {
            mode = args[0];
        }
        System.out.println(mode);
        if (mode.equals("enc")) {
            String input = args[1];
            String key = args[2];
            int finakey = Integer.parseInt(key);
            String encrypt = encryption.encryption(input, finakey);
            System.out.println(encrypt);
        } else if (mode.equals("dec")) {
            String input = args[1];
            int key = Integer.parseInt(args[2]);
            String decryption1 = decryption.decryption(input, key);
            System.out.println(decryption1);

        }

    }

}

