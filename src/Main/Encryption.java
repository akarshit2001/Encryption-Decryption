package Main;

public class Encryption {
    public String encryption(String input, int shift) {

        System.out.println(input);
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = (char) ((int) (input.charAt(i)) + shift);
            s = s + Character.toString(ch);
        }


        return s;
    }
}
