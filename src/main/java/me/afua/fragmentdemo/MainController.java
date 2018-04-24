package me.afua.fragmentdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showIndex(Model model) {
        //This displays
        model.addAttribute("menuoption", "home");
        return "index";
    }

    @RequestMapping("/firstlink")
    public String showFirstLink(Model model)
    {

        model.addAttribute("menuoption","firstlink");
        return "firstlink";
    }
    @RequestMapping("/injera")
    public String showInjera(Model model)
    {
        model.addAttribute("menuoption","injera");
        return "injera";
    }

    @RequestMapping("/kitfo")
    public String showKitfo(Model model) {
        model.addAttribute("menuoption", "kitfo");
        return "kitfo";
    }


    @RequestMapping("/eggsauce")
    public String showEggsauce(Model model) {
        model.addAttribute("menuoption", "eggsauce");
        return "eggsauce";
    }

    @RequestMapping("/recipe")
    public String showRecipe(Model model) {
        model.addAttribute("menuoption", "recipe");
        return "recipe";
    }

        @RequestMapping("/pumpkin")
    public String showPumpkin(Model model)
        {
            model.addAttribute("menuoption", "pumpkin");
            return "pumpkin";
        }


}

