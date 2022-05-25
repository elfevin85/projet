package com.example.projet2.Controller;

import com.example.projet2.Model.Aliment;
import com.example.projet2.Service.AlimentService;
import com.example.projet2.view.SearchViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Optional;

@Controller
@RequestMapping("nutrition")
public class AlimentController {

    private final AlimentService alimentService;

    public AlimentController(AlimentService alimentService) {
        this.alimentService = alimentService;
    }

    @GetMapping
    public String showAlimentPage(Model model, @ModelAttribute("search") SearchViewModel search) {
        model.addAttribute("aliments",
                alimentService.readAllAliment());
        return "pages/aliment/alimentList";
    }

    @GetMapping("/executeSearch")
    public String searchAliment(@ModelAttribute("search") SearchViewModel search, Model model) {
        Collection<Aliment> aliments = alimentService.searchAliment(search.getQuery());
        model.addAttribute("search", search);
        model.addAttribute("aliments", aliments);
        return "pages/aliment/alimentList";
    }
}