import java.util.Objects;

public class Przedmiot {
    private String nazwaPrzedmiotu;
    private int liczbaPunktow;
    public Przedmiot(String nazwaPrzedmiotu){
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;

    }
    public Przedmiot(){

    }
    public String getNazwaPrzedmiotu(){
        return
                nazwaPrzedmiotu;
    }
    public void
    setNazwaPrzedmiot(String nazwaPrzedmiotu){
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Przedmiot(int liczbaPunktow) {
        this.liczbaPunktow = liczbaPunktow;
    }

    public int getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public void setLiczbaPunktow(int liczbaPunktow) {
        this.liczbaPunktow = liczbaPunktow;
    }
    public String toString()
    {
        return
                nazwaPrzedmiotu + "-" + liczbaPunktow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return liczbaPunktow == przedmiot.liczbaPunktow && Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, liczbaPunktow);
    }
}
