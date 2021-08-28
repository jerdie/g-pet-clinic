package com.gerard.gpetclinic.person.vet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService ownerService) {
        this.vetService = ownerService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listOwners(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
