package solidExamples.openClosed;

public interface IShape {
    public default double area(){
        return 0;
    }
}
