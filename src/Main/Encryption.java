package Main;

public class Encryption {
    /**
     * @param input is the data given by user to encrypt .
     * @param shift is the key which tells by how much each letter to be shifted.
     * @return the string which is now encrypted.
     */
    public String encryption(String input, int shift) {


        String string = "";

        // this loop is used to traverse each character of string and increment it's ascii value by their shift key.
        for (int i = 0; i < input.length(); i++) {
            char ch = (char) ((int) (input.charAt(i)) + shift);
            string = string + Character.toString(ch);
        }


        return string;
    }
}
