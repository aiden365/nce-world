package com.test;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.words.TestFour1.*;
import static com.words.TestFour3.*;
import static com.words.TestFour4.*;
import static com.words.TestFour11.*;
import static com.words.TestFour8.*;
import static com.words.TestFour9.*;
import static com.words.TestFour5.*;
import static com.words.TestFour2.*;
import static com.words.TestFour6.*;
import static com.words.TestIelts.*;
import static com.words.TestToefl.*;
import static com.words.TestFour7.*;
import static com.words.TestFour10.*;

public class TestMain3 {

    @Data
    public static class TTT{

        @JSONField(name = "aas", label = "名称")
        private String aas;
    }

    @Test
    public void t1() {

        TTT ttt = new TTT();
        ttt.setAas("小明");
        System.out.println(JSONObject.toJSONString(ttt));
        String ttt2 = "{\"aas\":\"小明\"}";
        TTT ttt1 = JSONObject.parseObject(ttt2, TTT.class);
        System.out.println(JSONObject.toJSONString(ttt1));

    }


    public static void unknown1(String[] args) {
        percent();
        stale();
        stall();
        stalk();
        attribute();
        pair();
        origin();
        promise();
        seek();
        verify();
        unload();
        acquire();
        attach();
        compose();
        halt();
        optional();
        production();
        product();
        ax();
        seed();
        plane();
        previous();
        grow();
        reduce();
        shift();
        loop();
        ancestor();
        ancestry();
        descendant();
        cycle();
        fence();
        unsuitable();
        mask();
        false_();
        comment();
        carrier();
        afraid();
        destroy();
        resume();
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
