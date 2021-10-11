package pl.szymonleyk.springboot.model;

import javax.persistence.*;

@Entity
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public Integer getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(Integer nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }
}
