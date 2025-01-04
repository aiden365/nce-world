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


        //No doubt about it  [n.] 毫无疑问，there is no doubt about it 那是毫无疑问的
        //everyday existence [n.] 日常生活
        //push sb. into [sp. / sth.] 把某人推向某地
        //take it for granted : 把…当成理所当然
        //lull [v./n.] 动词搭配：lull sb. into. sth 使人放松警惕或产生某种感觉；lull sb. to sleep 哄某人入睡。名词搭配：a lull in sth 指某件事情中的和平期或者间歇期
        //once and for all. 一劳永逸地，最后一次的
        //in other words 换句话说
        //put it another way 换句话说
        //deep down [adv.] 在深处，不仅仅是精神上的内心深处，可以加介词in来说明具体的物理上的位置，例如deep down in the woods 森林深处
        //in a minute [adv.] 立即，马上
        //do也可以用在陈述句中用于强调动词，通常表示确实、的确，具有澄清或反驳的作用。例如，she does like apples
        //mixed [in/up] with sth. 和…混在一起
        //bring up [vt.] 提出
        //just about [adv.] 几乎
        //precarious [adj.] 岌岌可危的，不稳定的
        //breaks 之所以加s是因为不止一个课间休息
        //an eternity [n.] 表达一个时间概念，表示永远、永无止境的时间
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }




    @Test
    public void main2() {
        // On the way home they talked about going camping as soon as the woods were dry enough.
        // After what seemed an eternity she was once again at the mailbox.
        // First she opened a letter postmarked in Mexico. It was from her father.
        // He wrote about how much he was longing for home and how for the first time he had managed to beat the Chief Officer at chess. Apart from that he had almost finished the pile of books he had brought aboard with him after his winter leave. And then, there it was—a brown envelope with her name on it! Leaving her schoolbag and the rest of the mail in the house, Sophie ran to the den. She pulled out the new typewritten pages and began to read: THE MYTHOLOGICAL WORLD PICTURE Hello there, Sophie! We have a lot to do, so we’ll get started without delay.
        drum();
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
