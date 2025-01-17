package com.test;

import cn.hutool.Hutool;
import cn.hutool.core.util.ClassLoaderUtil;
import cn.hutool.core.util.ClassUtil;
import com.book.Sw;
import com.book.SwChinese;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.hamcrest.core.Every;
import org.junit.Test;

import java.io.*;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

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
        //in the direction of 朝...方向，沿...方向
        //现在分词除了可以做伴随状语还可以做结果状语，常搭配thereby + 现在分词构成结果状语从句，例如he has redesigned the workflow thereby rising work efficiency
        //of what the natural philosophers said and wrote 做
        //what 除了可以引导名词性疑问分句，做疑问代词例如I am not sure what you mean，或疑问限定词例如Do you know what excuse he gave。还可以引导名词性关系分句，它相当于the thing that + 定语从句，做融合型关系代词，例如What (=the thing that) we need is a commitment。又可以做融合型关系限定词，仅限定不可数名词或可数名词复数的形式，虽意为“全部”，但暗含little、few之意，译为“仅有的全部”，例如1what little (=the little money that) he had spent on study. 2what little free time (= the little free time that) he had was spent with his wife and children。
        //he 做代词除了表示他，还可以表示无生命物体的事物
        //it is likely + [(to do) / (that + 从句)] 译为：可能...
        //full of 译为：充满...
        //mean sth1. by sth2. 通过某物(sth2)表达某种意思(sth1)，或者某物(sth2)的意思是某意思(sth1)，例如:what do you mean by happiness? I mean health by happiness
        //In the way that 以...方式
        //that which 可以将that单纯的理解成代词并做后面which定语从句的先行词，然后which引导定语从句去补充说明that的信息呢，这样有点像一个what做融合性关系代词
        //anything常用于否定句中
        //familiar with 熟悉，熟知。注意不要和similar to 搞混，后者表示与...相似
        //even more [adv.] 更加，进一步
        //a far cry from  与...有很大差别、有天壤之别
        //as 指处于某种状态、 性质、情况、工作等之中
        //either 这里的either只是用来强调而这只能选择一个，也可以写成to choose between either relying on his senses or his reason, he chose reason.
        //equate a with b 把a和b视为相等
        //tally with 与...一致
        //perceptual knowledge 感性认识
        //a contemporary of sb. 与某人同时代。例如he is a contemporary of Einstein
        //for the + 序数词 + time 表示第几次
        //know 表示经历，例如 she had known both happiness and sadness
        //take [(a) / (no)] pleasure in sth. 从...中得到乐趣，she take a pleasure in reading books，类似的还有she take a living by selling books
        //full [adj.] 吃饱的
        //hydrogen and oxygen are part of water 可以理解为 氢和氧是水的一部分，或者氢和氧属于水，或者由氢和氧构成的水
        //be present in sp. 存在于某处，其中present是形容词
        //in a sense 在某种意义上，in a broad sense 在广义上，in a narrow sense 在狭义上
        //loosen 可以指“使某物从某个地方分离”或“使其松动”
        //and so on / and so forth 用在句尾表示等等，诸如此类，例如the holder
        //something of everything 译为每种事物的一部分，或者不同事物的某些元素。也可以将everything看作代词，代词身体部位，那就译为身体所有部位的一部分，
        //heavenly [adj.] 天上的。heavenly body 天体
        //unlikely [adv.] 不太可能地。it is unlikely 这不太可能。it is not unlikely 这不是不可能地
        //cost sb. no sth. 译为某人不需要花费任何东西，例如It cost him no money，它不需要花任何钱
        //other than [prep.] 除了...之外
        //common sense [n.] 常识
        //change in 在...方面改变，但在这里in应该译为以任何形式的变化
        //in a way [adv.] 在一定程度上
        //to come right out and (to) do sth. 直截了当的做某事
        //the way [conj.] 从属连词 译为用...的方法，
        //after all 位于句首译为毕竟，位于句尾译为终究
        String aa = "E:\\workspace\\java\\nce-world\\doc\\aa.txt";
        try(FileOutputStream os = new FileOutputStream(new File(aa))){
            os.write("hello".getBytes(StandardCharsets.UTF_8));
            os.flush();
        }

    }


    @Test
    public void main2() {
        // She crawled out of the den and stood for a while looking across the garden.
        // She thought about what happened yesterday.
        // Her mother had teased her about the “love letter” again at breakfast this morning.
        // She walked quickly over to the mailbox to prevent the same thing from happening today. Getting a love letter two days in a row would be doubly embarrassing.
        String filePath = System.getProperty("user.dir").concat("/temp/lock.txt");
        try (FileChannel open = FileChannel.open(Path.of(filePath), StandardOpenOption.WRITE)){
            FileLock fileLock = open.lock();
            fileLock.release();

            FileLock fileLock1 = open.tryLock();
            fileLock1.release();
            Channel channel = fileLock1.acquiredBy();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test66() {
        //ClassUtil.scanPackage("com.words").stream().map(Class::getName).forEach(e -> System.out.println("import static " + e + ".*;"));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> integers1 = Arrays.asList(2, 4, 6, 8);
        System.out.println();
    }
}