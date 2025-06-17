package com.test;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.*;
import lombok.Data;
import org.junit.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
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

    public static final Map<String, String> KEY_MAP;

    static {
        Map<String, String> logMap = new HashMap<>();
        logMap.put("roomNo", "会议室id");
        logMap.put("pageNo", "页码");
        logMap.put("pageSize", "页数");
        logMap.put("endTime", "结束时间");
        logMap.put("openTime", "开始时间");
        logMap.put("meetingSearch", "会议查询参数");
        logMap.put("meetingId", "会议id");
        logMap.put("meetingID", "会议id");
        logMap.put("shoutSearch", "呼叫查询参数");
        logMap.put("noticeSearch", "通知查询参数");
        logMap.put("voteSearch", "投票查询参数");
        logMap.put("topicId", "会议议题id");
        logMap.put("topicID", "会议议题id");
        logMap.put("isTiming", "是否定时");
        logMap.put("datumSearch", "文件查询参数");
        logMap.put("catalogueId", "编号id");
        logMap.put("meetingTopicSearch", "会议议题查询参数");
        logMap.put("year", "年份");
        logMap.put("search", "查询参数");
        logMap.put("startMonth", "开始月份");
        logMap.put("endMonth", "结束月份");
        logMap.put("depId", "部门id");
        logMap.put("newPwd", "新密码");
        logMap.put("oldPwd", "原密码");
        logMap.put("userId", "用户id");
        logMap.put("permitStatus", "授权状态");
        logMap.put("tenantId", "租户id");
        logMap.put("nodeId", "设备id");
        logMap.put("tenantName", "租户名称");
        logMap.put("pageNum", "页码");
        logMap.put("afterScreenId", "后屏id");
        logMap.put("beforeScreenId", "前屏id");
        logMap.put("onlyMeetingServiceUser", "只支持会议服务用户");
        logMap.put("departmentId", "部门id");
        logMap.put("meetingStatuses", "会议状态列表");
        logMap.put("meetingTemplateId", "会议模板id");
        logMap.put("templateName", "模板名称");
        logMap.put("title", "标题");

        KEY_MAP = Collections.unmodifiableMap(logMap);
    }

    @Data
    public static class TTT{

        @JSONField(name = "aas", label = "名称")
        private String aas;
    }

    @Test
    public void t1() {

        KEY_MAP.forEach((k,v) -> {

            System.out.println(""+k+"(\""+v+"\"),");

        });

        String jsonString = JSONObject.toJSONString(KEY_MAP);

        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        Map<String, Object> innerMap = jsonObject.getInnerMap();

        System.out.println(111);


        String s = MD5.create().digestHex("DeskMedia123@", StandardCharsets.UTF_8);
        System.out.println(s);

        String aa = "D:\\AndrowsData";

        File file = new File(aa);
        long freeSpace = file.getFreeSpace();
        System.out.println(freeSpace);
        System.out.println(JSONObject.isValid("123"));

    }


    public static void unknown1(String[] args) {
        motor();
        motivate();
        mosquito();
        monument();
        squeeze();
        staff();
        stability();
        stair();
        statue();
        stake();
        steady();
        stain();
        cease();
        mutter();
        navy();
        nasty();
        naked();
        nail();
        kite();
        generous();
        navigation();
        preserve();
        present();
        evaluate();
        consume();
        atom();
        castle();
        submit();
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
