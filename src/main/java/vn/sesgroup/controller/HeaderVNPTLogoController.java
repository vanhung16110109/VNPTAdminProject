package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.FooterVNPTLogo;
import vn.sesgroup.model.HeaderVNPTLogo;
import vn.sesgroup.repository.HeaderVNPTLogoRepository;

import java.util.Optional;

@Controller
public class HeaderVNPTLogoController {

    @Autowired
    private HeaderVNPTLogoRepository headerVNPTLogoRepository;

    @RequestMapping(value = {"/headerVNPTLogo-view", "/headervnptlogo-view"})
    public String headerVNPTLogoView(Model model){
        model.addAttribute("headerVNPTLogo", headerVNPTLogoRepository.findAll());
        Optional<HeaderVNPTLogo> headerVNPTLogoabc = headerVNPTLogoRepository.findById("61aae9feec64f55c01be1eae");
        if (headerVNPTLogoabc.isPresent()) {
            model.addAttribute("headerVNPTimg", headerVNPTLogoabc.get());
        }
        return "Admin/headerVNPTLogo/headerVNPTLogo-info";
    }

    @RequestMapping("/headerVNPTLogo-update/{id}")
    public String updateVNPTLogo(@PathVariable String id, Model model) {
        Optional<HeaderVNPTLogo> headerVNPTLogo = headerVNPTLogoRepository.findById(id);
        if (headerVNPTLogo.isPresent()) {
            model.addAttribute("headerVNPTLogo", headerVNPTLogo.get());
        }
        return "Admin/headerVNPTLogo/headerVNPTLogo-update";
    }


    @RequestMapping("/headerVNPTLogo-saveUpdate")
    public String doUpdateVNPTInfo(@ModelAttribute("HeaderVNPTLogo") HeaderVNPTLogo headerVNPTLogo, Model model) {
        headerVNPTLogoRepository.save(headerVNPTLogo);
        model.addAttribute("headerVNPTLogo", headerVNPTLogoRepository.findAll());
        Optional<HeaderVNPTLogo> headerVNPTLogoabc = headerVNPTLogoRepository.findById("61aae9feec64f55c01be1eae");
        if (headerVNPTLogoabc.isPresent()) {
            model.addAttribute("headerVNPTimg", headerVNPTLogoabc.get());
        }
        return "Admin/headerVNPTLogo/headerVNPTLogo-info";
    }
}
