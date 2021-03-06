package projekt.inz.pojo;
// Generated 2018-01-05 19:10:37 by Hibernate Tools 4.3.1


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
 * Skrzynka generated by hbm2java
 */
@Entity
@Table(name="skrzynka"
    ,catalog="inz"
)
public class Skrzynka  implements java.io.Serializable {


     private Integer idWiadomosci;
     private Doktor doktor;
     private Pacjent pacjent;
     private String opis;

    public Skrzynka() {
    }

    public Skrzynka(Doktor doktor, Pacjent pacjent, String opis) {
       this.doktor = doktor;
       this.pacjent = pacjent;
       this.opis = opis;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_wiadomosci", unique=true, nullable=false)
    public Integer getIdWiadomosci() {
        return this.idWiadomosci;
    }
    
    public void setIdWiadomosci(Integer idWiadomosci) {
        this.idWiadomosci = idWiadomosci;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_doktora_fk", nullable=false)
    public Doktor getDoktor() {
        return this.doktor;
    }
    
    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pacjenta_fk", nullable=false)
    public Pacjent getPacjent() {
        return this.pacjent;
    }
    
    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    
    @Column(name="opis", nullable=false, length=200)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }




}


