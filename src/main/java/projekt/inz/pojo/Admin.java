package projekt.inz.pojo;
// Generated 2017-11-18 19:09:28 by Hibernate Tools 4.3.1



/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private Integer idAdmina;
     private String login;
     private String haslo;
     private String role;

    public Admin() {
    }

    public Admin(String login, String haslo, String role) {
       this.login = login;
       this.haslo = haslo;
       this.role = role;
    }
   
    public Integer getIdAdmina() {
        return this.idAdmina;
    }
    
    public void setIdAdmina(Integer idAdmina) {
        this.idAdmina = idAdmina;
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
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }




}


