package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.FooterVNPTInfo;
import vn.sesgroup.model.NavbarInternetTV;
import vn.sesgroup.repository.NavbarInternetTVRepository;

import java.util.Optional;

@Controller
public class NavbarInternetTVController {

    @Autowired
    private NavbarInternetTVRepository navbarInternetTVRepository;

    @RequestMapping("/internet-tv")
    public String InternetTVViews(Model model){
        model.addAttribute("navbarInternetTV", navbarInternetTVRepository.findAll());
        return "Admin/NavbarInternetTV/NavbarInternetTV-list";
    }

    @RequestMapping("/internet-tv-view/{id}")
    public String viewDetailInternetTV(@PathVariable String id, Model model) {
        Optional<NavbarInternetTV> navbarInternetTV = navbarInternetTVRepository.findById(id);
        if(navbarInternetTV.isPresent()){
            model.addAttribute("navbarInternetTV", navbarInternetTV.get());
        }
        return "Admin/NavbarInternetTV/NavbarInternetTV-view";
    }

    @RequestMapping("/internet-tv-add")
    public String insertInternetTV(Model model) {
        model.addAttribute("navbarInternetTV", new NavbarInternetTV());
        return "Admin/NavbarInternetTV/NavbarInternetTV-add";
    }


    @RequestMapping("/internet-tv-save")
    public String doSaveInternetTV(@ModelAttribute("NavbarInternetTV") NavbarInternetTV navbarInternetTV, Model model) {
        navbarInternetTVRepository.save(navbarInternetTV);
        model.addAttribute("navbarInternetTV", navbarInternetTVRepository.findAll());
        return "Admin/NavbarInternetTV/NavbarInternetTV-list";
    }

    @RequestMapping("/internettv-update/{id}")
    public String updateInternetTV(@PathVariable String id, Model model){
        Optional<NavbarInternetTV> navbarInternetTV = navbarInternetTVRepository.findById(id);
        if(navbarInternetTV.isPresent()){
            model.addAttribute("navbarInternetTV", navbarInternetTV.get());
        }
        return "Admin/NavbarInternetTV/NavbarInternetTV-update";
    }

    @RequestMapping("/internettv-update-save")
    public String doSaveUpdateInternetTV(@ModelAttribute("NavbarInternetTV") NavbarInternetTV navbarInternetTV, Model model){
        navbarInternetTVRepository.save(navbarInternetTV);
        model.addAttribute("navbarInternetTV", navbarInternetTVRepository.findAll());
        return "Admin/NavbarInternetTV/NavbarInternetTV-list";
    }

    @RequestMapping("/internettv-delete/{id}")
    public String deleteInternetTV(@PathVariable String id, Model model){
        navbarInternetTVRepository.deleteById(id);
        model.addAttribute("navbarInternetTV", navbarInternetTVRepository.findAll());
        return "Admin/NavbarInternetTV/NavbarInternetTV-list";
    }

}
