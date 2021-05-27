package com.ck.Servlet;

import io.restassured.http.Cookie;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name="/MyServlet")
public class MyServlet extends HttpServlet {


    public MyServlet() {
        super();
    }
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String url;
        String get01;
        String method = req.getMethod();
        //获得在地址框里输出的地址
        url = req.getParameter("web");
        Url address = new Url();
        address.setURL(url);
        getdemo u1 = new getdemo();
        //get请求
        try {
                u1.getdemo1(url);
                System.out.println(method);
                get01 = u1.res;
                address.setGet01(get01);
                // u.setPost01(post01);
                //将表单中提交过来的值保存到Servlet中
                //将信息保存到Session中
                //调用get和psot方法
            req.getSession().setAttribute("Api", address);
            //跳转到处理界面
            req.getRequestDispatcher("get.jsp").forward(req, resp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String url;
        String post01, post02;
        String method = req.getMethod();
        //获得在地址框里输出的地址
        url = req.getParameter("web");
        Url address = new Url();
        //把地址填到地址栏
        address.setURL(url);
        getdemo u1 = new getdemo();
        //get请求

            System.out.println(method);
            post01 = req.getParameter("post");
                    if(post01==""||u1.getJSONType(post01)!=true){
                        post01="{}";
                        u1.postDemo1(post01, url);
                        //获得结果
                        post02 = u1.res;
                        //输出结果
                        address.setGet01(post02);
                    }
                    else {
                        u1.postDemo1(post01, url);
                        //获得结果
                        post02 = u1.res;
                        //输出结果
                        address.setPost01(post01);
                        address.setGet01(post02);

                    }
                req.getSession().setAttribute("Api", address);
                //跳转到处理界面
                req.getRequestDispatcher("post.jsp").forward(req, resp);
            }
        //}
        /*if (method.equals(select)) {
            try {
                //调用get和psot方法
                post01 = req.getParameter("post");
                u1.postDemo1(post01, url);
                //获得结果
                post02 = u1.res;
                //输出结果
                address.setPost01(post01);
                address.setGet01(post02);
                req.getSession().setAttribute("Api", address);
                //跳转到处理界面
                req.getRequestDispatcher("get.jsp").forward(req, resp);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }*/

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }


}
