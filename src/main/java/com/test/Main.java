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
        //能够引导非限定性定语从句的关系代词={as,which,who,whom}，关系副词={when,where}
        //to do with Thor 译与...有关
        //call sth1 of sth2 称呼sth1为sth2
        //Within Midgard lay Asgard 倒装句 强调主语在midgard之内
        //resorted [vi.] 与to连用表示采用某种手段或方法
        //refer to A as B 把A称作B
        //to hold something in check 表示对某事物或某人进行控制或抑制，以防止其过度发展或产生负面影响，例如 the one of the vital ways of taking success was to hold ourselves temper in check
        //His hammer could do more than make rain 这句话中do是中心谓语动词，make之所以用动词原型，它是不带to的动词不定式，虽然这是一个固定搭配，英语中有一些动词后若跟不定式做宾语补足语，余姚使用不带to的不定式形式，如四看：notice, observe, see, watch 三使役：have, let, make 二听：hear, listen to 一感觉：feel 半帮助：help 例如：I saw him leave the house
        //struggle against 与...做斗争
        //sit by [vi.] 坐视不管，等价于sit on one`s hands 例如，we can not [sit by / sit on our hands] and do nothing about these problems
        //make sth. to sb. 给某人某物，等价于offer sth. to sb.或offer sb. sth.
        //offer to do sth. 主动去做某事
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        // This they did by performing various religious ceremonies, or rites.
        // The most significant religious ceremony in Norse times was the offering.
        // Making an offering to a god had the effect of increasing that god’s power.
        // For example, mortals had to make offerings to the gods to give them the strength to conquer the forces of chaos.
        // They could do this by sacrificing an animal to the god.
        // The offering to Thor was usually a goat.
        // Offerings to Odin sometimes took the form of human sacrifices.
        // The myth that is best known in the Nordic countries comes from the Eddie poem “The Lay of Thrym.”
        // It tells how Thor, rising from sleep, finds that his hammer is gone.

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
