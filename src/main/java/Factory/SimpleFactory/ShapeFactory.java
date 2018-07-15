package Factory.SimpleFactory;

import Factory.Product.Circle;
import Factory.Product.Rectangle;
import Factory.Product.Square;
import Factory.Product.Shape;
import org.apache.commons.lang3.StringUtils;

/**
 * 工厂类-图形工厂
 */
public class ShapeFactory {
    public static Shape getShape(String name){
        if(StringUtils.isBlank(name)){
            return  null;
        }
        if (name.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (name.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
