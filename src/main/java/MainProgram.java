public class MainProgram {
    public static void main(String[] args) {
        

        MorseCode morse = new MorseCode();
        System.out.println(morse.lettersToMorseCode("hi there"));
        System.out.println(morse.morseCodeToLetters(".... .. / - .... . .-. ."));

    }

}
