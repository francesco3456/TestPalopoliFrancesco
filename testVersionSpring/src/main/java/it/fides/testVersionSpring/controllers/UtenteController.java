package it.fides.testVersionSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.fides.testVersionSpring.model.Entitities.LibroEntity;
import it.fides.testVersionSpring.model.Entitities.UtenteEntity;
import it.fides.testVersionSpring.services.UtenteService;


@RestController
@RequestMapping("/utenti")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;
    
    @GetMapping
    public List<UtenteEntity> getAllUtenti() {
        return utenteService.getAllUtenti();
    }
    @PostMapping
    public UtenteEntity insertUtente(@RequestBody UtenteEntity utenteEntity) {
    	System.out.println(utenteEntity.toString());    
    	return utenteService.insertUtente(utenteEntity);
    }
    
    @GetMapping("/giovani")
    public List<UtenteEntity> getUtentiGiovani() {
        return utenteService.findByGiovani();
    }
    
    @GetMapping("/giovani/consonanti")
    public List<UtenteEntity> getUtentiConsonanti () {
    	return utenteService.findByConsonante();
    }
    
    @GetMapping("/maxLibriAcquistati")
    public UtenteEntity getUtenteMaxLibriAcquistati() {
    	return utenteService.findByMaxLibriAcquistati();
    }
    
    @PutMapping("/assegnaLibri")
    public String assegnaLibriUtenti (UtenteEntity utente ,List<LibroEntity> libri) {
    	return utenteService.associaLibri(utente, libri);
    }
}
