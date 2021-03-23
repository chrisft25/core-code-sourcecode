package solidExamples.openClosed;

public class Triangle implements IShape{

    private double width;
    private double height;

    public double area(){
        return (this.width * this.height)/2;
    }
}
