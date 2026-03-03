package ma.gestion.classes;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tache")
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateDebut;
    private Date dateFin;
    private double prix ;
    @OneToMany(mappedBy = "tache")
    private List<EmployeTache> employeesTache;

    @ManyToOne
    private Projet projet;

    public Tache() {}

    public Tache( Date dateDebut, Date dateFin, double prix, List<EmployeTache> employeesTache, Projet projet) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.employeesTache = employeesTache;
        this.projet = projet;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<EmployeTache> getEmployeesTache() {
        return employeesTache;
    }

    public void setEmployeesTache(List<EmployeTache> employeesTache) {
        this.employeesTache = employeesTache;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", prix=" + prix +
                ", employeesTache=" + employeesTache +
                ", projet=" + projet +
                '}';
    }
}


