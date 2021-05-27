package com.ck.Servlet;


import java.sql.Timestamp;

public class test {

    public static void main(String[] args) {

        String str = "{\n" +
                "\"phoneArea\":\"86\",\n" +
                "\"phoneNumber\":\"20000000000\",\n" +
                "\"password\":\"netease123\"\n" +
                "}";

        MapChange mao=new MapChange();

        Timestamp d = new Timestamp(System.currentTimeMillis());
        System.out.println(d);
        System.out.println(mao.toMap(str));
        System.out.println(str);
/*
        JSONObject jso=new JSONObject(str);

        Map<String,Object> m=new HashMap<String,Object>();

        Iterator it = jso.keys();

        while (it.hasNext()) {

            String key = (String) it.next();

            Object value = jso.get(key);

            m.put(key, value);

        }

        System.out.println(m.toString());

    }

 */
    }
}



