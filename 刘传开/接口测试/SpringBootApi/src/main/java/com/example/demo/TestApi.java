package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.restassured.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//import jdk.internal.jline.internal.TestAccessible;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import static io.restassured.RestAssured.*;




@Api(tags="商城的接口实现")
@RestController
public class TestApi {
    @ApiOperation("实现登录")
    @RequestMapping(value = "/api/login",method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject user, HttpServletResponse resonse) {
        String user_area = user.getString("phoneArea");
        String user_phone = user.getString("phoneNumber");
        String user_pwd = user.getString("password");
        JSONObject result = new JSONObject();
        if (user_area.equals("88") && user_phone.equals("123456") && user_pwd.equals("223344")) {

            result.put("message", "success");
            result.put("code", "200");
            Cookie cookie = new Cookie("login", "true");
            cookie.setPath("/");
            resonse.addCookie(cookie);
        } else if (!user_pwd.equals("223344") || !user_phone.equals("123456")||!user_area.equals("88")) {
            result.put("message", "用户名或者密码错误");
            result.put("code", "400");
        }
        return result;
    }

    @ApiOperation("获取地址")
    @GetMapping("/api/address")
    public JSONObject getAddersss(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        Cookie[] cookies = request.getCookies();
        JSONObject result = new JSONObject();

        if (Objects.isNull(cookies)) {
            result.put("message", "请登录");

        }
        else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login") &&
                        cookie.getValue().equals("true")) {
                    result.put("message", "Success");
                    result.put("address", "石家庄");

                }
            }
        }
        return result;
    }


    //  /common/skuList?goodId=1/common/skuList?goodId=1&name=abc
    @ApiOperation("获取商品信息")
    @GetMapping("/api/skuList")
    public JSONObject getGoodInfo
    (@RequestParam(required = false) int goodId, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        JSONObject goodInfo = new JSONObject();
        if (goodId == 1) {
            goodInfo.put("message", "Success");
            goodInfo.put("name", "牛奶");
        } else if (goodId == 2) {
            goodInfo.put("message", "Success");
            goodInfo.put("name", "苹果");
        } else if(goodId%1 == 0){
            goodInfo.put("message", "商品ID不存在");
            goodInfo.put("code", 201);
        }
        else {
            goodInfo.put("message", "Failed to convert" +
                    " property value of type" +
                    "'java.lang.String' to required type" +
                    " 'java.lang.Long' for property" +
                    "'goodsId'; nested exception is" +
                    "java.lang.NumberFormatException: For" +
                    "input string: \"aaa\"");
            goodInfo.put("code", 400);
        }
        return goodInfo;

    }
    @ApiOperation("获取商品信息")
    @GetMapping("/api/skuListwithoutId")
    public JSONObject getGoodInfo
            (HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        JSONObject goodInfo = new JSONObject();
        goodInfo.put("message", "Success");
        JSONArray result = new JSONArray();
        JSONObject id1 = new JSONObject();
        id1.put("id", 1);
        id1.put("name", "牛奶");
        JSONObject id2 = new JSONObject();
        id2.put("id", 2);
        id2.put("name", "苹果");
        result.add(id1);
        result.add(id2);
        goodInfo.put("result", result);
//            Response resp = given().get("http:/127.0.0.1:7777/common/skuList");
//            resp.print();

        return goodInfo;

    }

    @ApiOperation("计算运费")
    @GetMapping("/api/getTransportFee")
    public JSONObject getTranFee(@RequestParam int id, @RequestParam String addressDetail, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        JSONObject Fee = new JSONObject();
        Cookie[] cookies = request.getCookies();

        if (Objects.isNull(cookies)) {
            Fee.put("message", "请登录");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                    if (id % 1 == 0) {
                        if (id == 1 && addressDetail.equals("浙江省_杭州市_滨江区")) {
                            Fee.put("message", "Success");
                            Fee.put("result", 6);
                            Fee.put("code", 200);
                        }
                    } else {
                        Fee.put("code", 400);
                        Fee.put("message", "请求失败");
                    }
                }
            }
        }
        return Fee;
    }

    @ApiOperation("提交订单")
    @RequestMapping(value = "/api/orders/submit", method = RequestMethod.POST)
    public JSONObject submit
            (@RequestBody JSONObject skuList, HttpServletResponse response, HttpServletRequest request) {
        response.setContentType("application/json;charset=UTF-8");
        String skuIds = skuList.getString("skuIds");
        String skuNumbers = skuList.getString("skuNumbers");
        String stockIds = skuList.getString("stockIds");
        JSONObject form = new JSONObject();
        Cookie[] cookies = request.getCookies();

        if (Objects.isNull(cookies)) {
            form.put("message", "请登录");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                    if (skuIds == null || skuNumbers == null || stockIds == null) {
                        form.put("message", "请求失败");
                        form.put("code", 400);
                    } else {
                        if (skuIds.equals("2") && skuNumbers.equals("1") && stockIds.equals("74966312")) {
                            form.put("message", "Success");
                            JSONObject result = new JSONObject();
                            result.put("id", 76364163);
                            result.put("fgUserId", 74966314);
                            form.put("result", result);
                        }
                    }
                }
            }
        }
        return form;
    }
    @ApiOperation("新增收货地址")
    @RequestMapping(value = "/api/address/new", method = RequestMethod.POST)
    public JSONObject addaddress
            (@RequestBody JSONObject form, HttpServletResponse response, HttpServletRequest request) {
        response.setContentType("application/json;charset=UTF-8");
        JSONObject message = new JSONObject();
        String id = form.getString("id");
        String receiverName = form.getString("receiverName");
        String cellPhone = form.getString("cellPhone");
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)) {
            message.put("message", "请登录");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                    if (receiverName.equals("huhu") && cellPhone.equals("2215")) {
                        message.put("code", 200);
                        message.put("message", "success");
                    }
                }
            }
        }
        return message;
    }

    @ApiOperation("删除地址")
    @RequestMapping(value = "/api/address/delete", method = RequestMethod.POST)
    public JSONObject deleteAddress
            (@RequestBody JSONObject user, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        Cookie[] cookies = request.getCookies();
        JSONObject message = new JSONObject();
        int id = user.getIntValue("id");
        if (Objects.isNull(cookies)) {
            message.put("message", "请登录");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                    if (id == 77243286) {
                        message.put("message", "success");
                        message.put("code", 200);
                    } else {
                        message.put("message", "请求失败");
                        message.put("code", 400);
                    }
                }
            }
        }
        return message;
    }

}

