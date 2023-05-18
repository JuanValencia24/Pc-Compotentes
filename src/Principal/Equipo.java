
package Principal;


public class Equipo {
    String IdeEquip;
    String modelo;
    String problemas;
    String estado;
    String IdePerson;

    public Equipo() {
    }

    public Equipo(String IdeEquip, String modelo, String problemas, String estado, String IdePerson) {
        this.IdeEquip = IdeEquip;
        this.modelo = modelo;
        this.problemas = problemas;
        this.estado = estado;
        this.IdePerson = IdePerson;
    }

    public String getIdeEquip() {
        return IdeEquip;
    }

    public void setIdeEquip(String IdeEquip) {
        this.IdeEquip = IdeEquip;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdePerson() {
        return IdePerson;
    }

    public void setIdePerson(String IdePerson) {
        this.IdePerson = IdePerson;
    }
    
    

    
}
