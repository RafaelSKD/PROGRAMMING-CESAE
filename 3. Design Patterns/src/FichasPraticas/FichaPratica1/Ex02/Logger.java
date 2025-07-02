package FichasPraticas.FichaPratica1.Ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger;
    private String fileName;

    private Logger(String loggerFile) {
        this.fileName = loggerFile;
    }

    public static synchronized Logger getInstance(String name) {
        if (logger == null) {
            logger = new Logger(name);
        }
        return logger;
    }

    public void log(String message) throws IOException {
        String local = "src/FichasPraticas/FichaPratica1/Ex02/Ficheiro/" + fileName;
        File file = new File(local);
        FileWriter writer = new FileWriter(file, true);
        writer.write(message + "\n");
        writer.close();
    }
}
