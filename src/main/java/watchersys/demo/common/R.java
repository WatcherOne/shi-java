package watchersys.demo.common;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        super.put("code", Constant.ApiCode.SUCCESS);
        super.put("data", null);
        super.put("msg", "success");
    }

    public static R success() {
        return new R();
    }

    public static R success(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R success(Object value) {
        R r = new R();
        r.put("data", value);
        return r;
    }

    public static R error() {
        return error(Constant.ApiCode.ERROR, "error");
    }

    public static R error(String msg) {
        return error(Constant.ApiCode.ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public R add(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
