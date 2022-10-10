package com.ycy.canteen.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 提交类型
 * @author: yangfan
 * @create: 2021-05-23
 */
public enum SubmitEnum {

    //提交类型  1 自动检测；2 药师审方
    CHECKCONTENT("1", "自动检测"),

    RECIPE("2", "药师审方") ;

    private String type;
    private String desc;

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    SubmitEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static List<Map<String, Object>> valuesList() {
        List<Map<String, Object>> list = new ArrayList<>(values().length);
        Map<String, Object> map;
        for (SubmitEnum typeEnum : values()) {
            map = new HashMap<>(2);
            map.put("type", typeEnum.getType());
            map.put("desc", typeEnum.getDesc());
            list.add(map);
        }
        return list;
    }
}
