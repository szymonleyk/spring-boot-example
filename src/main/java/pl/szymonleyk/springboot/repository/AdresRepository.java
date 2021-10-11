package pl.szymonleyk.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szymonleyk.springboot.model.Adres;

@Repository
public interface AdresRepository extends JpaRepository<Adres, Integer> {
}
