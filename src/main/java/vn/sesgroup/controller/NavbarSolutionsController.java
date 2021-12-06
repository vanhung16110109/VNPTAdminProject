package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.NavbarSolutions;
import vn.sesgroup.repository.NavbarSolutionsRepository;

import java.util.Optional;

@Controller
public class NavbarSolutionsController {

    @Autowired
    private NavbarSolutionsRepository navbarSolutionsRepository;

    @RequestMapping("/solutions-vnpt")
    public String SolutionsViews(Model model){
        model.addAttribute("navbarSolutions", navbarSolutionsRepository.findAll());
        return "Admin/NavbarSolutions/NavbarSolutions-list";
    }

    @RequestMapping("/solutions-vnpt-view/{id}")
    public String viewDetailSolutions(@PathVariable String id, Model model) {
        Optional<NavbarSolutions> navbarSolutions = navbarSolutionsRepository.findById(id);
        if(navbarSolutions.isPresent()){
            model.addAttribute("navbarSolutions", navbarSolutions.get());
        }
        return "Admin/NavbarSolutions/NavbarSolutions-view";
    }

    @RequestMapping("/solutions-vnpt-add")
    public String insertSolutions(Model model) {
        model.addAttribute("navbarSolutions", new NavbarSolutions());
        return "Admin/NavbarSolutions/NavbarSolutions-add";
    }


    @RequestMapping("/solutions-vnpt-save")
    public String doSaveSolutions(@ModelAttribute("NavbarSolutions") NavbarSolutions navbarSolutions, Model model) {
        navbarSolutionsRepository.save(navbarSolutions);
        model.addAttribute("navbarSolutions", navbarSolutionsRepository.findAll());
        return "Admin/NavbarSolutions/NavbarSolutions-list";
    }

    @RequestMapping("/solutions-vnpt-update/{id}")
    public String updateSolutions(@PathVariable String id, Model model){
        Optional<NavbarSolutions> navbarSolutions = navbarSolutionsRepository.findById(id);
        if(navbarSolutions.isPresent()){
            model.addAttribute("navbarSolutions", navbarSolutions.get());
        }
        return "Admin/NavbarSolutions/NavbarSolutions-update";
    }

    @RequestMapping("/solutions-vnpt-update-save")
    public String doSaveUpdateSolutions(@ModelAttribute("NavbarSolutions") NavbarSolutions navbarSolutions, Model model){
        navbarSolutionsRepository.save(navbarSolutions);
        model.addAttribute("navbarSolutions", navbarSolutionsRepository.findAll());
        return "Admin/NavbarSolutions/NavbarSolutions-list";
    }

    @RequestMapping("/solutions-vnpt-delete/{id}")
    public String deleteSolutions(@PathVariable String id, Model model){
        navbarSolutionsRepository.deleteById(id);
        model.addAttribute("navbarSolutions", navbarSolutionsRepository.findAll());
        return "Admin/NavbarSolutions/NavbarSolutions-list";
    }

}
