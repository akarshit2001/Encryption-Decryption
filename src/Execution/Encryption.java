package Execution;

public class Encryption {
    public String encryption(String input, int shift) {
        String encryption = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                char character = input.charAt(i);
                int b = (int) character;
                int n = ((b + shift - 65) % 26 + 65);
                encryption = encryption + Character.toString((char) n);

                // System.out.println(encryption);
            } else if (Character.isLowerCase(input.charAt(i))) {
                char character = input.charAt(i);
                int b = (int) character;

                int n = ((b + shift - 97) % 26 + 97);
                encryption = encryption + Character.toString((char) n);


            } else {
                encryption = encryption + Character.toString(input.charAt(i));
            }
        }
        return encryption;
    }
}
