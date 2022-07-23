import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String str = " ";
        try {
            fileWriter = new FileWriter("MainTestFile.txt");

            fileWriter.write("Test");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
