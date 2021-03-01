package com.springhealth.account.config;

import ch.qos.logback.core.db.DBHelper;
import com.springhealth.account.bean.Cat;
import com.springhealth.account.bean.Pet;
import com.springhealth.account.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

import javax.print.attribute.standard.MediaSize;

/**
 * @version 1.0
 * @Author 王庆运
 * @Date: 2021/02/28/ 15:51
 * @Description
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:bean.xml")
//@ConditionalOnMissingBean(name = "tom")
@EnableConfigurationProperties(Cat.class)
public class MyConfig {


    @Bean
    //@ConditionalOnBean(name = "tom")
    public User user01 (){
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setCat(pecom());
        return zhangsan;
    }

    //@Bean("tom")
    public Pet pecom () {
        return new Pet("tomcat");
    }
}
