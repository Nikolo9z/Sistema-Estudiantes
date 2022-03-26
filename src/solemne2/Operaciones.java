
package solemne2;
import java.util.Scanner;

public class Operaciones {
    Scanner r=new Scanner(System.in);
    Scanner o=new Scanner(System.in);
    Estudiante[] Estudiantes=new Estudiante[35];
    private int cantidad=0;
    private double prom=0;
    private final double promedio1[]=new double[35];
    private final double promedio2[]=new double [35];
    private final double promedio3[]=new double[35];
    public void agregar(){
        try{
        Estudiante e1=new Estudiante("Null",0,0,0,0);
        System.out.println("Ingrese su nombre");
        e1.setNombre(r.nextLine());
        System.out.println("Ingrese El RUT");
        e1.setRut(o.nextInt());
        System.out.println("Las notas deben ser entre 1 y 7");
        System.out.println("Ingrese la 1era solemne");
        e1.setSolemne1(o.nextFloat());
        while(e1.getSolemne1()<1||e1.getSolemne1()>=7){
            System.out.println("Numero no valido, ingreselo de nuevo");
            e1.setSolemne1(o.nextFloat());
        }
        promedio1[cantidad]=e1.getSolemne1();
        System.out.println("Ingrese la 2da solemne");
        e1.setSolemne2(o.nextFloat());
        while(e1.getSolemne2()<1|| e1.getSolemne2()>=7){
            System.out.println("Numero no valido, ingreselo de nuevo");
            e1.setSolemne2(o.nextFloat());
        }
        promedio2[cantidad]=e1.getSolemne2();
        System.out.println("Ingrese la 3ra solemne");
        e1.setSolemne3(o.nextFloat());
        while(e1.getSolemne3()<1||e1.getSolemne3()>=7){
            System.out.println("Numero no valido,ingreselo de nuevo");
            e1.setSolemne3(o.nextFloat());
        }
        promedio3[cantidad]=e1.getSolemne3();
        System.out.println("Ingrese el promedio de los Ejercicios");
        e1.setEjercicios(o.nextFloat());
        while(e1.getEjercicios()<1||e1.getEjercicios()>=7){
            System.out.println("Numero no valido, ingreselo de nuevo");
            e1.setEjercicios(o.nextFloat());
        }
        prom=((e1.getSolemne1()*0.3)+(e1.getSolemne2()*0.3)+(e1.getSolemne3()*0.3)+(e1.getEjercicios()*0.1));
        e1.setPromedio(prom);
        Estudiantes[cantidad]=e1;
        cantidad++;
    }catch(Exception e){
        o.nextLine();
            System.out.println("Valor no valido, debe inicializar la opcion de nuevo.");
    }
    }
    public void Mostrar(){
        for (int i = 0; i < cantidad; i++) {
            System.out.println(Estudiantes[i]);
        }
    }
    public void promedio(){
        double suma1=0;
        double suma2=0;
        double suma3=0;
        for (int i = 0; i < cantidad; i++) {
            suma1=suma1+promedio1[i];
        }
        for (int i = 0; i < cantidad; i++) {
            suma2=suma2+promedio2[i];    
        }
        for (int i = 0; i < cantidad; i++) {
            suma3=suma3+promedio3[i];
        }
           System.out.println("El promedio de la solemne 1 es: "+ suma1/cantidad);
           System.out.println("El promedio de la solemne 2 es: "+ suma2/cantidad);
           System.out.println("El promedio de la solemne 3 es: "+ suma3/cantidad);
        
    }
    public void Buscador(){
        System.out.println("Ingrese el rut del estudiante que desea buscar:");
        int rut=o.nextInt();
        int pos=-1;
        for (int i = 0; i <cantidad; i++) {
            if (Estudiantes[i].getRut()==rut) {
                pos=i;
            }
        }
        if (pos!=-1) {
            System.out.println("El estudiante es\n"+Estudiantes[pos]);  
        }else{
            System.out.println("Estudiante no encontrado");
        }
    }
    public void Validador(){
        
    }
    public void Menu(){
        Scanner a=new Scanner(System.in);
        int opcion=0;
        boolean b=false;
        do{
            do{
                b=false;
                try{
                      System.out.println("Bienvenido al menu de Estudiantes.");
            System.out.println("Presione:");
            System.out.println(" -1) Si desea Agregar Estudiantes\n"
                    + " -2) Si desea Mostrar todos los estudiantes\n "
                    + "-3) Para Mostrar los promedios de todas las solemnes\n "
                    + "-4) si desea buscar un alumno(debe ingresar su rut)\n "
                    + "-5) para salir\n");
            opcion=a.nextInt();
                }catch(Exception e){
                    System.out.println("no es un numero");
                    b=true;
                    a.nextLine();
                }
                }while(b==true);
            switch(opcion){
                case 1 -> {agregar();
                }
                case 2 -> {Mostrar();}
                case 3->{promedio();}
                case 4->{Buscador();}
            }     
        } while (opcion!=5);
    }
}
