package org.cj.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    private static Map<String, PayMent> map = new HashMap();

    static {
        map.put("alipay", new Alipay());
        map.put("wechat", new WechatPay());
    }

    public static PayMent getPayStrategy(String payType) {
        if (map.containsKey(payType)) {
            return map.get(payType);
        }
        return map.get("alipay");
    }
}
