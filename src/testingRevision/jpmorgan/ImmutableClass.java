package testingRevision.jpmorgan;

import java.util.Date;

public final class ImmutableClass {
    private Date dt;

    public ImmutableClass(Date dt) {
        this.dt = (Date) dt.clone();
    }

    public Date getDt() {
        return (Date) dt.clone();
        //  return returnedDate;
    }
}
