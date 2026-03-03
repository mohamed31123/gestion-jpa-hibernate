package ma.gestion.classes;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class EmployeTache {
    @EmbeddedId
    private EmployeTacheFK id ;
    private Date  dateDebutReel ;
    private Date  dateFinReel ;
    @ManyToOne
    private Tache tache ;

    @ManyToOne
    private Employe employee;
    public EmployeTache(){}

    public EmployeTache(Date dateDebutReel, Date dateFinReel, Tache tache, Employe employee) {
        this.dateDebutReel = dateDebutReel;
        this.dateFinReel = dateFinReel;
        this.tache = tache;
        this.employee = employee;
    }

    public EmployeTacheFK getId() {
        return id;
    }

    public void setId(EmployeTacheFK id) {
        this.id = id;
    }

    public Date getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(Date dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    public Date getDateFinReel() {
        return dateFinReel;
    }

    public void setDateFinReel(Date dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public Employe getEmployee() {
        return employee;
    }

    public void setEmployee(Employe employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeTache{" +
                "id=" + id +
                ", dateDebutReel=" + dateDebutReel +
                ", dateFinReel=" + dateFinReel +
                ", tache=" + tache +
                ", employee=" + employee +
                '}';
    }
}
