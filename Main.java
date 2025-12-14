public class Main{
    public static void main(String[] args){
        event event1=new event("Kairat Nurtas's concert", "Astana Arena", 500, true);
        event event2 = new event("New Year Party", "Resataurant", 1000, true);
        event event3 = new event("Shop's open day", "Online", 50, false);
        Participant participant1 = new Participant("Sabyrkhan Symbat", "symbat0408@icloud.com", true);
        Participant participant2 = new Participant("Karakat Mambetiyar", "karakat@email.com", false);
        Participant participant3 = new Participant("Amina Meirambay", "amina@icloud.com", true);
        Organizer organizer1 = new Organizer("Amanat Company", 12, 50000.00);
        Organizer organizer2 = new Organizer("Grand Holiday", 8, 25000.00);

        System.out.println("EVENT INFORMATION");
        event1.printInfo();
        event2.printInfo();
        event3.printInfo();

        System.out.println("PARTICIPANT INFORMATION");
        participant1.printInfo();
        participant2.printInfo();
        participant3.printInfo();

        System.out.println("ORGANIZER INFORMATION");
        organizer1.printInfo();
        organizer2.printInfo();

        System.out.println("EVENT COMPARISON");
        int Comaprison= event1.compareCapacity(event2);
        if (Comaprison>1){
            System.out.println(event1.getEventName()+" has larger capacity then "+event2.getEventName());
        } else if (Comaprison<0) {
            System.out.println(event1.getEventName()+" has smaller capacity then "+event2.getEventName());
        }
        else {
            System.out.println("Both events have the same capacity");
        }

        System.out.println("COUNTING REGISTERED PARTICIPANTS");
        int registeredCount=0;
        if(participant1.isHasRegistered()){
            registeredCount++;
        }
        if(participant2.isHasRegistered()){
            registeredCount++;
        }
        if(participant3.isHasRegistered()){
            registeredCount++;
        }
        System.out.println("Number of registered participants: "+registeredCount);

        System.out.println("LOOP THROUGH EVENTS");
        event[] events={event1,event2,event3};
        int totalCapacity=0;
        int activeEvents=0;
        for(int i=0;i<events.length;i++) {
            String status = events[i].isActive() ? "Active" : "Inactive";
            System.out.println("Event" + (i + 1) + ":" + events[i].getEventName() + " Capacity: " + events[i].getCapacity() + " Status: " + status);
            totalCapacity += events[i].getCapacity();
            if (events[i].isActive()) {
                activeEvents++;
            }
        }
        System.out.println("Total capacity across all events: "+totalCapacity);
        System.out.println("Number of active events: "+ activeEvents);

        System.out.println("DEMONSTRATING BEHAVIOR METHODS");
        System.out.println("Before: ");
        event3.printInfo();
        event3.activateEvent();
        System.out.println("After activation: ");
        event3.printInfo();
        participant2.register();
        System.out.println("Karakat's status after registration: ");
        participant2.printInfo();
    }
}
