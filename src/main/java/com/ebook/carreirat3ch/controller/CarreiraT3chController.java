package com.ebook.carreirat3ch.controller;

import com.ebook.carreirat3ch.domain.CarreiraT3ch;
import com.ebook.carreirat3ch.service.CarreiraT3chService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarreiraT3chController {

    @Autowired
    CarreiraT3chService carreiraT3chService;

    @GetMapping("/mT3ch-ebook")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-ebook")
    public String cadastrarEbook(CarreiraT3ch carreiraT3ch) {
        carreiraT3chService.criarLead(carreiraT3ch);
        return "pages/ebook";
    }


    @GetMapping("/mT3ch-receber-ebook")
    public ModelAndView receberEbook() {
        ModelAndView model = new ModelAndView("pages/ebook");
        Iterable<CarreiraT3ch> carreiraT3ches = carreiraT3chService.exibirPageEbook();
        model.addObject("carreiraT3ches", carreiraT3ches);
        return model;
    }


}
