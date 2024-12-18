package com.test;

import com.lesson.third.ThirdLesson37;
import com.word.ThirdWord;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static com.words.TestCz.*;
import static com.words.TestGz.*;
import static com.words.TestFour.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;


@Slf4j
public class Main {


    @SneakyThrows
    public static void main(String[] args) {
        String property = System.getProperty("user.dir");
        File file = new File("E:\\workspace\\java\\nce-world\\doc\\annotation");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        String line = "";
        log.info("/**");
        while((line = bufferedReader.readLine()) != null){
            log.info("     * @a" + line);
        }
        log.info("*/");
    }


    @Test
    public void main2() {
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            apology();




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
