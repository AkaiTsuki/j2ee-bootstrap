package j2eebs.controller.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiachiliu on 11/21/14.
 */
@Controller
public class ExampleController {

    @RequestMapping("/home")
    public ModelAndView home() {
        System.out.println("Access Example Home");
        return new ModelAndView("example");
    }
}
