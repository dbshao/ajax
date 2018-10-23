package entiy;

import net.sf.json.JSONObject;

/**
 * Created by itachi on 2017/1/8.
 */
public class Test {
    public static void main(String[] args) {
        City c=new City();
        String[] id={"cy","dc","gg"};
        c.setId(id);
        String[] na={"朝阳","东城","故宫"};
        c.setName(na);
        JSONObject ob=JSONObject.fromObject(c);
        String jsob=ob.toString();
        System.out.println(jsob);
    }
}
