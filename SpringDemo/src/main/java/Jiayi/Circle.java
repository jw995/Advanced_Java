package Jiayi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Circle{

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle drawn with center (" + center.getX() + ", " + center.getY() + ")");
    }

}
