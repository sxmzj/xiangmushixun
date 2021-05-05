package com.ck.Servlet;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapChange {
    String str = "{\n" +
            "\"phoneArea\":\"86\",\n" +
            "\"phoneNumber\":\"20000000000\",\n" +
            "\"password\":\"netease123\"\n" +
            "}";
    public Map<String, String> toMap(Object object) {
        Map<String, String> data = new HashMap<String, String>();
        // 将json字符串转换成jsonObject
        JSONObject jsonObject = new JSONObject(str);
        Iterator ite = jsonObject.keys();
        // 遍历jsonObject数据,添加到Map对象
        while (ite.hasNext()) {
            String key = ite.next().toString();
            String value = jsonObject.get(key).toString();
            data.put(key, value);
        }
        // 或者直接将 jsonObject赋值给Map
        // data = jsonObject;
        return data;
    }
}

