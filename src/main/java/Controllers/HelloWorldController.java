package Controllers;

import Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class HelloWorldController {
    @Autowired
    HelloWorldService hws;

    @GetMapping("/")
    public String getMethod(){
        return hws.getMethod();
    }

    @PostMapping("/")
    public String postMethod(){
        return hws.postMethod();
    }

    @PutMapping("/")
    public String putMethod(){
        return hws.putMethod();
    }

    @DeleteMapping("/")
    public String deleteMethod(){
        return hws.deleteMethod();
}
}
