package Execution;

public class Working {
    public void encryption(String input, int shift) {
        String encryption = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                char character = input.charAt(i);
                int b = (int) character;
                int n = ((b + shift - 65) % 26 + 64);

                encryption = encryption + Character.toString((char) n);

                // System.out.println(encryption);
            } else if (Character.isLowerCase(input.charAt(i))) {
                char character = input.charAt(i);
                int b = (int) character;
                int n = ((b + shift - 97) % 26 + 94);

                encryption = encryption + Character.toString((char) n);


            }
        }
        System.out.println(encryption);
    }
}
