public class Animal {

    private String nombre;

    protected String getNombreApodo(String nombre, String apodo){
        return nombre + "-" + apodo;
    }

    public Animal(String nombre){
        this.nombre=nombre;
    }
}
