package j2eebs.controller.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiachiliu on 11/21/14.
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    @RequestMapping("/home")
    public ModelAndView home() {
        System.out.println("Access Hello World Home");
        return new ModelAndView("helloworld/home");
    }

}
