import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TaskOne {
    public static String content;

    public static void readFileContent(String path) {
        Path filePath = Paths.get(path);

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(line -> content += line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<String> putTheArrayInSet() {
        Set<String> contentSet = new HashSet<>();
        Collections.addAll(contentSet, content.split("\\W+"));
        return contentSet;
    }
}