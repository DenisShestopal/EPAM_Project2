package TextFormation.FileWorker;

import TextFormation.TextFormation;
import org.omg.SendingContext.RunTime;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deniska on 6/30/2016.
 */
public class FileWorker {

    public String text;

    public FileWorker(String name) {
        this.text = read(name);
    }

    public static String read(String fileName) {


        String text = "";
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName));

            while (r.ready()) {
                text += r.readLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
