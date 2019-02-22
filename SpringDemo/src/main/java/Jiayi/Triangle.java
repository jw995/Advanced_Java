package Jiayi;

public class Triangle {

    private String type;
    private int height;

    // dependency injection using setters
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }



    public void draw() {
        System.out.println(getType() + " triangle drawn of height " + getHeight());
    }
}
