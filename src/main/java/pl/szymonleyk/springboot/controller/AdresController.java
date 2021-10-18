package pl.szymonleyk.springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.szymonleyk.springboot.model.Adres;
import pl.szymonleyk.springboot.service.AdresService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/addresses")
public class AdresController {

    AdresService adresService;

    @GetMapping
    public List<Adres> findAll(){
        return adresService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        adresService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Adres findById(@PathVariable Integer id){
        return adresService.findById(id);
    }

    @PutMapping
    public void update(@RequestBody Adres adres){
        adresService.update(adres);
    }

    @PostMapping
    public void save(@RequestBody Adres adres){
        adresService.save(adres);
    }
}
