package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.FooterVNPTInfo;
import vn.sesgroup.model.FooterVNPTLogo;
import vn.sesgroup.repository.FooterVNPTLogoRepository;

import java.util.Optional;

@Controller
public class FooterVNPTLogoController {

    @Autowired
    private FooterVNPTLogoRepository footerVNPTLogoRepository;

    @RequestMapping(value = {"/VNPTLogo-view", "/vnptlogo-view"})
    public String footerVNPTLogoView(Model model){
        model.addAttribute("footerVNPTLogo", footerVNPTLogoRepository.findAll());
        Optional<FooterVNPTLogo> footerVNPTLogoabc = footerVNPTLogoRepository.findById("61aad8cd0749d3675e4a5386");
        if (footerVNPTLogoabc.isPresent()) {
            model.addAttribute("footerVNPTimg", footerVNPTLogoabc.get());
        }
        return "Admin/footerVNPTLogo/footerVNPTLogo-info";
    }

    @RequestMapping("/VNPTLogo-update/{id}")
    public String updateVNPTLogo(@PathVariable String id, Model model) {
        Optional<FooterVNPTLogo> footerVNPTLogo = footerVNPTLogoRepository.findById(id);
        if (footerVNPTLogo.isPresent()) {
            model.addAttribute("footerVNPTLogo", footerVNPTLogo.get());
        }
        return "Admin/footerVNPTLogo/footerVNPTLogo-update";
    }


    @RequestMapping("/VNPTLogo-saveUpdate")
    public String doUpdateVNPTLogo(@ModelAttribute("FooterVNPTLogo") FooterVNPTLogo footerVNPTLogo, Model model) {
        footerVNPTLogoRepository.save(footerVNPTLogo);
        model.addAttribute("footerVNPTLogo", footerVNPTLogoRepository.findAll());
        Optional<FooterVNPTLogo> footerVNPTLogoabc = footerVNPTLogoRepository.findById("61aad8cd0749d3675e4a5386");
        if (footerVNPTLogoabc.isPresent()) {
            model.addAttribute("footerVNPTimg", footerVNPTLogoabc.get());
        }
        return "Admin/footerVNPTLogo/footerVNPTLogo-info";
    }
}
