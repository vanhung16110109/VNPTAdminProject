package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.NavbarVNPTIDC;
import vn.sesgroup.repository.NavbarVNPTIDCRepository;


import java.util.Optional;

@Controller
public class NavbarVNPTIDCController {

    @Autowired
    private NavbarVNPTIDCRepository NavbarVNPTIDCRepository;

    @RequestMapping("/vnptidc")
    public String VNPTIDCViews(Model model){
        model.addAttribute("navbarVNPTIDC", NavbarVNPTIDCRepository.findAll());
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-list";
    }

    @RequestMapping("/vnptidc-view/{id}")
    public String viewDetailVNPTIDC(@PathVariable String id, Model model) {
        Optional<NavbarVNPTIDC> NavbarVNPTIDC = NavbarVNPTIDCRepository.findById(id);
        if(NavbarVNPTIDC.isPresent()){
            model.addAttribute("navbarVNPTIDC", NavbarVNPTIDC.get());
        }
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-view";
    }

    @RequestMapping("/vnptidc-add")
    public String insertVNPTIDC(Model model) {
        model.addAttribute("navbarVNPTIDC", new NavbarVNPTIDC());
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-add";
    }


    @RequestMapping("/vnptidc-save")
    public String doSaveVNPTIDC(@ModelAttribute("NavbarVNPTIDC") NavbarVNPTIDC NavbarVNPTIDC, Model model) {
        NavbarVNPTIDCRepository.save(NavbarVNPTIDC);
        model.addAttribute("navbarVNPTIDC", NavbarVNPTIDCRepository.findAll());
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-list";
    }

    @RequestMapping("/vnptidc-update/{id}")
    public String updateVNPTIDC(@PathVariable String id, Model model){
        Optional<NavbarVNPTIDC> NavbarVNPTIDC = NavbarVNPTIDCRepository.findById(id);
        if(NavbarVNPTIDC.isPresent()){
            model.addAttribute("navbarVNPTIDC", NavbarVNPTIDC.get());
        }
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-update";
    }

    @RequestMapping("/vnptidc-update-save")
    public String doSaveUpdateVNPTIDCe(@ModelAttribute("NavbarVNPTIDC") NavbarVNPTIDC NavbarVNPTIDC, Model model){
        NavbarVNPTIDCRepository.save(NavbarVNPTIDC);
        model.addAttribute("navbarVNPTIDC", NavbarVNPTIDCRepository.findAll());
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-list";
    }

    @RequestMapping("/vnptidc-delete/{id}")
    public String deleteVNPTIDC(@PathVariable String id, Model model){
        NavbarVNPTIDCRepository.deleteById(id);
        model.addAttribute("navbarVNPTIDC", NavbarVNPTIDCRepository.findAll());
        return "Admin/NavbarVNPTIDC/NavbarVNPTIDC-list";
    }

}
