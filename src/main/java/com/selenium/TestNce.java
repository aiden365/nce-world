package com.selenium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Optional;
@Slf4j
public class TestNce {

    @Test
    public void main() {


        System.out.println();

        // 创建ChromeOptions对象
        ChromeOptions options = new ChromeOptions();

        // 启用无头模式
        options.addArguments("--headless");

        // 可选：禁用GPU加速（避免某些系统兼容性问题）
        options.addArguments("--disable-gpu");
        WebDriver driver = new ChromeDriver(options);

        for (int i = 1; i <= 48; i++) {

            driver.get("http://www.newconceptenglish.com/index.php?id=course-4-" + String.format("%03d", i));

            String title = driver.findElements(By.id("coursetitle")).stream().map(WebElement::getText).findFirst().orElse("");

            List<WebElement> elements1 = driver.findElements(By.className("nce"));
            String introduction = elements1.get(0).findElements(By.tagName("p")).stream().findFirst().map(e -> e.getText()).orElse(null);
            String english = elements1.get(1).findElements(By.tagName("p")).stream().findFirst().map(e -> e.getText()).orElse(null);
            String chinese = elements1.get(3).findElements(By.tagName("p")).stream().findFirst().map(e -> e.getText()).orElse(null);


            WebElement webElement = elements1.get(2);
            String text1 = webElement.getText();
            System.out.println(title);
            System.out.println(introduction);
            System.out.println(english);
            System.out.println(chinese);
            System.out.println(text1);
            System.out.println();

            String[] split = text1.split("\n");

            String aa =
                    "/**\n" +
                            " *\n" +
                            " * @title "+title+"\n" +
                            " * @english "+english+"\n" +
                            " * @chinese "+chinese+"\n" +
                            " * @introduction "+introduction+"\n";

            for (int j = 0; j < split.length; j++) {
                String s = split[j];
                aa += " * @word"+j+" "+s+" \n";
            }

            aa +=   " */\n" +
                    "public static void test"+i+"(){};";

            log.info(aa);

        }


    }
}
