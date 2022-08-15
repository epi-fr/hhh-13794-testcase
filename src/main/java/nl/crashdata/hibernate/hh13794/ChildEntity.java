package nl.crashdata.hibernate.hh13794;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChildEntity extends ParentEntity {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
