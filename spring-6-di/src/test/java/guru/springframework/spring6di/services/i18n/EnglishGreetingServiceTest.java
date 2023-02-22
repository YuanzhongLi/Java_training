package guru.springframework.spring6di.services.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import guru.springframework.spring6di.controllers.i18n.Myi18NController;

// @ActiveProfiles("EN")
@SpringBootTest
public class EnglishGreetingServiceTest {
    @Autowired
    Myi18NController myi18NController;

    @Test
    void testSayGreeting() {
        System.out.println(myi18NController.sayHello());
    }
}
