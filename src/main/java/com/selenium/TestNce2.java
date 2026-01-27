package com.selenium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.words.TestCz.size;

@Slf4j
public class TestNce2 {


    /**
     *
     * @title Finding fossil man
     * @english1 We can read of things that happened 5,000 years ago in the Near East, where people first learned to write. But there are some parts of the world where even now people cannot write. The only way that they can preserve their history is to recount it as sagas--legends handed down from one generation of story-tellers to another. These legends are useful because they can tell us something about migrations of people who lived long ago, but none could write down what they did. Anthropologists wondered where the remote ancestors of the Polynesian peoples now living in the Pacific Islands came from. The sagas of these people explain that some of them came from Indonesia about 2,000 years ago.
     * @english2 But the first people who were like ourselves lived so long ago that even their sagas, if they had any, are forgotten. So archaeologists have neither history nor legends to help them to find out where the first 'modern men' came from.
     * @english3 Fortunately, however, ancient men made tools of stone, especially flint, because this is easier to shape than other kinds. They may also have used wood and skins, but these have rotted away. Stone does not decay, and so the tools of long ago have remained when even the bones of the men who made them have disappeared without trace.
     * @english4 Source: ROBIN PLACE Finding Fossil Man
     * @chinese1 我们从书籍中可读到5,000 年前近东发生的事情，那里的人最早学会了写字。但直到现在，世界上有些地方，人们还不会书写。他们保存历史的唯一办法是将历史当作传说讲述，由讲述人一代接一代地将史实描述为传奇故事口传下来。这些传说是很有用的，因为它们能告诉我们以往人们迁居的情况。但是，没有人能把他们当时做的事记载下来。人类学家过去不清楚如今生活在太平洋诸岛上的波利尼西亚人的祖先来自何方， 当地人的传说却告诉人们：其中一部分是约在2,000年前从印度尼西亚迁来的。
     * @chinese2 但是，和我们相似的原始人生活的年代太久远了，因此，有关他们的传说既使有如今也失传了。于是，考古学家们既缺乏历史记载，又无口头传说来帮助他们弄清最早的“现代人”是从哪里来的。
     * @chinese3 然而，幸运的是，远古人用石头制作了工具，特别是用燧石，因为燧石较之其他石头更容易成形。他们也可能用过木头和兽皮，但这类东西早已腐烂殆尽。石头是不会腐烂的。因此，尽管制造这些工具的人的骨头早已荡然无存，但远古时代的石头工具却保存了下来。
     */
    public static void test1(){};

    @Test
    public void main() {


        System.out.println();

        // 创建ChromeOptions对象
        ChromeOptions options = new ChromeOptions();
        // 设置ChromeDriver路径
        System.setProperty("webdriver.chrome.driver", "E:\\workspace\\java\\nce-world\\chromedriver.exe");

        // 启用无头模式
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        System.out.println("开始");
        for (int i = 1; i <= 96; i++) {

            driver.get("https://newconceptenglish.com/index.php?id=2-" + String.format("%03d", i));

            String title = driver.findElements(By.id("coursetitle")).stream().map(WebElement::getText).findFirst().orElse("");



            List<String> englishes = driver.findElement(By.className("nce-lessons")).findElements(By.tagName("p")).stream().map(WebElement::getText).map(e -> e.replaceAll("\n", "")).collect(Collectors.toList());
            List<String> chineses = driver.findElement(By.className("nce-fanyi")).findElements(By.tagName("p")).stream().map(WebElement::getText).map(e -> e.replaceAll("\n", "")).collect(Collectors.toList());


            List<String> words = new ArrayList<>();
            List<WebElement> wordCards = driver.findElements(By.cssSelector(".word-card"));
            for (int i1 = 0; i1 < wordCards.size(); i1++) {
                WebElement webElement = wordCards.get(i1);
                try {

                    String text = Optional.ofNullable(webElement.findElement(By.cssSelector(".word-text"))).map(WebElement::getText).orElse(null);
                    String pos = Optional.ofNullable(webElement.findElement(By.cssSelector(".word-pos"))).map(WebElement::getText).orElse(null);
                    String def = Optional.ofNullable(webElement.findElement(By.cssSelector(".word-def"))).map(WebElement::getText).orElse(null);
                    words.add(text + " [" + pos + "] " + def);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }


            String aa =
                    "/**\n" +
                            " *\n" +
                            " * @title "+title+"\n";


            for (int i1 = 0; i1 < englishes.size(); i1++) {
                aa += MessageFormat.format(" * @english{0} {1} \n", (i1+1), englishes.get(i1));
            }
            for (int i1 = 0; i1 < chineses.size(); i1++) {
                aa += MessageFormat.format(" * @chinese{0} {1} \n", (i1+1), chineses.get(i1));
            }

            for (int j = 0; j < words.size(); j++) {
                String s = words.get(j);
                aa += " * @word"+(j+1)+" " +s+" \n";
            }

            aa +=   " */\n" +
                    "public static void test"+i+"(){};";


            log.info("\n" + aa);

        }


    }
}
