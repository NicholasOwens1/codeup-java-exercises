import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {
    public static void main(String[] args) {
//      Create a list of games. The Arrays.asList method turns the array into a list.
        List<String> gameList = Arrays.asList("Dead Cells", "DBZ Fighterz", "Monster Hunter: World", "Guilty Gear: Strive");

//      Create variables for the directory name and file name
        String directory = "I AM HERE";
        String filename = "table.csv";
//      Create variables for the paths to the directory and filename variables
        Path newDataDirectory = Paths.get(directory);
        Path newDataFile = Paths.get(directory, filename);
//      If the dataDirectory file doesn't exist, try to create it. If it does, throw an exception.
if (Files.notExists(newDataDirectory)) {
        try {
            Files.createDirectories(newDataDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//      If the dataFile path doesn't exist, try to create it. If it does exist, throw an error.
if (! Files.exists(newDataFile)) {
        try {
            Files.createFile(newDataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
}