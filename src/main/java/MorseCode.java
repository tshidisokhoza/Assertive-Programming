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

    public String lettersToMorseCode(String inputWord) {
        String input = inputWord.toLowerCase();
        String morseWord = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < english.length; j++) {

                if (english[j] == input.charAt(i)) {
                    morseWord = morseWord + morse[j] + " ";
                }
            }


        }
        assert morseWord.length() == inputWord.split(" ").length;
        return morseWord;
    }



    public String morseCodeToLetters(String inputMorse) {
        String englishWord = "";
        String input []= inputMorse.split(" ");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < morse.length; j++) {

                if (morse[j].equals(input[i])) {
                    englishWord = englishWord + english[j] ;
                }
            }


        }
        assert inputMorse.length() == englishWord.split(" ").length;
        return englishWord;

    }
}

