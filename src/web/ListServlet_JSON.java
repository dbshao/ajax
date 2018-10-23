package web;

import entiy.City;
import jdk.nashorn.api.scripting.JSObject;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by itachi on 2017/1/8.
 */
public class ListServlet_JSON extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        PrintWriter pw=resp.getWriter();
        if("bj".equals(name)){
            City c=new City();
            String[] id={"cy","dc","gg"};
            c.setId(id);
            String[] na={"朝阳","东城","故宫"};
            c.setName(na);
            JSONObject ob=JSONObject.fromObject(c);
            String jsob=ob.toString();
            pw.println(jsob);
        }else if("sh".equals(name)){
            City c=new City();
            String[] id={"ja","hp","pd"};
            c.setId(id);
            String[] na={"静安","黄埔","浦东"};
            c.setName(na);
            JSONObject ob=JSONObject.fromObject(c);
            String jsob=ob.toString();
            pw.println(jsob);
        }else {
            City c=new City();
            String[] id={"by","py","th"};
            c.setId(id);
            String[] na={"白云","番禺","天河"};
            c.setName(na);
            JSONObject ob=JSONObject.fromObject(c);
            String jsob=ob.toString();
            pw.println(jsob);
        }
        pw.close();
    }


}
