package company.newlife.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

    @GetMapping("/service")
    public String goToService() {
        return "client/service";
    }
}
