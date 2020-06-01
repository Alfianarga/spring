package com.alfian.spring;

import com.alfian.spring.model.DataBean;
import com.alfian.spring.model.OtherBean;
import com.alfian.spring.model.SampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Configuration.class, args);

//		DataBean data = context.getBean(DataBean.class);
//		System.out.println(data.getValue());

//		SampleBean data = context.getBean(SampleBean.class);
//		System.out.println(data.getDataBean().getValue());

		OtherBean bean = context.getBean(OtherBean.class);
		System.out.println(bean.getDataBean().getValue());
		System.out.println(bean.getSampleBean().getDataBean().getValue());
	}

}
