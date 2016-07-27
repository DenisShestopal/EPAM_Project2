package TextFormation.TextWorker;

/**
 * Created by Deniska
 */
public class Sentence implements Comparable{
    private Word[] wordArray;
    private String sentenceS;

    public Sentence(String sentenceS){
        this.sentenceS = sentenceS;


        String symbolsOnly = this.sentenceS.replaceAll("\\W"," "); //any symbol, except numeric or char. or "_"
        symbolsOnly = symbolsOnly.replaceAll("\\d+", " "); // numeric symbol before element
        symbolsOnly = symbolsOnly.replaceAll("\\s+", " "); //space before element

        String[] s = symbolsOnly.split(" ");
        //test
        /*for(Symbol sym : symbolArray){
            System.out.println(sym.toString()+ " ");
        }*/

        wordArray = new Word[s.length];

        for (int i = 0; i < s.length; i++) {
            wordArray[i] = new Word(s[i]);
        }

    }

    public String getSentenceS() {
        return sentenceS;
    }

    public void setSentenceS(String strSent) {
        this.sentenceS = sentenceS;
    }


    public void printWords() {

        for (Word word : wordArray)
            System.out.println(word.getWordS());

    }

    @Override
    public int compareTo(Object obj) {
        Sentence s = (Sentence) obj;
        if (this.sentenceS.length() < s.sentenceS.length()) {
            return -1; // if <
        } else if (this.sentenceS.length() > s.sentenceS.length()) {
            return 1; // if >
        }
        return 0; // if equals
    }
}


/** using symbols
//private Symbol[] symbolArray;

 /*String wordsOnly = this.sentenceS.replaceAll("[\\p{Alpha}\\s]", "");
 this.symbolArray = new Symbol[wordsOnly.length()];

 for (int i = 0; i < this.symbolArray.length; i++) {
 symbolArray[i] = new Symbol(wordsOnly.charAt(i));
 }

 /*public void printSymbols() {

 for (Symbol symbol : symbolArray)
 System.out.println(symbol.getSymbol());

 }*/







