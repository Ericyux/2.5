public class Board {
    private String phrase;
    private String solvedPhrase;
    private int currentLetterValue;

    public Board() {
        this.phrase = loadPhrase();
        this.solvedPhrase = initializeSolvedPhrase(phrase);
        setLetterValue();
        System.out.println("Phrase: " + phrase); //temp test code
    }

    // This method loads the phrase from the file (based on the given requirement)
    private String loadPhrase() {
        return "This Phrase";
    }
    
    private String initializeSolvedPhrase(String phrase) {
        StringBuilder sb = new StringBuilder();
        for (char c : phrase.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(' ');
            } else {
                sb.append('_');
                sb.append(' ');
            }
        }
        return sb.toString().trim();
    }

    private void setLetterValue() {
        this.currentLetterValue = 10;
    }

    public boolean guessletter(char guess) {
        // variable to hold whether the letter is in the word.
        boolean letterFound = false;
        // what we are going to replace solvedPhrase with
        String newPhrase = "";
        // loops through the phrase
        for (int i = 0; i < phrase.length(); i++) {
            //checks if the guessed character appears
            if (phrase.charAt(i) == guess) {
                // sets letterFound to be true
                letterFound = true;
                // displays the guessed letter
                newPhrase += guess;
            } else {
                // adds what was originally at the solvedPhrase
                newPhrase += solvedPhrase.charAt(2*i);
            }
            // adds the space
            newPhrase += " ";
        }
        // replaces solvedPhrase
        solvedPhrase = newPhrase;
        // returns if the letter was in the phrase
        return letterFound;
    }
}
