import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//        System.out.println(dataFile);
        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
                Files.createDirectories(dataDirectory);
            }
            if (Files.notExists(dataFile)) {
                try {
                    Files.createFile(dataFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        List<String> groceryList = Arrays.asList("coffee", "milk", "oreos");
        System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("peanut oil", "flour", "eggs");
            Files.write(dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Created grocery list.
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            for (int i = 1; i <= groceryListFromFile.size(); i+= 1) {
                System.out.println(i + ":" + groceryListFromFile.get(i-1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
                if(line.equals("Powdered Sugar")) {
                    hasPowderedSugar = true;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
//        if (!hasPowderedSugar) {
//            List<String> addPowderedSugar
        }
//        try {
//            List<String> lines = Files.readAllLines(dataFile);

    }
//    }
//}
