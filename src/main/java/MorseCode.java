import sun.jvm.hotspot.utilities.Assert;

public class MorseCode {
    private char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?',' '};

    private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..","/"};

    public String lettersToMorseCode(String inputt) {
        String input = inputt.toLowerCase();
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < english.length; j++) {

                if (english[j] == input.charAt(i)) {
                    word = word + morse[j] + " ";
                }
            }


        }
        return word;
    }



    public String morseCodeToLetters(String inputt) {
        String word = "";
        String input []= inputt.split(" ");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < morse.length; j++) {

                if (morse[j].equals(input[i])) {
                    word = word + english[j] ;
                }
            }


        }

        return word;

    }
}

