package com.tdev.demoapp.repository;

import com.tdev.demoapp.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
