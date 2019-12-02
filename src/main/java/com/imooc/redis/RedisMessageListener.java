package com.imooc.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisMessageListener
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 21:25
 * @Version 1.0
 **/
@Component
public class RedisMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println("new String(bytes) = " + new String(bytes));
        System.out.println("new String(message.getChannel()) = " + new String(message.getChannel()));
        System.out.println("new String(message.getBody()) = " + new String(message.getBody()));
        GenericJackson2JsonRedisSerializer serializer = new GenericJackson2JsonRedisSerializer();
        System.out.println("serializer.deserialize(message.getBody()) = " + serializer.deserialize(message.getBody()));
    }
}
