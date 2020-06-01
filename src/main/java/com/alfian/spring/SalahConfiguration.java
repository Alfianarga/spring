package com.alfian.spring;

import com.alfian.spring.salah.DuaBean;
import com.alfian.spring.salah.SatuBean;
import com.alfian.spring.salah.TigaBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalahConfiguration {

    @Bean
    public SatuBean createSatuBean(DuaBean duaBean){
        return new SatuBean(duaBean);
    }

    @Bean
    public DuaBean createDuaBean(TigaBean tigaBean){
        return new DuaBean(tigaBean);
    }

    @Bean
    public TigaBean createTigaBean(SatuBean satuBean){
        return new TigaBean(satuBean);
    }
}
