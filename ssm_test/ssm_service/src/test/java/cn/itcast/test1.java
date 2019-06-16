package cn.itcast;

import cn.itcast.domain.Items;
import cn.itcast.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {


    @Test
    public void test1(){


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applcationContext_spring.xml");

        ItemsServiceImpl itemsService = context.getBean(ItemsServiceImpl.class);

        Items items = itemsService.findById(1);

        System.out.println(items);

    }
}
