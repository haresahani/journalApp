package net.engineeringdigest.repository;

import net.engineeringdigest.journalApp.JournalApplication;
import net.engineeringdigest.journalApp.repository.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JournalApplication.class)
public class UserRepositoryImplTests {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    public void testSaveNewUser() {
        Assertions.assertNotNull(userRepository.getUserForSA());
    }
}
