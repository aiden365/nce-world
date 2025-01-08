package com.test;

import cn.hutool.Hutool;
import cn.hutool.core.util.ClassLoaderUtil;
import cn.hutool.core.util.ClassUtil;
import com.book.Sw;
import com.book.SwChinese;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static com.words.TestFour4.*;
import static com.words.TestCz.*;
import static com.words.TestFour3.*;
import static com.words.TestFour8.*;
import static com.words.TestFour11.*;
import static com.words.TestFour9.*;
import static com.words.TestFour5.*;
import static com.words.TestFour2.*;
import static com.words.TestGz.*;
import static com.words.TestFour1.*;
import static com.words.TestFour6.*;
import static com.words.TestFour10.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour7.*;


@Slf4j
public class Main {



    @SneakyThrows
    public static void main(String[] args) {
        //have control over sth. 控制，支配。其中control是名词，作名词是通常加介词，如over + 介宾 表示控制的对象
        //dress up [vi.] 打扮的漂漂亮亮的，可接for、as引导的状语，如she likes to dress up for a party
        //ever [adv.] 在否定句中加强否定表示永远不，在肯定剧中加强肯定表示确实...
        //attire in [vt.] 穿上...，类似的还有 put on，wear，
        //in [adj. / n.] terms 译为从...角度来看，例如in the long terms, in relative terms，in the present terms，也可以写成in terms of + [介词宾语] 例如in terms of how people feel
        //disguised as sth. [np.] 伪装成...，也可以用动词形式 V. disguise A as A1
        //breach [vt.] 突破，
        //
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        // He also drinks three barrels of beer.
        // This astonishes Thrym. The true identity of the “commandos” is very nearly revealed.
        // But Loki manages to avert the danger by explaining that Freyja has been looking forward to coming to jotunheim so much that she has not eaten for a week. When Thrym lifts the bridal veil to kiss the bride, he is startled to find himself looking into Thor’s burning eyes.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            Sw.sector1();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Sw.sector1();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test66() {

        ClassUtil.scanPackage("com.words").stream().map(Class::getName).forEach(e -> System.out.println("import static " + e + ".*;"));

    }
}
