package j2eebs.controller.jackson;

import j2eebs.pojo.ToDoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;


@Controller
@RequestMapping("/rest")
public class JSONController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public
    @RequestMapping("/todoitem/{id}")
    @ResponseBody
    ToDoItem toDoItem(@PathVariable Long id) {
        logger.info("Access json toDoItem.");
        ToDoItem item = new ToDoItem();
        item.setDatetime(new Date(System.currentTimeMillis()));
        item.setId(id);
        item.setDescription("A dummy item");
        return item;
    }
}
