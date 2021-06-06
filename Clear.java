import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.FileSystemException;

public class Clear {
    public static void main(String[] args) throws IOException {
        String source = "MainTemplate.txt";
        String target = "Main.java";
        try {
            Path sourceFile = Paths.get(source);
            Path targetFile = Paths.get(target);
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileSystemException e) {
            System.out.println("\n\n\t" + source + "\n\nもしくは\n\n\t" + target + "\n\nが開かれている可能性があります。");
            System.out.println("\n\n上記のファイルを閉じてから再度実行してください。");
            System.exit(1);
        }
    }
}
