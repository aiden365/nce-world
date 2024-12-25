package com.test;

import com.alibaba.fastjson.JSONObject;
import com.book.SophiesWorld;
import com.neclesson.ThirdVolume;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.words.TestCz.*;
import static com.words.TestGz.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour1.*;
import static com.words.TestFour2.*;
import static com.words.TestFour3.*;
import static com.words.TestFour4.*;
import static com.words.TestFour5.*;
import static com.words.TestFour6.*;
import static com.words.TestFour7.*;
import static com.words.TestFour8.*;
import static com.words.TestFour9.*;
import static com.words.TestFour10.*;
import static com.words.TestFour11.*;

@Slf4j
public class Main {



    @SneakyThrows
    public static void main(String[] args) {
        //make it +adj +to do make it easy to learn
        //动词 + one's way + 介词短语
        //remind sb of sth 使某人想起…；提醒某人…
        for (int i = 1; i <= 11; i++) {
            log.info("import static com.words.TestFour"+i+".*;");
        }
    }


    @Test
    public void main2() {
        //Where does the world come from? She hadn’t the faintest idea.
        //Sophie knew that the world was only a small planet in space.

        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            SophiesWorld.sector1();
            bliss();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
