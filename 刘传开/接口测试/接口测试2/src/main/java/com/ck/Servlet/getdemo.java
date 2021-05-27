package com.ck.Servlet;

import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class getdemo {
    public String res;

    @Test
    public void getdemo1(String url){

        Response response= given().get(url);
        res=response.getBody().prettyPrint();
    }
    /*public void getdemo2(String url, String cookie) {

        System.out.println("Cookie = "+cookie);

        Response response = given().contentType("application/json; charset=UTF-8").
                cookies("web-session", cookie).
                expect().statusCode(200).
                when().get(url);

        //given().contentType("application/json").when().get("/xxx").then().body();

        res=response.getBody().prettyPrint();


    }

     */

/*
@Test
public void mapPost(String apiPath, Map map){

    Response response =  given().params(map).
            expect().statusCode(200).
            when().post(apiPath);

    res=response.print();

}
*/
public boolean getJSONType(String str) {
    boolean result = false;
    if (StringUtils.isNotBlank(str)) {
        str = str.trim();
        if (str.startsWith("{") && str.endsWith("}")) {
            result = true;
        } else if (str.startsWith("[") && str.endsWith("]")) {
            result = true;
        }
    }
    return result;
}

    @Test
    public void postDemo1(String post,String url) {
        JSONObject user =new JSONObject(post);
        Response response = given().contentType("application/json")
                .body(user.toString())
                .post(url);

        res=response.getBody().prettyPrint();
    }

    @Test
    public void postDemo2(String post, String url) {
        JSONObject user =new JSONObject(post);
        Response response = given().contentType("application/json")
                .body(user.toString())
                .post(url);
        res=response.getBody().prettyPrint();
    }


}
