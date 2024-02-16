package it.fides.testVersionSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.fides.testVersionSpring.model.Entitities.LibroEntity;
import it.fides.testVersionSpring.services.LibroService;

@RestController
@RequestMapping("/libri")
public class LibroController {
	
    @Autowired
    private LibroService libroService;
    
    @GetMapping
    public List<LibroEntity> getOrdineLibriVista() {
    	
    	return libroService.getOrdineLibri();
    }

}
