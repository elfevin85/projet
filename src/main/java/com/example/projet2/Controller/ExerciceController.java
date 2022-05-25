package com.example.projet2.Controller;


import com.example.projet2.Service.ExerciceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exercice")
public class ExerciceController {

    private final ExerciceService exerciceService;

    public ExerciceController(ExerciceService exerciceService) {
        this.exerciceService = exerciceService;
    }

    @GetMapping
    public String showCoachPage(Model model) {

        model.addAttribute("exercices",
                exerciceService.readAllExo());
        return "pages/exo/exercicePresentation";
    }

    //All the filter for the table ---------------------------------------------------------------
    @RequestMapping(value="/sortByJambe")
    public String SortByJambe(Model model) {
        model.addAttribute("exercices", exerciceService.readAllExoByJambes());
        return "pages/exo/exercicePresentation";
    }

    @RequestMapping(value="/sortByChest")
    public String SortByChest(Model model) {
        model.addAttribute("exercices", exerciceService.readAllExoByChest());
        return "pages/exo/exercicePresentation";
    }

    @RequestMapping(value="/sortByEpaule")
    public String SortByEpaule(Model model) {
        model.addAttribute("exercices", exerciceService.readAllExoByEpaule());
        return "pages/exo/exercicePresentation";
    }

    @RequestMapping(value="/sortByDos")
    public String SortByDos(Model model) {
        model.addAttribute("exercices", exerciceService.readAllExoByDos());
        return "pages/exo/exercicePresentation";
    }

    @RequestMapping(value="/Reset")
    public String ResetTable(Model model) {
        model.addAttribute("exercices", exerciceService.readAllExo());
        return "pages/exo/exercicePresentation";
    }
}
