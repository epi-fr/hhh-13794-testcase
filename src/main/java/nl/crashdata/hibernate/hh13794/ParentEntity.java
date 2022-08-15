package nl.crashdata.hibernate.hh13794;

import java.sql.Timestamp;

public class ParentEntity {
    private Timestamp changedAt;
    private String changedBy;

    public Timestamp getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Timestamp changedAt) {
        this.changedAt = changedAt;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }
}
