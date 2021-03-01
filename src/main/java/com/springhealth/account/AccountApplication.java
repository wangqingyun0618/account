package com.springhealth.account;

import ch.qos.logback.core.db.DBHelper;
import com.springhealth.account.bean.Pet;
import com.springhealth.account.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AccountApplication.class, args);
		//获取所有容器中的组件
		String[] names = run.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}

		/*User user01 = run.getBean("user01", User.class);
		User user02 = run.getBean("user01", User.class);
		System.out.println("组件： "+(user01 == user02));

		User user1 = run.getBean("user01",User.class);
		Pet tom = run.getBean("tom", Pet.class);
		System.out.println("用户的宠物："+(user1.getCat() == tom));

		//获取组件
		// @Import 给组件中创建一个或者多个类型 默认组件的名称是全类名：com.springhealth.account.bean.User
		String[] beanNamesForType = run.getBeanNamesForType(User.class);
		System.out.println("========");
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
		DBHelper bean = run.getBean(DBHelper.class);
		System.out.println(bean);*/

		//判断是否包含组件 包含true 不包含flase
		boolean tom = run.containsBean("tom");
		System.out.println("容器中Tom组件："+tom);
		boolean user01 = run.containsBean("user01");
		System.out.println("容器中User01组件："+user01);

		boolean haha = run.containsBean("haha");
		boolean hehe = run.containsBean("hehe");
		System.out.println("haha :"+ haha);
		System.out.println("hehe :"+ hehe);
	}

}
