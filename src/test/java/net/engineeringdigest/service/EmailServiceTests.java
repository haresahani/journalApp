package net.engineeringdigest.service;

import net.engineeringdigest.journalApp.JournalApplication;
import net.engineeringdigest.journalApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JournalApplication.class)
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail() {
        emailService.sendEmail("harekrishnakumar22@gmail.com",
                "Testing Java mail sender",
                "Hi, How are you!");

    }
}
