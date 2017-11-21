package projekt.inz.pojo;
// Generated 2017-11-18 19:09:28 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Doktor generated by hbm2java
 */
public class Doktor  implements java.io.Serializable {


     private Integer idDoktor;
     private String imie;
     private String nazwisko;
     private String specjalnosc;
     private String login;
     private String haslo;
     private String email;
     private String role;

    public Doktor() {
    }

	
    public Doktor(String imie, String nazwisko, String specjalnosc, String login, String haslo, String email, String role) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalnosc = specjalnosc;
        this.login = login;
        this.haslo = haslo;
        this.email = email;
        this.role = role;
    }
   
    public Integer getIdDoktor() {
        return this.idDoktor;
    }
    
    public void setIdDoktor(Integer idDoktor) {
        this.idDoktor = idDoktor;
    }
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getSpecjalnosc() {
        return this.specjalnosc;
    }
    
    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getHaslo() {
        return this.haslo;
    }
    
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}


