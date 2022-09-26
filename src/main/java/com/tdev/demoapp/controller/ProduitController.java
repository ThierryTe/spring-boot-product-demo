package com.tdev.demoapp.controller;

import com.tdev.demoapp.models.Produit;
import com.tdev.demoapp.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produit")
@AllArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody  Produit produit){
        return produitService.creer(produit);
    }

    @GetMapping("/get")
    public List<Produit> get(){
        return produitService.lire();
    }
    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id,produit);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
}
