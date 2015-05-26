package pbannon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WelcomeController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/welcome", method=RequestMethod.GET)
    public String welcomeForm(Model model) {
        model.addAttribute("welcome", new Welcome(counter.incrementAndGet()));
        return "welcome";
    }

    @RequestMapping(value="/welcome", method=RequestMethod.POST)
    public String welcomeSubmit(@ModelAttribute Welcome welcome, Model model) {
        model.addAttribute("welcome", welcome);
        return "result";
    }
}
