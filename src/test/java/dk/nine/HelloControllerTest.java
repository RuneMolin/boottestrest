package dk.nine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void saysHello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/", String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Hello World", responseEntity.getBody());
    }

}
