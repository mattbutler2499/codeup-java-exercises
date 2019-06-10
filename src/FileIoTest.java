//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class FileIoTest {
//    public static void main(String[] args) {
//        String folder = "data";
//        String filename = "info.txt";
//
//        Path dataFolder = Paths.get(folder);
//        Path dataFile = Paths.get(folder, filename);
//
//        if (Files.notExists(dataFolder)) {
//            try {
//                Files.createDirectories(dataFolder);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        if (!Files.exists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        List<String> videoGameList = Arrays.asList("Fortnite", "League of Legends", "Call of Duty");
//        Path filepath = Paths.get(folder, filename);
//        try {
//            Files.write(filepath, videoGameList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Path videoGamesPath = Paths.get(folder, filename);
//        List<String> videoGamesList = null;
//        try {
//            videoGamesList = Files.readAllLines(videoGamesPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < videoGameList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + videoGamesList.get(i));
//        }
//
//        try {
//            Files.write(
//                    Paths.get(folder, filename),
//                    Arrays.asList("PUBG"), // list with one item
//                    StandardOpenOption.APPEND
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> lines;
//        try {
//            lines = Files.readAllLines(Paths.get(folder, filename));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<String> updatedVideoGamesList = new ArrayList<>();
//        for (String line : lines) {
//            if (line.equalsIgnoreCase("PUBG")) {
//                updatedVideoGamesList.add("HUBBA HUBBA");
//            }
//        }
////            updatedVideoGamesList.add(lines){
//
//        }
//    }
//}
