package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.NavbarEnterprise;
import vn.sesgroup.repository.NavbarEnterpriseRepository;


import java.util.Optional;

@Controller
public class NavbarEnterpriseController {

    @Autowired
    private NavbarEnterpriseRepository navbarEnterpriseRepository;

    @RequestMapping("/enterprise-vnpt")
    public String EnterpriseViews(Model model){
        model.addAttribute("navbarEnterprise", navbarEnterpriseRepository.findAll());
        return "Admin/NavbarEnterprise/NavbarEnterprise-list";
    }

    @RequestMapping("/enterprise-vnpt-view/{id}")
    public String viewDetailEnterprise(@PathVariable String id, Model model) {
        Optional<NavbarEnterprise> navbarInternetTV = navbarEnterpriseRepository.findById(id);
        if(navbarInternetTV.isPresent()){
            model.addAttribute("navbarEnterprise", navbarInternetTV.get());
        }
        return "Admin/NavbarEnterprise/NavbarEnterprise-view";
    }

    @RequestMapping("/enterprise-vnpt-add")
    public String insertEnterprise(Model model) {
        model.addAttribute("navbarEnterprise", new NavbarEnterprise());
        return "Admin/NavbarEnterprise/NavbarEnterprise-add";
    }


    @RequestMapping("/enterprise-vnpt-save")
    public String doSaveEnterprise(@ModelAttribute("NavbarInternetTV") NavbarEnterprise navbarEnterprise, Model model) {
        navbarEnterpriseRepository.save(navbarEnterprise);
        model.addAttribute("navbarEnterprise", navbarEnterpriseRepository.findAll());
        return "Admin/NavbarEnterprise/NavbarEnterprise-list";
    }

    @RequestMapping("/enterprise-vnpt-update/{id}")
    public String updateEnterprise(@PathVariable String id, Model model){
        Optional<NavbarEnterprise> navbarEnterprise = navbarEnterpriseRepository.findById(id);
        if(navbarEnterprise.isPresent()){
            model.addAttribute("navbarEnterprise", navbarEnterprise.get());
        }
        return "Admin/NavbarEnterprise/NavbarEnterprise-update";
    }

    @RequestMapping("/enterprise-vnpt-update-save")
    public String doSaveUpdateEnterprise(@ModelAttribute("NavbarEnterprise") NavbarEnterprise navbarEnterprise, Model model){
        navbarEnterpriseRepository.save(navbarEnterprise);
        model.addAttribute("navbarEnterprise", navbarEnterpriseRepository.findAll());
        return "Admin/NavbarEnterprise/NavbarEnterprise-list";
    }

    @RequestMapping("/enterprise-vnpt-delete/{id}")
    public String deleteEnterprise(@PathVariable String id, Model model){
        navbarEnterpriseRepository.deleteById(id);
        model.addAttribute("navbarEnterprise", navbarEnterpriseRepository.findAll());
        return "Admin/NavbarEnterprise/NavbarEnterprise-list";
    }

}
