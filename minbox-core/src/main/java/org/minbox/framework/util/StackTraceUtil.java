package org.minbox.framework.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Exception StackTrace Util
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-08-06 22:14
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengboy
 */
public class StackTraceUtil {
    /**
     * Get Exception Stack Trace
     *
     * @param throwable Exception Instance
     * @return Stack Trace
     */
    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            throwable.printStackTrace(pw);
            return sw.toString();
        } finally {
            pw.close();
        }
    }
}
