package com.example.web_bdd.controller;
import java.util.List;
import com.example.web_bdd.dao.impl.PersonneRepository;
import com.example.web_bdd.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PersonneController {
    @Autowired
    private PersonneRepository repo;
    
    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model) {
        model.addAttribute("personne", new Personne());
        return "formulaire";
    }
    
    @PostMapping("/ajouterPersonne")
    public String enregistrerPersonne(@ModelAttribute("personne") Personne personne) {
        if (personne != null)
            repo.save(personne);
        return "redirect:/";
    }

    @GetMapping("/")
    public String afficherToutesLesPersonnes(Model model) {
        List<Personne> personnes = repo.findAll();
        model.addAttribute("personnes", personnes);
        return "index";
}
}

