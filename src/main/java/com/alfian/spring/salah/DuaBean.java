package com.alfian.spring.salah;

public class DuaBean {
    private TigaBean tigaBean;

    public DuaBean(TigaBean tigaBean) {
        this.tigaBean = tigaBean;
    }

    public TigaBean getTigaBean() {
        return tigaBean;
    }

    public void setTigaBean(TigaBean tigaBean) {
        this.tigaBean = tigaBean;
    }
}
