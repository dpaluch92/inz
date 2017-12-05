package projekt.inz.pojo;
// Generated 2017-12-05 17:08:29 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Rejestracja generated by hbm2java
 */
@Entity
@Table(name="rejestracja"
    ,catalog="inz"
)
public class Rejestracja  implements java.io.Serializable {


     private Integer idRejestracji;
     private Wizyta wizyta;
     private String imie;
     private String nazwisko;
     private String login;
     private String haslo;

    public Rejestracja() {
    }

	
    public Rejestracja(String imie, String nazwisko, String login, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
    }
    public Rejestracja(Wizyta wizyta, String imie, String nazwisko, String login, String haslo) {
       this.wizyta = wizyta;
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.login = login;
       this.haslo = haslo;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_rejestracji", unique=true, nullable=false)
    public Integer getIdRejestracji() {
        return this.idRejestracji;
    }
    
    public void setIdRejestracji(Integer idRejestracji) {
        this.idRejestracji = idRejestracji;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_wizyty_fk")
    public Wizyta getWizyta() {
        return this.wizyta;
    }
    
    public void setWizyta(Wizyta wizyta) {
        this.wizyta = wizyta;
    }

    
    @Column(name="imie", nullable=false, length=30)
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }

    
    @Column(name="nazwisko", nullable=false, length=30)
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    
    @Column(name="login", nullable=false, length=30)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="haslo", nullable=false, length=30)
    public String getHaslo() {
        return this.haslo;
    }
    
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }




}


