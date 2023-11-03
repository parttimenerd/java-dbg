import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LineCounter {

    // Count lines in a file
    public static void main(String[] args) throws IOException {
        Path file = Path.of(args[1]);
        int count = switch (args[0]) {
            case "lines" -> countLines(file);
            case "code_lines" -> countCodeLines(file);
            default -> {
                System.err.println("Usage: java ... " +
                        "<lines|code_lines> <file>");
                System.exit(1);
                yield 0;
            }
        };
        System.out.println("Counting " + args[0] +
                " " + count);
    }

    public static int countLines(Path file) throws IOException {
        return Files.readAllLines(file).size();
    }

    public static int countCodeLines(Path file) throws IOException {
        int count = 0;
        for (String line : Files.readAllLines(file)) {
            if (!line.isBlank() && !line.startsWith("//")) {
                count++;
            }
        }
        return count;
    }
}