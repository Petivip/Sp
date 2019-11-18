

package com.example.demo;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/form")
    public String entryform(Model model){
        model.addAttribute("emp",new Employee());
        return "entryform";

    }
    @PostMapping("/form")
    public String postform(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee",employee);
        return "postform";
    }
}
