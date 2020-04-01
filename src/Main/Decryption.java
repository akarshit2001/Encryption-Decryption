package Main;

public class Decryption {


    public String decryption(String encrypt, int shift) {
        String decryption = "";

        for (int i = 0; i < encrypt.length(); i++) {
            char ch = (char) ((int) (encrypt.charAt(i)) - shift);
            decryption = decryption + Character.toString(ch);

        }
        return decryption;
    }
}
