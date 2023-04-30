import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson2Method {
    public static void fileMaker() throws IOException {


        String directory = "shelf";
        String gamesFile = "games";
        //  Create Path objects to give locations to the game directory and games file.
        Path gameDirectory = Paths.get(directory);
        Path gameFile = Paths.get(directory, gamesFile);



    //  Create an array of games turned into a list
    List<String> gameList = Arrays.asList("Dead Cells", "DBZ Fighterz", "Monster Hunter: World", "Guilty Gear: Strive");
    //  Create a path to the file you want to write the info to. The first parameter of Paths.get is the name of the directory,
//  the second parameter is the name of the file.
    Path filepath = Paths.get("data", "games.csv");
//  Write the list to the file using Files.write. The first parameter is the filepath you created,
//  the second parameter is the data to be written.
        if (Files.notExists(gameDirectory)) {
        try {
            Files.createDirectory(gameDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        if (Files.notExists(gameFile)) {
        try {
            Files.createFile(gameFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        try {
        Files.write(gameFile, gameList);
    } catch (IOException e) {
        e.printStackTrace();
    }
    Path gamesPath = Paths.get("shelf", "games");
    List <String> gamesList = Files.readAllLines(gamesPath);
//        for (int i = 0; i < gamesList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + gamesList.get(i));
//        }
        gamesList.add("Pokemon: Crystal");
    Files.write(
            Paths.get("shelf", "games"),
            Arrays.asList("Pokemon: Crystal"),
    StandardOpenOption.APPEND);
        for (int i = 0; i < gamesList.size(); i += 1) {
        System.out.println((i + 1) + ": " + gamesList.get(i));

    }}}
