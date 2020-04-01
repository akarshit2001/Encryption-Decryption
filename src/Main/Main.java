package Main;


public class Main {
    public static void main(String[] args) {
        int testIndexMode=index(args,"-mode");
        int testIndexData=index(args,"-data");
        int testIndexKey=index(args,"-key");
        String finalMode;
        try{
            if(testIndexMode==-1){
                throw new NullPointerException();
            }
            finalMode=args[testIndexMode+1];}
        catch (NullPointerException e){
            finalMode ="enc";
        }

        String finalData=args[testIndexData+1];

        int finalKey;
        try {
            if (testIndexKey==-1){
                throw new NullPointerException();
            }
            finalKey = Integer.parseInt(args[testIndexKey + 1]);

        }
        catch (NullPointerException e){
            finalKey=0;
        }


        Decryption decryption = new Decryption();
        Encryption encryption = new Encryption();
        String mode = finalMode;
        if (mode.equals("enc")) {
            //System.out.println("Enter the string thar you want to encrypt");
            String input = finalData;

            //System.out.println("Enter the key");
            String encrypt = encryption.encryption(input, finalKey);
            System.out.println("/"+encrypt);
        } else if (mode.equals("dec")) {
            //System.out.println("Enter the string thar you want to decrypt ");
            String input = finalData;

            //System.out.println("Enter the key");
            String decryption1 = decryption.decryption(input, finalKey);
            System.out.println("/"+decryption1);

        }

    }

    static int index(String[] arr,String searchTerm){
        int response=-1;
        int count=0;
        for (String test:
                arr) {
            if(test.equals(searchTerm)){response=count;}
            else {count++;}
        }
        return response;
    }

}
