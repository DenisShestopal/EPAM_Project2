package TextFormation.TextWorker;

import TextFormation.FileWorker.FileWorker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Deniska on 7/1/2016.
 */
public class Text {
    private String text;
    private List<Sentence> sentencesList;
    private List<Word> wordList;


    public Text(String fileName) {
        this.text = FileWorker.read(fileName);
        String[] s = changeSpaces().split("(?<=([.?!]\\s))");//(?=[A-Z])

        //code testing
        /*for (String str : s){
            System.out.println(str.toString());
        }*/

        this.sentencesList = new ArrayList<Sentence>();
        for (int i = 0; i < s.length; i++) {
            sentencesList.add(new Sentence(s[i]));
        }

        String tempString = changeSpaces().replaceAll("[\\!|\\?\\.\\:|\\(|\\)|\\,]", "");
        tempString = tempString.replaceAll("\\s+", " ");

        String [] s2 = tempString.split(" ");
        this.wordList = new ArrayList<Word>();
        for (int i = 0; i < s2.length; i++) {
            wordList.add(new Word(s2[i]));
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    public String changeSpaces() {
        text = text.replaceAll("[.]{4,}|\\s+", " ");
        return text;
    }

    public void sortSentences() { //by length

        Collections.sort(sentencesList);

        for (Sentence sentence : sentencesList) {
            System.out.println(sentence.getSentenceS());
        }

    }

    public void sortWords() {
        String[] s = new String[wordList.size()];

        for (int i = 0; i < s.length; i++) {
            s[i] = wordList.get(i).getWordS().toLowerCase();
        }

        Arrays.sort(s);

        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].toCharArray()[0] == s[i + 1].toCharArray()[0]) {
                System.out.print(s[i] + " ");
            } else {
                System.out.println();
            }
        }
    }
}
