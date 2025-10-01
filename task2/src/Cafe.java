import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.charset.StandardCharsets; // <-- giver adgang til UTF_8

public class Cafe {

    // 1) Deklarér feltet rigtigt (stavet ens overalt)
    private final ArrayList<String> coffeeMenu = new ArrayList<>();

    // Getter
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }


    public void loadMenuData() {
        File file = new File("coffees.txt");

        // Hjælpeprint hvis stien er forkert
        if (!file.exists()) {
            System.out.println("Fandt ikke filen: " + file.getAbsolutePath());
        }


        try (Scanner scan = new Scanner(file, StandardCharsets.UTF_8)) {
            coffeeMenu.clear();
            while (scan.hasNextLine()) {
                String line = scan.nextLine().trim();
                if (!line.isEmpty()) {
                    coffeeMenu.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename: " + file.getAbsolutePath());
        }
    }
}
