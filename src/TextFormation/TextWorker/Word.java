package TextFormation.TextWorker;

/**
 * Created by Deniska
 */
public class Word {

    private String wordS;

    public Word(String s){
        this.wordS = s;


    }
    public String getWordS() {
        return wordS;
    }

    public void setWordS(String wordS) {
        this.wordS = wordS;
    }



}


/**using symbols
 *
 *
 *  private Symbol[] symbols;
 *
 *  this.symbols = new Symbol[wordS.length()];
 *  for(int i = 0; i < symbols.length; i++){
 *  symbols[i] = new Symbol(wordS.charAt(i));}
 *
 *  public void printSymbols() {
 *  for (Symbol symbol : symbolArray)
 *  System.out.println(symbol.getSymbol());}

*/
