package net.engineeringdigest.service;

import net.engineeringdigest.journalApp.JournalApplication;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = JournalApplication.class)
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Disabled
    @Test
    void testSendMail() {
        redisTemplate.opsForValue().set("email", "hare@gmail.com");
        Object salary = redisTemplate.opsForValue().get("salary");
        int a = 1;
    }
}
