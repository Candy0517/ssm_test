package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_dao.xml");

        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);

    }
}
