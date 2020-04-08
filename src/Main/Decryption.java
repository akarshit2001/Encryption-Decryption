package Main;

public class Decryption {
    /**
     * @param encrypt string pass from user .
     * @param shift   integer by which each letter will be shifted.
     * @return string which is decrypt.
     */

    public String decryption(String encrypt, int shift) {
        String decryption = "";
        // this loop is used to traverse each character of string and decrement it's ascii value by their shift key.

        for (int i = 0; i < encrypt.length(); i++) {
            char character = (char) ((int) (encrypt.charAt(i)) - shift);
            decryption = decryption + Character.toString(character);

        }
        return decryption;
    }
}
