package UseOfFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        String filePath = "aaa.txt";

        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        // BufferedWriter 생성
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        writer.write("hello there!");
        writer.newLine();
        writer.write("good to see you.!");
        writer.newLine();

        // 버퍼 및 스트림 뒷정리
        //writer.flush(); // 버퍼의 남은 데이터를 모두 쓰기
        writer.close(); // 스트림 종료 }

    }
}
