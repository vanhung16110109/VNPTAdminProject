package vn.sesgroup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.sesgroup.model.PageInternet;
import vn.sesgroup.repository.PageInternetRepository;

import java.util.Optional;

@Controller
public class PageInternetController {

    @Autowired
    private PageInternetRepository pageInternetRepository;


    @RequestMapping(value="/page-internet-abcxyz")
    public String InternetPage() {
        return "Client/TrangInternet";
    }

    @RequestMapping("/page-internet")
    public String PageInternetViews(Model model){
        model.addAttribute("pageInternet", pageInternetRepository.findAll());
        return "Admin/PageInternet/PageInternet-list";
    }

    @RequestMapping("/page-internet-view/{id}")
    public String viewDetailPageInternet(@PathVariable String id, Model model) {
        Optional<PageInternet> pageInternet = pageInternetRepository.findById(id);
        if(pageInternet.isPresent()){
            model.addAttribute("pageInternet", pageInternet.get());
        }
        return "Admin/PageInternet/PageInternet-view";
    }

    @RequestMapping("/page-internet-add")
    public String insertPageInternet(Model model) {
        model.addAttribute("pageInternet", new PageInternet());
        return "Admin/PageInternet/PageInternet-add";
    }


    @RequestMapping("/page-internet-save")
    public String doSavePageInternet(@ModelAttribute("PageInternet") PageInternet pageInternet, Model model) {
        pageInternetRepository.save(pageInternet);
        model.addAttribute("pageInternet", pageInternetRepository.findAll());
        return "Admin/PageInternet/PageInternet-list";
    }

    @RequestMapping("/page-internet-update/{id}")
    public String updatePageInternet(@PathVariable String id, Model model){
        Optional<PageInternet> pageInternet = pageInternetRepository.findById(id);
        if(pageInternet.isPresent()){
            model.addAttribute("pageInternet", pageInternet.get());
        }
        return "Admin/PageInternet/PageInternet-update";
    }

    @RequestMapping("/page-internet-update-save")
    public String doSaveUpdatePageInternet(@ModelAttribute("PageInternet") PageInternet pageInternet, Model model){
        pageInternetRepository.save(pageInternet);
        model.addAttribute("pageInternet", pageInternetRepository.findAll());
        return "Admin/PageInternet/PageInternet-list";
    }

    @RequestMapping("/page-internet-delete/{id}")
    public String deletePageInternet(@PathVariable String id, Model model){
        pageInternetRepository.deleteById(id);
        model.addAttribute("pageInternet", pageInternetRepository.findAll());
        return "Admin/PageInternet/PageInternet-list";
    }

}
