package org.minbox.framework.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.util.ObjectUtils;

/**
 * Json Util
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-08-07 10:30
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengboy
 */
public class JsonUtil {
    /**
     * beautify object to json
     *
     * @param object object
     * @return object json string
     */
    public static String beautifyJson(Object object) {
        if (ObjectUtils.isEmpty(object)) {
            return null;
        }
        return JSON.toJSONString(object,
                SerializerFeature.PrettyFormat,
                SerializerFeature.SortField,
                SerializerFeature.MapSortField
        );
    }

    /**
     * beautify string to json
     *
     * @param json json string
     * @return after beautify json
     */
    public static String beautifyJson(String json) {
        if (ObjectUtils.isEmpty(json)) {
            return json;
        }
        return JSON.toJSONString(
                JSONObject.parse(json),
                SerializerFeature.PrettyFormat
        );
    }
}
