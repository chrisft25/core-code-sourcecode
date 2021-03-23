package solidExamples.openClosed;

public class Rectangle implements IShape{
    private double width;
    private double height;

    public double area(){
        return this.width * this.height;
    }
}
