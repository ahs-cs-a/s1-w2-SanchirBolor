
public class BodyOfWater{
    private String name;
    private int avgDepth;
    private int largestDiameter;
    private boolean isSaltWater;
    
    public BodyOfWater(){
        avgDepth = 20;
    }

    public BodyOfWater(String n, int Depth){
        name = n;
        avgDepth = Depth;
    }

    public BodyOfWater(String n, int Depth, int Diameter, boolean SaltWater){
        name = n;
        avgDepth = Depth;
        largestDiameter = Diameter;
        isSaltWater = SaltWater;
    }

    public String name(){
        return name;
    }

    public int avgDepth(){
        return avgDepth;
    }

    public int largestDiameter(){
        return largestDiameter;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }

    public void setName(String n){
        name = n;
    }
}

