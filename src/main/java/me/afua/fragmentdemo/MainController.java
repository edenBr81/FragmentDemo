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

    @RequestMapping("/listrecipes")
    public String showListRecipes(Model model) {
        model.addAttribute("menuoption", "List Recipes");
        return "listrecipes";
    }

    @RequestMapping("/makroudhs")
    public String showMakroudhs(Model model)
    {
        model.addAttribute("menuoption","makroudhs");
        return "makroudhs";
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

    @RequestMapping("/wings")
    public String showWings(Model model) {
        model.addAttribute("menuoption", "wings");
        return "wings";
    }

    @RequestMapping("/eggsauce")
    public String showEggsauce(Model model) {
        model.addAttribute("menuoption", "eggsauce");
        return "eggsauce";
    }

    @RequestMapping("/recipe")
    public String showRecipe(Model model) {
        model.addAttribute("menuoption", "wings");
        return "wings";
    }

    @RequestMapping("/pumpkin")
    public String showPumpkin(Model model)
    {
        model.addAttribute("menuoption", "pumpkin");
        return "pumpkin";
    }


}

