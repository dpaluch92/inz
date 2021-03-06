package projekt.inz.pojo;
// Generated 2018-01-05 19:10:37 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Artykul generated by hbm2java
 */
@Entity
@Table(name="artykul"
    ,catalog="inz"
)
public class Artykul  implements java.io.Serializable {


     private Integer idArtykulu;
     private Doktor doktor;
     private String tytul;
     private String opis;
     private Date dataDodania;

    public Artykul() {
    }

    public Artykul(Doktor doktor, String tytul, String opis, Date dataDodania) {
       this.doktor = doktor;
       this.tytul = tytul;
       this.opis = opis;
       this.dataDodania = dataDodania;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_artykulu", unique=true, nullable=false)
    public Integer getIdArtykulu() {
        return this.idArtykulu;
    }
    
    public void setIdArtykulu(Integer idArtykulu) {
        this.idArtykulu = idArtykulu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_doktora_fk", nullable=false)
    public Doktor getDoktor() {
        return this.doktor;
    }
    
    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    
    @Column(name="tytul", nullable=false, length=30)
    public String getTytul() {
        return this.tytul;
    }
    
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    
    @Column(name="opis", nullable=false, length=250)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_dodania", nullable=false, length=19)
    public Date getDataDodania() {
        return this.dataDodania;
    }
    
    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }




}


