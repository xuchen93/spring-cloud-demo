package com.xuchen.cloud.consumer;

import com.xuchen.cloud.consumer.service.ProducerRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudConsumerApplicationTests {

    @Autowired
    ProducerRemoteService producerRemoteService;

    @Test
    public void contextLoads() {
        String s = producerRemoteService.hello("xuchen");
        log.info(s);
    }

}