import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Clear {
    public static void main(String[] args) {
        String source = "MainTemplate.txt";
        String target = "Main.java";
        Path sourceFile = Paths.get(source);
        Path targetFile = Paths.get(target);
        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}