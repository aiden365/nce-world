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
     * 3.3 系统非功能性需求分析
     * 性能需求重点关注的是在有大量并发访问情况时系统的及时响应能力。当用户搜索菜谱或者获取个性化推荐的时候的核心关键功能时，系统的响应时间需要控制在用户可接受的范围以内，根据相关的研究说明王爷的加载时间与用户满意程度显示为呈负相关，当网页加载时间越长用户满意度就越低；当加载时间超过一定阈值，有可能导致用户流失。
     * 例如最初启动浏览开始到全部页面加载的时间，在0-2秒之间用户体验最好，2-8秒用户可以容忍，8-15秒：用户不能忍受会放弃等待，为了达到让系统在高并发访问下快速响应这个目标，
     * 系统会使用在架构上通过引入k8s中间件与服务容器化部署来支持集群部署的架构，可以很方便的对集群节点进行增减。在数据访问层通过Redis这个内存数据库实现数据缓存机制，以此来优化数据处理的效率，与此同时还会引入通义系列模型的轻量化版本，这样就能让计算资源消耗与响应速度之间达到平衡。
     *
     * 可用性需求主要关注的是用户与系统交互，也就是在使用系统时的便捷程度和适配情况。
     * 系统需要对主流移动设备的屏幕尺寸进行全面适配，要保证在不同的操作系统环境之下，系统界面的布局是一致的，用户操作起来也是流畅的。对于普通用户所使用的手机端而言，系统会提供微信公众平台的入口，这样可以简化用户访问系统的路径，能够让用户实现无需在手机上安装额外的应用就能使用系统。
     * 在进行网站界面设计的时候，会遵循简约直观的原则，并充分学习用户的操作习惯，这样能够降低用户的学习成本，避免因操作不惯而放弃使用。
     *
     *
     * 安全性需求主要是要求系统在抵抗未授权访问、保护用户机密信息完整性确保用户信息隐私等方面采取必要手段，
     * 在软件工程中是对在项目保障系统安全运行、防止敏感数据被盗取的工作，要求系统必须有相应的防御措施，包括系统在数据传输、存储及处理过程中的抗攻击能力。
     * 尤其在当前网络安全形势严峻、用户个人对隐私信息保护意识增强的背景下，进行安全性需求的分析是十分必要的。
     * 如果忽略系统的安全性需求将会导致一系列负面后果，例如用户账户被恶意劫持、敏感隐私信息泄露，甚至因数据库遭受攻击导致核心业务数据被篡改或删除。
     * 因此，在进行软件系统开发之前，必须结合软件工程安全开发生命周期（SDL）进行安全性需求分析，包括传输链路安全、数据存储加密、代码层面的防御性设计三个主要因素。
     * 基于上面的分析我们可以发现，本系统在架构设计阶段便将许多安全保护机制深度融入业务中。在数据通信层面，系统全面采用 HTTPS 传输协议，通过 SSL/TLS 加密层对客户端与服务端之间的通信进行全程加密，
     * 确保了包括用户名和密码在内的敏感信息在加密传输过程中不被第三方窃听或截获，有效防范了中间人攻击。
     * 在数据存储安全维度，系统引入了 MD5 加密算法对用户密码等关键字段进行哈希处理，确保即使在数据库发生物理泄露的极端情况下，攻击者也无法直接获取用户明文密码，
     * 在针对 Web 应用常见的注入风险，系统选用了 MyBatis 框架进行持久层开发，利用其占位符（#{}）机制实现参数化查询，使 SQL 语句结构与数据参数完全分离，
     * 从根源上防止了 SQL 注入攻击，规避了非法输入对数据库逻辑的破坏。
     * 因此，本项目在安全层面上形成了传输加密、存储加固、代码防御的三层机制来有效保障系统与用户信息的安全性。
     *
     * 请你以诸如：https传输协议，MD5加密算法，敏感信息（如用户名和密码）加密传输，防止SQL注入（使用Mybatis框架）关键字，帮我对论文中安全性需求部分进行描述，写作风格仍以两段式为主，首选论述安全性需求的目标和必须要性，在使用我提供的关键字说明系统的应对措施。
     * 安全性需求主要是要求系统只能向合法用户提供服务，以及阻止非授权使用服务的能力。用户通过互联网访问系统时的数据安全，防止欺诈和篡改。
     * 在用户进行注册和登录的时候，会强制启用HTTPS传输协议，这样可以防止出现中间人攻击的情况。
     * 在权限管理方面，会采用RBAC模型，以此来实现对管理员操作权限的分级控制，对于一些关键操作还需要进行二次验证。系统还会定期开展漏洞扫描以及安全审计工作，这样可以及时修补存在的潜在风险。
     *
     * 可靠性需求体现在系统稳定性和数据安全性这两个方面。系统要保证全年的可用性在99%以上，要通过负载均衡和冗余部署的方式来避免出现单点故障的情况。在进行数据管理的时候，会建立每日自动备份的机制，采用增量备份和全量备份相结合的策略，这样可以确保在意外情况发生的时候能够快速恢复系统服务。所有用户数据在存储的时候都要遵循加密规范，对于敏感信息会采用AES - 256标准来进行保护。
     * 可维护性需求能够保障系统具有可持续发展的能力。基于SpringAI框架的模块化设计能够将各个功能组件进行解耦处理，这样就方便对各个组件进行独立开发和升级。系统预留了标准化的API接口，这样做是为了支持未来和第三方服务平台进行数据对接。在代码层面会严格执行注释规范以及版本控制，这样可以保证团队协作的效率。采用这样的设计可以让系统灵活地适应业务需求发生的变化，降低系统后期的维护成本。
     *
     */
    public static void motor() {
        System.out.println("motor");
    }
}
