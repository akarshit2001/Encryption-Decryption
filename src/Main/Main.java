package Main;
public class Main {
    public static void main(String[] args) {
/**
 * textIndexMode is used for mode.
 * testIndexData is used for data.
 * testIndexKey is used for key.
 */
        int testIndexMode = index(args, "-mode");
        int testIndexData = index(args, "-data");
        int testIndexKey = index(args, "-key");
        String finalMode;
        /**
         * if an exception will occur then finalMode is initialized with "enc".
         * otherwise stored the input value.
         */
        try {
            if (testIndexMode == -1) {
                throw new NullPointerException();
            }
            /*
             * textIndexMode+1 is used to store the value in next Index ,if textIndexMode !=-1.
             */
            finalMode = args[testIndexMode + 1];
        } catch (NullPointerException e) {
            finalMode = "enc";
        }
        /**
         * if an exception will occur then finalData is initialized with "".
         * otherwise stored the input value.
         */
        try {
            if (testIndexData == -1) {
                throw new NullPointerException();
            }
            /*
             * textIndexData+1 is used to store the value in next Index ,if textIndexData !=-1.
             */
            String finalData = args[testIndexData + 1];

        } catch (NullPointerException e) {
            String finaldata = "";
        }

        String finalData = args[testIndexData + 1];

        int finalKey;
        /**
         * if an exception will occur then finalKey  is initialized with "0".
         * otherwise stored the input value.
         */
        try {
            if (testIndexKey == -1) {
                throw new NullPointerException();
            }
            /**
             * to convert the string value into integer we use Integer.parseInt().
             * textIndexKey+1 is used to store the value in next Index ,if textIndexKey !=-1.
             */
            finalKey = Integer.parseInt(args[testIndexKey + 1]);

        } catch (NullPointerException e) {
            finalKey = 0;
        }
        Decryption decryption = new Decryption();
        Encryption encryption = new Encryption();
        String mode = finalMode;
        if (mode.equals("enc")) {
            String input = finalData;
            /* pass the input and final key into the encryption method.*/
            String encrypt = encryption.encryption(input, finalKey);
            /* print the encrypt data*/
            System.out.println(encrypt);
        } else if (mode.equals("dec")) {
            String input = finalData;
            /* pass the input and final key into the decryption method.*/
            String decryption1 = decryption.decryption(input, finalKey);
            // print the decrypted value//
            System.out.println(decryption1);

        }

    }

    /**
     * @param arr        array of string type is passed.
     * @param searchTerm string parameter is passed to match the array's element.
     * @return an integer value .
     */
    static int index(String[] arr, String searchTerm) {
        int response = -1;
        int count = 0;
        /*
         * using this loop to traverse the element of array and simultaneously match to the search term
         * If match found then  value of count stored in response.
         * else increment the count.
         */
        for (String test :
                arr) {
            if (test.equals(searchTerm)) {
                response = count;
            } else {
                count++;
            }
        }
        return response;
    }

}