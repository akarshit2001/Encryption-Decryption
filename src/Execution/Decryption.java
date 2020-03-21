package Execution;

public class Decryption {


    public String decryption(String encrypt, int shift) {
        String decryption = "";
        for (int i = 0; i < encrypt.length(); i++) {
            if (Character.isUpperCase(encrypt.charAt(i))) {
                char character = encrypt.charAt(i);
                int b = (int) character;
                int n = ((b - shift - 65) % 26 + 65);

                decryption = decryption + Character.toString((char) n);

                // System.out.println(encryption);
            } else if (Character.isLowerCase(encrypt.charAt(i))) {
                char character = encrypt.charAt(i);
                int b = (int) character;
                int n = ((b - shift - 97) % 26 + 97);

                decryption = decryption + Character.toString((char) n);


            }
        }
        return decryption;
    }
}
