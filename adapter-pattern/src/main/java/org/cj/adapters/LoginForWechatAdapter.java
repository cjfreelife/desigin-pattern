package org.cj.adapters;

public class LoginForWechatAdapter implements LoginAdapter {
    public boolean instanceOf(Object obj) {
        return obj instanceof LoginForWechatAdapter;
    }

    public void Login(String id, LoginAdapter loginAdapter) {
        System.out.println("微信登录");
    }
}
