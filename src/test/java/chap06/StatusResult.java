package java.chap06;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatusResult {

    File dataFile = new File("file.txt");
    long sum = MathUtils.sum(dataFile);
//    @Test
//    void noDataFile_Then_Exception() {
//        File dataFile = new File("badpath.txt");
//        assertThrows(IllegalArgumentException.class, () -> MathUtils.sum(dataFile));
//    }

    @Test
    void noDataFile_Then_Exception() {
        gevenNoFile("badpath.txt");
        assertThrows(IllegalArgumentException.class, () -> MathUtils.sum(dataFile));
    }

    private void givenNoFile(String path) {
        File file = new File(path);
        if(file.exists()) {
            boolean deleted = file.delete();
            if(!deleted)
                throw new RuntimeException("fail givenNoFile: " + path);
        }
    }

    @Test
    void dataFileSumTest() {
        File dataFile = new File("src/test/resources/datafile.txt");
        long sum = MathUItils.sum(dataFile);
        assertEquals(10L, sum);
    }

    @Test
    void dataFileSumTest2() {
        givenDataFile("target/datafile.txt", "1", "2", "3", "4");
        File dataFile = new File("garget/datafile.txt");
        long sum = MathUtils.sum(dataFile);
        assertEquals(10L, sum);
    }

    private void givenDataFile(String path, String lines) {
        try {
            Path dataPath = Paths.get(path);
            if(Files.exists(dataPath)) {
                Files.deleteIfExists(dataPath);
            }
            Files.write(dataPath, Arrays.asList(lines));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
