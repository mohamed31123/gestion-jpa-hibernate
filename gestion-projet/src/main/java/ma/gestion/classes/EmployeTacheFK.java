package ma.gestion.classes;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EmployeTacheFK {
    private int idTache;
    private int idEmployee;
    public EmployeTacheFK() {}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeTacheFK that = (EmployeTacheFK) o;
        return idTache == that.idTache && idEmployee == that.idEmployee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTache, idEmployee);
    }
}
