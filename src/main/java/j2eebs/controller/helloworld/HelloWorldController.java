package j2eebs.controller.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiachiliu on 11/21/14.
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/home")
    public ModelAndView home() {
        logger.info("Access example home page.");
        return new ModelAndView("helloworld/home");
    }

}
