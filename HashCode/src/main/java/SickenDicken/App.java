package SickenDicken;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 * see file resources/log4j2.xml for configuration options
 * and A1.log containing debugging output.
 */

public class App {
    private static Logger log = LogManager.getLogger(App.class);
    static File file = new File("HashCode/input_data/b_basic.in.txt");

    public static void main( String[] args ) throws IOException {
        readAllCharactersOneByOne(new FileReader(file));
    }

    public static String readAllCharactersOneByOne(Reader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            content.append((char) nextChar);
        }
        System.out.println(String.valueOf(content));
        return String.valueOf(content);
    }
}
