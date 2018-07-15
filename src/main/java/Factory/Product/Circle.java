package Factory.Product;

/***
 * 具体产品-具体图形类-圆形
 */
public class Circle implements Shape {
    public void draw() {
        System.out.print("Draw Circle! ");
    }
}
