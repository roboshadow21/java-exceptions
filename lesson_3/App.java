package homework.lesson_3;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Person ps = new Person();
        String fileName;
        String text = ps.getUserFuLlInfo().toString();
        fileName = ps.getUserFuLlInfo().get(2);
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(text);
        }


    }
}
