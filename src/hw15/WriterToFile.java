package hw15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterToFile {
    public static void writeText(File file, String text) throws IOException {
        PrintWriter pw = new PrintWriter(file);
        pw.append(text);
        pw.println();
        pw.close();
    }

}
