package pl.szymonleyk.springboot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szymonleyk.springboot.comparator.AddressByCityComparator;
import pl.szymonleyk.springboot.model.Adres;
import pl.szymonleyk.springboot.repository.AdresRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AdresService {
    private AdresRepository adresRepository;

    public List<Adres> findAll(){
        List<Adres> addresses = adresRepository.findAll();
        addresses.sort(new AddressByCityComparator());
        return addresses;
    }

    public void deleteById(Integer id) {
        adresRepository.deleteById(id);
    }

    public Adres findById(Integer id) {
        Optional<Adres> maybeAdres = adresRepository.findById(id);
        return maybeAdres.orElseGet(Adres::new);
    }

    public void update(Adres adres) {
        adresRepository.save(adres);
    }

    public void save(Adres adres) {
        adresRepository.save(adres);
    }
}
