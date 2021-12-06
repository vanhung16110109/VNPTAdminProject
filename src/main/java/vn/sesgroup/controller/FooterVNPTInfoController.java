package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.FooterVNPTInfo;
import vn.sesgroup.repository.FooterVNPTInfoRepository;

import java.util.Optional;

@Controller
public class FooterVNPTInfoController {

    @Autowired
    private FooterVNPTInfoRepository footerVNPTInfoRepository;

    @RequestMapping(value = {"/VNPTInfo-views", "/vnptinfo-views"})
    public String footerVPNTInfoView(Model model){
        model.addAttribute("listVNPTInfo", footerVNPTInfoRepository.findAll());
        return "Admin/footerVNPTInfo/footerVNPTInfo-list";
    }

    @RequestMapping(value = {"/VNPTInfo-add", "/vnptinfo-add"})
    public String insertCustomer(Model model) {
        model.addAttribute("footerVNPTInfo", new FooterVNPTInfo());

        return "Admin/footerVNPTInfo/footerVNPTInfo-add";
    }


    @RequestMapping("/VNPTInfo-save")
    public String doSaveVNPTInfo(@ModelAttribute("FooterVNPTInfo") FooterVNPTInfo footerVNPTInfo, Model model) {
        footerVNPTInfoRepository.save(footerVNPTInfo);
        model.addAttribute("listVNPTInfo", footerVNPTInfoRepository.findAll());
        return "Admin/footerVNPTInfo/footerVNPTInfo-list";
    }


    @RequestMapping("/VNPTInfo-update/{id}")
    public String updateVNPTInfo(@PathVariable String id, Model model) {
        Optional<FooterVNPTInfo> footerVNPTInfo = footerVNPTInfoRepository.findById(id);
        if (footerVNPTInfo.isPresent()) {
            model.addAttribute("footerVNPTInfo", footerVNPTInfo.get());
        }
        return "Admin/footerVNPTInfo/footerVNPTInfo-update";
    }


    @RequestMapping("/VNPTInfo-saveUpdate")
    public String doUpdateVNPTInfo(@ModelAttribute("FooterVNPTInfo") FooterVNPTInfo footerVNPTInfo, Model model) {
        footerVNPTInfoRepository.save(footerVNPTInfo);
        model.addAttribute("listVNPTInfo", footerVNPTInfoRepository.findAll());
        return "Admin/footerVNPTInfo/footerVNPTInfo-list";
    }

    @RequestMapping("/VNPTInfo-delete/{id}")
    public String doDeleteCustomer(@PathVariable String id, Model model) {
        footerVNPTInfoRepository.deleteById(id);
        model.addAttribute("listVNPTInfo", footerVNPTInfoRepository.findAll());
        return "Admin/footerVNPTInfo/footerVNPTInfo-list";
    }
}
