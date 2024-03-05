import java.util.List;
import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private int rokStudiow;
    public List<Przedmiot> listaprzedmiotow;

    public Student(String imie, String nazwisko, int numerIndeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public List<Przedmiot> getListaprzedmiotow() {
        return listaprzedmiotow;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNnumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void setListaprzedmiotow(List<Przedmiot> listaprzedmiotow) {
        this.listaprzedmiotow = listaprzedmiotow;
    }
    public void
    dodajPrzedmiot(Przedmiot przedmiot){
        listaprzedmiotow.add(przedmiot);
    }

    @Override
    public String toString() {
        return "Student: " + imie + " " + nazwisko + "(Indeks: " + numerIndeksu + ",Rok Studiow: " + rokStudiow + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu && rokStudiow == student.rokStudiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(listaprzedmiotow, student.listaprzedmiotow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerIndeksu, rokStudiow, listaprzedmiotow);
    }

}
