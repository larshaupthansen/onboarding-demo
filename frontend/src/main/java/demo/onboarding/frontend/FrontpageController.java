package demo.onboarding.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontpageController {
    


    @GetMapping("/frontpage")
	public String frontpage(Model model) {
		model.addAttribute("name", "Test");
		return "frontpage";
	}
}
