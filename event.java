public class event {
    private String eventName;
    private String location;
    private int capacity;
    private boolean isActive;

    public event(){
    }
    public event(String eventName, String location, int capacity,boolean isActive){
        this.eventName=eventName;
        this.location=location;
        this.capacity=capacity;
        this.isActive=isActive;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public boolean isActive(){
        return isActive;
    }
    public void setActive(boolean active){
        this.isActive=active;
    }
    public void activateEvent(){
        this.isActive=true;
    }
    public void cancelEvent(){
        this.isActive=false;
    }
    public void printInfo(){
        System.out.println("Event Name: "+eventName+","+"Location: "+location+","+"Capacity: "+capacity+","+"Active: "+isActive);
    }
    public int compareCapacity(event other){
        return Integer.compare(this.capacity,other.capacity);
    }
}

