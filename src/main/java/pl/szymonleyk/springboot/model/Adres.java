package pl.szymonleyk.springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="adres")
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ulica;

    @Column(name="nr_domu")
    private String nrDomu;

    @Column(name = "nr_mieszkania")
    private Integer nrMieszkania;

    @Column(name="kod_pocztowy")
    private String kodPocztowy;

    private String miejscowosc;
}
