public class Organizer {
    private String organizersName;
    private int eventsManaged;
    private double budget;

    public Organizer(){
    }
    public Organizer(String organizersName, int eventsManaged, double budget){
        this.organizersName=organizersName;
        this.eventsManaged=eventsManaged;
        this.budget=budget;
    }
    public String getOrganizersName(){
        return organizersName;
    }
    public void setOrganizersName(String name){
        this.organizersName=organizersName;
    }
    public int getEventsManaged(){
        return eventsManaged;
    }
    public void setEventsManaged(int eventsManaged){
        this.eventsManaged=eventsManaged;
    }
    public double getBudget(){
        return budget;
    }
    public void setBudget(double budget){
        this.budget=budget;
    }
    public void addEvent(){
        this.eventsManaged++;
    }
    public void increaseBudget(double amount){
        this.budget+=amount;
    }
    public void printInfo(){
        System.out.println("Organizer's Name: "+organizersName+","+"Events Managed: "+eventsManaged+","+"Budget: $"+budget);
    }
}
