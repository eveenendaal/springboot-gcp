package co.veenendaal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Demo extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo.class, args);
    }

    @RequestMapping({"/"})
    @ResponseBody
    public String blank() {
        return "It Worked!";
    }

}
