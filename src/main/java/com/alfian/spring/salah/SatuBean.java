package com.alfian.spring.salah;

public class SatuBean {
    private DuaBean duaBean;

    public SatuBean(DuaBean duaBean) {
        this.duaBean = duaBean;
    }

    public DuaBean getDuaBean() {
        return duaBean;
    }

    public void setDuaBean(DuaBean duaBean) {
        this.duaBean = duaBean;
    }
}
