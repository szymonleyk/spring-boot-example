package pl.szymonleyk.springboot.comparator;

import pl.szymonleyk.springboot.model.Adres;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class AddressByCityComparator implements Comparator<Adres> {

    @Override
    public int compare(Adres o1, Adres o2) {
        Collator polishCollator = Collator.getInstance(new Locale("pl", "PL"));
        return polishCollator.compare(o1.getMiejscowosc(), o2.getMiejscowosc());
    }
}
