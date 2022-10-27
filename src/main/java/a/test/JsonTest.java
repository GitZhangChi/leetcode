package a.test;

import a.test.dto.HaiweiLuckinDTO;
import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;


public class JsonTest {


    public static void main(String[] args) {


        String s = " {\"order_no\":\"RX221022123544069\",\"take_phone_number\":\"15971473173\",\"take_meal_qr_code\":\"Y1NzNwq3AAI=\",\"product_detail\":\"%E7%B2%BE%E8%90%83%E6%BE%B3%E7%91%9E%E7%99%BD*15.40%E5%85%83*1%E4%BB%BD%2C%E5%A6%82%E6%A2%A6%E4%BB%A4%C2%B7%E5%B7%A5%E5%A4%AB%E8%BD%BB%E4%B9%B3%E8%8C%B6*15.40%E5%85%83*1%E4%BB%BD\",\"modify_time\":\"2022-10-22 12:36:08\",\"restaurant_address\":\"%E9%BE%99%E7%A6%A7%E5%B9%BF%E5%9C%BA%E5%BA%97%7C%E5%B9%BF%E4%B8%9C%E5%B9%BF%E5%B7%9E%E7%99%BD%E4%BA%91%E5%8C%BA%E5%BA%B7%E5%BA%84%E8%B7%AF2%E5%8F%B7%E9%BE%99%E7%A6%A7%E5%B9%BF%E5%9C%BAA%E6%A0%8B%E4%B8%80%E5%B1%82104%E3%80%81107%E5%AE%A4\",\"sign\":\"BA5910E8D726182FEC732B863006E9FB\",\"black_whale_tag\":\"4\",\"order_time\":\"2022-10-22 12:35:44\",\"total_rebate\":1.24,\"out_meal_time\":\"2022-10-22 12:36:08\",\"pay_time\":\"2022-10-22 12:35:56\",\"order_status\":\"OUT_MEAL\",\"settle_price\":30.80,\"user_id\":\"o498X0fW42lROVQ6KN2HYzJpo40M\",\"extra\":\"\",\"product_detail_list\":\"%5B%7B%22amount%22%3A1%2C%22name%22%3A%22%E7%B2%BE%E8%90%83%E6%BE%B3%E7%91%9E%E7%99%BD%22%2C%22price%22%3A15.40%7D%2C%7B%22amount%22%3A1%2C%22name%22%3A%22%E5%A6%82%E6%A2%A6%E4%BB%A4%C2%B7%E5%B7%A5%E5%A4%AB%E8%BD%BB%E4%B9%B3%E8%8C%B6%22%2C%22price%22%3A15.40%7D%5D\",\"take_meal_code\":\"[\\\"681\\\"]\",\"timestamp\":1666413368762}";

        JSONObject request = JSON.parseObject(s);



        JSONObject params = new JSONObject();

        request.forEach((k, v) -> {
            params.put(CharSequenceUtil.toCamelCase(k), URLUtil.decode(v.toString()));
        });

        String finalJsonStr = params.toJSONString();

        System.out.printf("haiwei callback finalJsonStr -> %s \n", finalJsonStr);


        String firstRep = StringUtils.replace(finalJsonStr, "\\", "");

        String secondRep = StringUtils.replace(firstRep, "\"[", "[");

        String replace = StringUtils.replace(secondRep, "]\"", "]");

        System.out.printf("haiwei callback finalJsonStr -> %s \n", replace);


        HaiweiLuckinDTO haiweiLuckinDTO = JSON.parseObject(replace, HaiweiLuckinDTO.class);

        System.out.println(haiweiLuckinDTO);
    }
}
