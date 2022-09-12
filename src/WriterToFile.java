import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriterToFile {
    public static void writeInfo(File file, String info) throws IOException {
        PrintWriter pw = new PrintWriter((new FileWriter(file, true)));
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        pw.append(nowDateTime.format(formatter) + "\n" + info);
        pw.println();
        pw.close();
    }

}
