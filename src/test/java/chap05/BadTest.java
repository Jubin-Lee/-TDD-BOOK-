package java.chap05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BadTest {
    private FileOperator op = new FileOperator();
    private stastic File file; // 두 테스트가 데이터를 공유할 목적으로 필드 사용

    @Test
    void fileCreationTest() {
        File createdFile = op.createFile();
        assertTrue(createdFile.length() > 0);
        this.file = createdFile;
    }
}
