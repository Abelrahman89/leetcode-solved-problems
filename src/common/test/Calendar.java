package common.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private  List<Event> eventsList;

    public Calendar(){
        eventsList=new ArrayList<>();
    }
    public void addEvent (Event e){
        eventsList.add(e);

    }

    public List<Event>getEventsList(){
        return eventsList;
    }
    public List<String >getNestedEvents(){
        List<String> nestedEvents=new ArrayList<>();
        for (int i = 0; i < eventsList.size(); i++) {
            LocalDateTime current =eventsList.get(i).getToTime();
            for (int j = i+1; j < eventsList.size(); j++) {
                LocalDateTime newEvent =eventsList.get(j).getToTime();
                if(current.isBefore( newEvent) ||newEvent.isBefore( current)  )
                    nestedEvents.add("event " +current+"is nested with "+newEvent+"\n" );
            }
        }
        return nestedEvents;
    }

    public List<String >getNestedEventsSorted(){
        List<String> nestedEvents=new ArrayList<>();
//
        return nestedEvents;
    }



    public static  void main(String[] args){
        Calendar c=new Calendar();
        LocalDateTime d1=LocalDateTime.now().minusMinutes(10);
        LocalDateTime d2=LocalDateTime.now().minusMinutes(1);
        LocalDateTime d3=LocalDateTime.now().minusMinutes(13);
        LocalDateTime d4=LocalDateTime.now().plusHours(1).plusMinutes(10);
        //Collections.sort(eventsList);
//        for (int i = 0; i < eventsList.size(); i++) {
//            LocalDateTime current =eventsList.get(i).getToTime();
//            for (int j = i+1; j < eventsList.size(); j++) {
//                LocalDateTime newEvent =eventsList.get(j).getToTime();
//                if(current.isBefore( newEvent) ||newEvent.isBefore( current)  )
//                    nestedEvents.add("event " +current+"is nested with "+newEvent+"\n" );
//            }
//        }
        LocalDateTime d5=LocalDateTime.now().plusHours(1).plusMinutes(15);
        LocalDateTime d6=LocalDateTime.now().plusHours(1).plusMinutes(17);
        LocalDateTime d7=LocalDateTime.now().plusDays(1).plusMinutes(17);
        LocalDateTime d8=LocalDateTime.now().plusDays(1).plusMinutes(50);
        LocalDateTime d9=LocalDateTime.now().plusDays(5).plusMinutes(17);
        LocalDateTime d10=LocalDateTime.now().plusDays(5).plusMinutes(50);
        c.addEvent(new Event("Event 1", d1,d4));
        c.addEvent(new Event("Event 2", d3,d5));
        c.addEvent(new Event("Event3", d2,d6));
        c.addEvent(new Event("Event 4", d4,d7));
        c.addEvent(new Event("Event 5", d7,d8));
        c.addEvent(new Event("Event 6", d9,d10));
        c.getNestedEvents().stream().forEach(System.out::println);
    }
}
