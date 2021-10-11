package pl.szymonleyk.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.szymonleyk.springboot.model.Adres;
import pl.szymonleyk.springboot.repository.AdresRepository;

import java.util.List;

@RestController
public class AdresController {

    @Autowired
    AdresRepository adresRepository;

    @GetMapping("/addresses")
    public List<Adres> findAll(){
        return adresRepository.findAll();
    }
}
