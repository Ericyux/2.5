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
}
