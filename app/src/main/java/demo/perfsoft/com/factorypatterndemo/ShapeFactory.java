package demo.perfsoft.com.factorypatterndemo;

/**
 * Created by Tong Hung on 28-Mar-17.
 */

public class ShapeFactory {
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(type.equalsIgnoreCase("square")){
            return new Square();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
