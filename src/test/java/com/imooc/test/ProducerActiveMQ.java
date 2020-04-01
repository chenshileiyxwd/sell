package com.imooc.test;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @ClassName ProducerActiveMQ
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/25 21:17
 * @Version 1.0
 **/
public class ProducerActiveMQ {
    public static void main(String[] args) {
        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection;
        try {
            connection = factory.createConnection();
            connection.start();
            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("myQueue");
            MessageProducer producer = session.createProducer(destination);
            TextMessage new_msssge = session.createTextMessage("陈世磊第7次发送active mq测试数据，请多多支持");
            producer.send(new_msssge);
            session.commit();
            session.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
