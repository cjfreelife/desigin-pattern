package org.cj.adapters;

public class LoginService implements ILoginService {
    public void loginByPassword(String userName, String passWord) {
        LoginAdapter loginAdapter = new LoginForPasswordAdapter();
        loginAdapter.Login(userName + passWord, loginAdapter);
    }

    public void loginByWechat(String uuid) {
        loginProcess(uuid, LoginForWechatAdapter.class);
    }

    private void loginProcess(String id, Class clz) {
        try {
            LoginAdapter o = (LoginAdapter) clz.newInstance();
            if (o.instanceOf(o)) {
                o.Login(id, o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
