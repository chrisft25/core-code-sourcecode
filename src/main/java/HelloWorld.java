public class HelloWorld {
    public static void main(String[]args){
//        System.out.println("hello");
//        System.out.println("world");
//
//        Perro perro = new Perro(4,"javadog");
//        perro.setNombre("dogJava");
//        System.out.println(perro.getNombre());
//
//
//
//        Animal animal1 = new Gato("nombre2");
//        Gato gato = new Gato("misifus");
//        String gatoName = gato.getGatoName("misifas","prueba");
//        System.out.println(gatoName);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicacion: " + (a*b));
        System.out.println("Division: " + (a/b));
    }
}