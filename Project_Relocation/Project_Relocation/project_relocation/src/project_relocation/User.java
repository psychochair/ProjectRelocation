package project_relocation;

/**
 *
 * @author chasa
 */
public class User {
    
    private String username;
    private String filePath; 
    private Rocket rocket; 
    
    
    
    public User(String u, String fP, Rocket r){
        username=u;
        filePath=fP;
        rocket=r;      
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }
    
    
}
