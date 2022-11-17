public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
