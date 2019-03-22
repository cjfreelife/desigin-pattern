package org.cj.adapters;

import org.cj.SiginService;

public class LoginForPasswordAdapter extends SiginService implements LoginAdapter {
    public boolean instanceOf(Object obj) {
        return obj instanceof LoginForPasswordAdapter;
    }

    public void Login(String id, LoginAdapter loginAdapter) {
        super.login(id, null);
    }
}
