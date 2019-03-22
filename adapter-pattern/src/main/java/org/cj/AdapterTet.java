package org.cj;

import org.cj.adapters.LoginService;

/*
 * 适配器主要是用来兼容以前的接口，在不改变原来接口的情况下来将不同功能的接口放在一起工作，结构型设计模式
 * */
public class AdapterTet {
    public static void main(String[] args) {
        new LoginService().loginByWechat("aa");
        new LoginService().loginByPassword("11", "aa");
    }
}
