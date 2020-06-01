package com.alfian.spring;

import com.alfian.spring.model.DataBean;
import com.alfian.spring.model.OtherBean;
import com.alfian.spring.model.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@Import(SalahConfiguration.class)
public class Configuration {

    @Bean(name = "1")
    public DataBean createDataBean() {
        DataBean bean = new DataBean("Alfian Arga");
        return bean;
    }

    @Bean(name = "2")
    //@Primary
    public DataBean createDataBean2() {
        DataBean bean = new DataBean("Budiyanto");
        return bean;
    }

    @Bean
    public SampleBean createSampleBean(@Qualifier("1") DataBean dataBean) {
        SampleBean bean = new SampleBean(dataBean);
        return bean;
    }

    @Bean
    public OtherBean createOtherBean(@Qualifier("1") DataBean dataBean, SampleBean sampleBean) {
        OtherBean bean = new OtherBean(dataBean, sampleBean);
        return bean;
    }

}
