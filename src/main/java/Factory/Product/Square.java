package Factory.Product;

import Factory.Product.interfaces.Shape;

/**
 * 具体产品-具体图形类-正方形
 */
public class Square implements Shape {
    public void draw() {
        System.out.print("Draw Square! ");
    }
}
