package com.alfian.spring.salah;

public class TigaBean {
    private SatuBean satuBean;

    public TigaBean(SatuBean satuBean) {
        this.satuBean = satuBean;
    }

    public SatuBean getSatuBean() {
        return satuBean;
    }

    public void setSatuBean(SatuBean satuBean) {
        this.satuBean = satuBean;
    }
}
