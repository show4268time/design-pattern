package Factory.Product;

import Factory.Product.interfaces.Shape;

/**
 * 具体产品-具体图形类-长方形
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.print("Draw Rectangle! ");
    }
}
