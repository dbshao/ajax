package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by itachi on 2017/1/8.
 */
public class ListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        PrintWriter pw=resp.getWriter();
        if("bj".equals(name)){
            pw.println("朝阳,cy;东城,dc");
        }else if("sh".equals(name)){
            pw.println("静安,ja;黄埔,hp;浦东,pd");
        }else {
            pw.println("白云,bt;番禺,py");
        }
        pw.close();
    }
}
