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
        // Here, you'll add code to read from the phrase.txt file and return the phrase.
        // For the purpose of this example, I'll return a dummy string.
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
        // Here, you'll add the logic to set the currentLetterValue.
        // For the purpose of this example, I'll set a dummy value.
        this.currentLetterValue = 10;
    }
}
