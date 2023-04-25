import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLesson {
    public static void main(String[] args) {

//      Create variables for the directory name and file name
        String directory = "info";
        String filename = "table.csv";
//      Create variables for the paths to the directory and filename variables
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//      If the dataDirectory file doesn't exist, try to create it. If it does, throw an exception.
if (Files.notExists(dataDirectory)) {
        try {
            Files.createDirectories(dataDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//      If the dataFile path doesn't exist, try to create it. If it does exist, throw an error.
if (! Files.exists(dataFile)) {
        try {
            Files.createFile(dataFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }
}