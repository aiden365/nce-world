package com.test;

import cn.hutool.core.util.StrUtil;

import static com.words.TestFour4.*;
import static com.words.TestFour11.*;
import static com.words.TestFour9.*;
import static com.words.TestFour5.*;
import static com.words.TestFour2.*;
import static com.words.TestFour6.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour7.*;

public class TestMain3 {

    public static void main(String[] args) {

        String str = "aaa.doc";

        StringBuffer insert = new StringBuffer(str).insert(str.lastIndexOf("."), "（保密）");

        System.out.println(insert);

    }


    public static void unknown1(String[] args) {
        access();
        exception();
        energy();
        metabolism();
        petrol();
        gasoline();
        diesel();
        dot();
        interview();
        experience();
        host();
        security();
    }
}
