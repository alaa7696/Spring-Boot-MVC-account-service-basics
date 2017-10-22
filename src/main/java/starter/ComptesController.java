package starter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComptesController {

    @RequestMapping("/accounts")
    public String getComptes() {
        return "too much accounts";
    }

}
