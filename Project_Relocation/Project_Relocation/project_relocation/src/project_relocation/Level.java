package project_relocation;

/**
 *
 * @author sandr
 */
public class Level {
    private final double stageWidth=Project_Relocation.sceneWidth;
    private final double stageHeight=Project_Relocation.sceneHeight;
    
    
    private String backgroundImgLink= ""; 
    private String floorImgLink= "";
    private Platform[] platforms;
    private int stageNum;
    private String gravity;
    private DynamicObject[] dynamicObjs;
    private Obstacle[] obstacles;
    
    public Level(int sN){        
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImgLink = backgroundImgLink;
    }

    public void setFloorImg(String floorImg) {
        this.floorImgLink = floorImg;
    }

    public Platform[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platform[] platforms) {
        this.platforms = platforms;
    }

    public int getStageNum() {
        return stageNum;
    }
    
    public String getGravity() {
        return gravity;
    }

    public void setGravity(String game) {
        this.gravity = game;
    }

    public void setDynamicObjs(DynamicObject[] dynamicObjs) {
        this.dynamicObjs = dynamicObjs;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }
    
    
}

