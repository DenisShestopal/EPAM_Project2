package TextFormation;

import TextFormation.TextWorker.Text;


/**
 * Created by Deniska
 *
 *
 */
public class TextFormation {
    public static void main (String ... args){
        String fileName = "C:\\Users\\Deniska\\IdeaProjects\\Project2\\src\\TextFormation\\FileWorker\\java2.txt";
        Text newText = new Text(fileName);
        newText.sortWords();
        newText.sortSentences();
    }
}
