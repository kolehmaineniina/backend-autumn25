package kevat25.week1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class MyController {

    @RequestMapping("/main")
    public String returnMessage() {
        return "Eka SB-sovellukseni";
    }

    @RequestMapping("/sayHello")
    public String returnGreeting(@RequestParam (name = "nimesi", required = false, defaultValue = "Muumi") String etunimi) {
        return "Hei " + etunimi;
    }
    
    @RequestMapping("/index")
    public String indexMessage() {
        return "This is main page";
    }
    
    @RequestMapping("/contact")
    public String contactMessage() {
        return "This is contact page";
    }
    
}
