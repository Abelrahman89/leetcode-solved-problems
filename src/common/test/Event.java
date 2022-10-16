package common.test;


import java.time.LocalDateTime;

public class Event {
    String description;
    LocalDateTime fromTime;
    LocalDateTime toTime;

    public Event() {
    }

    public Event(String description, LocalDateTime fromTime, LocalDateTime toTime) {
        this.description = description;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public LocalDateTime getFromTime() {
        return fromTime;
    }

    public LocalDateTime getToTime() {
        return toTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "Event Name "+this.getDescription() +" "+
         "Event from Date "+this.getFromTime() +" "+
         "Event to Date  "+this.getToTime() ;
    }

}


