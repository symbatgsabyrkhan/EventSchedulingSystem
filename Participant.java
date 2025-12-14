public class Participant {
    private String name;
    private String email;
    private boolean hasRegistered;

    public Participant(){
    }
    public Participant(String name, String email, boolean hasRegistered){
        this.name=name;
        this.email=email;
        this.hasRegistered=hasRegistered;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public boolean isHasRegistered(){
        return hasRegistered;
    }
    public void setHasRegistered(boolean hasRegistered){
        this.hasRegistered=hasRegistered;
    }
    public void register(){
        this.hasRegistered=true;
    }
    public void unregister(){
        this.hasRegistered=false;
    }
    public void printInfo(){
        System.out.println("Participant Name: "+name+","+"Email: "+email+","+"Registered: "+hasRegistered);
    }
}


