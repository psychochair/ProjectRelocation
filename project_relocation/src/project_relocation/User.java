package project_relocation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 *
 * @author chasa
 */

//YOOOO FAUT TROUVER COMMENT EXTEND ROCKET
public class User {
    
    private String username;
    private String filePath; 
    private int levelsCompleted;
    private int stars;
    private int fuelCapacity;
    private int protection;
    private int engineType;
    
    private File userFile=new File("resources/usernames/"+username+".txt");    
    
    public User(){
        username="default";
        filePath="";
        levelsCompleted=0;
        stars=0;
        fuelCapacity=0;
        protection=0;
        engineType=0;
    }
    
    public void actualizeFile() throws FileNotFoundException, IOException{
        
        filePath="resources/usernames/"+username+".txt";
        File userFile=new File(filePath);
        Scanner reader = new Scanner(userFile);
        int levelsCompleted = reader.nextInt();
        int stars = reader.nextInt();
        int fuelCapacity = reader.nextInt();
        int protection = reader.nextInt();
        int engineType = reader.nextInt();
        
        System.out.println(levelsCompleted+"\n"+stars+"\n"+fuelCapacity+"\n"+protection+"\n"+engineType);        
    }
    
    public void writeFile() throws FileNotFoundException, IOException{
        
        FileOutputStream deleter = new FileOutputStream(filePath);
        deleter.write(("").getBytes());
        deleter.close();
        
        PrintWriter writer = new PrintWriter(filePath);
        writer.println(levelsCompleted+"\n"+stars+"\n"+fuelCapacity+"\n"+protection+"\n"+engineType);
        writer.close();
        
    }
    
    
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username=username;
    }
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public int getLevelsCompleted() throws IOException {
        return levelsCompleted;
    }

    public void setLevelsCompleted(int levelsCompleted) throws FileNotFoundException, IOException {
        this.levelsCompleted=levelsCompleted;   
        writeFile();
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) throws FileNotFoundException, IOException {
        this.stars = stars;
        writeFile();
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) throws FileNotFoundException, IOException {
        this.fuelCapacity = fuelCapacity;
        writeFile();
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) throws FileNotFoundException, IOException {
        this.protection = protection;
        writeFile();
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) throws FileNotFoundException, IOException {
        this.engineType = engineType;
        writeFile();
    }
    

}
