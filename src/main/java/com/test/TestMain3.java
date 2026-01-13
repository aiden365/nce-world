package com.test;

import cn.hutool.core.collection.IterUtil;
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
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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

        @JSONField(label = "名称")
        private String aas;
        @JSONField(label = "开关")
        private boolean switch1;
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

        System.out.println(IterUtil.isEqualList(Arrays.asList("11","22"), Arrays.asList("11","22")));

        innerMap.get(null);

        TTT ttt = new TTT();
        ttt.setAas("小白");

        //将属性输出为中文
        NameFilter nameFilter = (object, name, value) -> {
            try {

                Class<?> aClass = object.getClass();
                JSONField annotation = aClass.getDeclaredField(name).getAnnotation(JSONField.class);
                String label = annotation.label();
                return label;
            } catch (Exception e) {
                System.out.println("保存日志时解析参数失败");
            }
            return name;
        };
        ValueFilter valueFilter = (object, name, value) -> {
            try {
                return value;
            } catch (Exception e) {
                System.out.println("保存日志时解析参数失败");
            }
            return name;
        };

        System.out.println(JSON.toJSONString(ttt, new SerializeFilter[]{valueFilter}));

        String ab = "111";
        String unknown = unknown(ab);

        System.out.println(ab);
        System.out.println(unknown);
    }

    public static String unknown(String aaa) {

        aaa = aaa + "0";

        return aaa;
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

    /**
     *
     * 本章通过对智能菜谱系统的核心功能进行全面测试，验证了系统在业务逻辑、技术集成及性能稳定性方面的表现。
     * 测试过程严格遵循了软件测试的标准化流程，通过使用多种测试方法确保了系统的质量。
     *
     *
     * 1. 模块测试与集成测试的协同
     * 在模块测试阶段，本文针对用户管理、菜谱检索、饮食记录及美食圈子等独立模块进行了详细的黑盒功能验证。通过对多张核心数据库表及其对应接口的逐一测试，确保了每一个基础功能点的输入输出都能符合预期。
     * 在此基础上，集成测试重点验证了系统各组件间的交互协同，特别是 Spring AI 框架与本地 Qwen 大模型、Redis 向量数据库以及 MySQL 关系数据库之间的交互。测试结果表明，各模块间能后相互兼容，系统成功实现了从用户输入到 AI 推理再到数据持久化的业务流程。
     *
     * 综上所述，本系统通过了全部预设用例的测试，各项功能模块运行稳定，在内容风控、个性化约束推荐及数据一致性方面表现优异。系统能够有效解决用户日常饮食中的“选菜难、配菜难”问题，并能够通过人工校准闭环不断优化内容质量，达到了毕业设计的预期建设目标，具备实际部署与应用的条件。
     * 2. 灰盒测试对核心算法的验证
     * 为了更深层次地验证系统的“智能化”特质，本章引入了灰盒测试方法。在观察前端反馈的同时，通过监控后台日志、SQL 执行状态及向量搜索分值，对系统中复杂的业务逻辑进行了穿透式检查。特别是在“菜谱评价与校准”模块的测试中，灰盒测试不仅验证了界面的评分功能，还通过检查后端数据库中菜谱状态位的实时变更，确认了“菜谱质量评估加权算法”的阈值触发逻辑是否精准。这种测试方法有效保障了系统内部算法逻辑的透明度，确保了“生成-评价-校准”闭环系统的可靠运行。
     *
     * 3. 测试结论
     *
     *
     */
    public static void motor() {
        System.out.println("motor");
    }
}
