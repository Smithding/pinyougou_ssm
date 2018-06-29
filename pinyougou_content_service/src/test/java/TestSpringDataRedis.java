import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @date 2018/6/26
 * @package PACKAGE_NAME
 * @company www.itheima.com
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext-redis.xml")
@RunWith(SpringRunner.class)
public class TestSpringDataRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 使用spring data redis来实现set get
     */
    @Test
    public void test(){
        //set(key,value)
        Map map = new HashMap();
        map.put("key1","value1");
        map.put("key2","value2");
        redisTemplate.boundValueOps("outsidekey1").set(map);

        //实际上spring data redis 默认的是有序列化的方式JDK
        Object value = redisTemplate.boundValueOps("outsidekey1").get();

        System.out.println(value);

    }

    @Test
    public void testList(){
        redisTemplate.boundListOps("list1").leftPush("曹植");
        redisTemplate.boundListOps("list1").leftPush("曹操");
        redisTemplate.boundListOps("list1").leftPush("曹辟");
        redisTemplate.boundListOps("list1").leftPush("曹忍");

        List list1 = redisTemplate.boundListOps("list1").range(0, 5);
        for (Object o : list1) {
            System.out.println(o);
        }
    }

    @Test
    public void testHash(){
        redisTemplate.boundHashOps("bigkey").put("field1","value1");
        redisTemplate.boundHashOps("bigkey").put("field2","value2");

        Map bigkey = redisTemplate.boundHashOps("bigkey").entries();

        Object o = redisTemplate.boundHashOps("bigkey").get("field1");
        System.out.println(o);
    }
}
