package dk.nine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }
}
