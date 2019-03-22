package org.cj.adapters;

public interface ILoginService {
    void loginByPassword(String userName, String passWord);

    void loginByWechat(String uuid);

}
