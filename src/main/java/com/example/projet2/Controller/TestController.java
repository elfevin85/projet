package com.example.projet2.Controller;

import com.example.projet2.Service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("test")
public class TestController {

private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping
    public String showCustomerPage(Model model) {
        model.addAttribute("tests",
                testService.readAllTest());
        return "pages/showTest";
    }
}
