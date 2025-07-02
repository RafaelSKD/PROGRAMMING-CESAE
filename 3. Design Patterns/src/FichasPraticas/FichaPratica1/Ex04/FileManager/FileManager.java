package FichasPraticas.FichaPratica1.Ex04.FileManager;

import java.io.File;
import java.io.IOException;

public class FileManager {
    private static FileManager fileManager;
    private String rootDirectory;

    private FileManager() {
    }

    public static FileManager getInstance(){
        if (fileManager == null){
            fileManager = new FileManager();
        }
        return fileManager;
    }

    public void setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    public void createFile(String fileName) throws IOException {
        String local = "src/FichasPraticas/FichaPratica1/Ex04" + this.rootDirectory + "/" + fileName;
        File file = new File(local);
        file.getParentFile().mkdirs();
        file.createNewFile();
    }

    public void deleteFile(String fileName) {
        String local = "src/FichasPraticas/FichaPratica1/Ex04" + this.rootDirectory + "/" + fileName;
        File file = new File(local);
        file.delete();
    }
}
