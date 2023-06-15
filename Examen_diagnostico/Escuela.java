package Examen_diagnostico;

import java.io.*;
import java.util.Scanner;
       
public class Escuela 
{
    
    //static Inscritos inscritos[] = new Inscritos[10];
    static Alumnos alumnos[]=new Alumnos[10];
    static Maestros maestros[]=new Maestros[10];
    static Materias materias[]=new Materias[10];
    static PrintStream s=System.out;
    static PrintStream er=System.err;
    static Scanner leer=new Scanner(System.in);
    static Scanner op=new Scanner(System.in);
    static Scanner leer2=new Scanner(System.in);
    static byte alumnosagregados=0;
    static byte maestrosagregados=0;
    static byte altaMateria=0;
    public static void main(String[] args)
    {
       /*Alumnos alumno1= new Alumnos("Pepe","Pecas","Perez","10/01/2002","Ing.Software");
        Maestros maestro1= new Maestros(1,"Edgar","Hernandez","Barajas","12/03/1988","Ing.Computacion");
        Materias materia1=new Materias(1,"Programacion visual","15dl93","401","Ing.Software");
        Alumnos alumno2= new Alumnos("luis","Bañales","Lopez","14/08/2002","Ing.Software");
        */
       int opc=0;
       //valor numerico pequeño 126
       byte contAlumnos=0,contMaestros=0, contMaterias=0;
       //regresa un valor falso o positivo
       boolean salir=false;
       do{
           switch(mainMenu()){
               case 1:
                   if(contAlumnos<=10){
                       menuAlumnos();
                   }
                   else{
                       er.println("No hay espacio para agregar alumnos");
                   }
               break;
               case 2:
                   if(contMaestros<10){
                       menuMaestros();
                   }
                   else{
                       er.println("No hay espacio para agregar maestros");
                   }
               break;
               case 3:
                   if(contMaterias<10){
                       menuMaterias();
                   }
               break;
               case 4:
                   System.exit(opc);
               break;
               default:
                   er.println("No Es una opción valisa");
               
           }
           
       }while(salir==false);
       

    }
    public static int mainMenu()
    {
        System.out.println("___Escuela__");
        System.out.println("1-Menu Alumno");
        System.out.println("2-Menu Maestros");
        System.out.println("3-Menu materias");
        System.out.println("4-Salida");
        return op.nextInt();
    }
    public static void menuAlumnos()
    {
        s.println("____MENU DE ALUMNOS____");
        s.println("1- Ingresar datos del alumno");
        s.println("2- Ver datos del los Alumnos");
        s.println("3- Baja Alumnos ");
        s.println("4- Regresar al menu Principal");
        s.println("");
        
                
        switch(op.nextByte()){
            case 1:
                s.println("Nombre Alumno nuevo");
                String nombre=leer.nextLine();
                s.println("Apellido Paterno Alumno nuevo");
                String apellidoP=leer.nextLine();
                s.println("Apellido Materno Alumno nuevo");
                String apellidoM=leer.nextLine();
                s.println("Licenciatura Alumno nuevo");
                String lic=leer.nextLine();
                s.println("DoB Alumno nuevo");
                String dob=leer.nextLine();
                Alumnos alumnonuevo = new Alumnos(nombre, apellidoP, apellidoM, dob, lic);   
                alumnos[alumnosagregados]= alumnonuevo;
                alumnosagregados++;
                
            break;
            case 2:
                for(int i=0;i<alumnosagregados;i++){
                    s.println("Alumno: "+(i+1)+" | "+"Nombre: "+alumnos[i].getNombre()+" | "+" Apellido Paterno:"+alumnos[i].getApellidoP()+" | "+"Apellido Materno:"+alumnos[i].getApellidoM()+" | "+"Licenciatura:"+alumnos[i].getLicenciatura()+" | "+"Fecaha de nacimiento:"+alumnos[i].getDob());
                }
                s.println("\n");  
            break;
            case 3:
                int pos=0;
                s.println("Ingresa el Numero de alumno a eliminar ");
                pos=leer.nextInt();
                for(int i=(pos-1);i<alumnosagregados;i++){
                    alumnos[i]=alumnos[i+1];
                }
                alumnosagregados--;
                
            break;    
        } 
    }
    public static void menuMaestros()
    {
        s.println("____MENU Maestros____");
        s.println("1- Ingresae datos del Maestro");
        s.println("2- Ver datos del los Maestros");
        s.println("3- Baja Maestros ");
        s.println("4- Regresar al menu Principal");
        s.println("");
        switch(op.nextByte()){
            case 1:
                s.println("Id Maestro nuevo");
                int Id=leer2.nextInt();
                s.println("Nombre Maestro nuevo");
                String nombre=leer.nextLine();
                s.println("Apellido Paterno Maestro nuevo");
                String apellidoP=leer.nextLine();
                s.println("Apellido Materno Maestro nuevo");
                String apellidoM=leer.nextLine();
                s.println("Licenciatura Maestro nuevo");
                String lic=leer.nextLine();
                s.println("DoB Maestro nuevo");
                String dob=leer.nextLine();
                Maestros maestronuevo=new Maestros(Id, nombre, apellidoP, apellidoM, dob, lic);
                maestros[maestrosagregados]=maestronuevo;
                maestrosagregados++;
            break;
            case 2:
                for(int i=0;i<maestrosagregados;i++){
                    s.println(i+1+" Maestro"+(i+1)+" :: "+" Nombre: "+maestros[i].getNombre()+" :: "+" Apellido Paterno: "+maestros[i].getApellidoP()+" :: "+" Licenciatura :"+" :: "+"Fecha de nacimiento");
                }
                s.println("\n");
            break;   
            case 3:
                int pos=0;
                s.println("Ingresa el Numero del maestro a eliminar ");
                pos=leer.nextInt();
                for(int i=(pos-1);i<maestrosagregados;i++){
                    maestros[i]=maestros[i+1];
                }
                maestrosagregados--;
                break;
        }
        
    }
    public static void menuMaterias()
    {
        s.println("____MENU Materias____");
        s.println("1- Ingresae datos de las materias");
        s.println("2- Ver datos del las Materias");
        s.println("3- Baja de Materias ");
        s.println("4- Regresar al menu Principal");
        s.println("");
        switch(op.nextByte()){
            case 1:
                s.println("Id Materia nueva");
                int IdMaterias=leer2.nextInt();
                s.println("Nombre Materia");
                String nombre=leer.nextLine();
                s.println("Clave Materia");
                String clave=leer.nextLine();
                s.println("Codigo Materia");
                String codigo=leer.nextLine();
                s.println("Licenciatura de Materia");
                String lic=leer.nextLine();
                Materias materianueva=new Materias(IdMaterias, nombre, clave, codigo, lic);
                materias[altaMateria]=materianueva;
                altaMateria++;
                                
            break;
            case 2:
                for(int i=0;i<altaMateria;i++){
                    s.println(i+1+" id: "+materias[i].getIdMaterias()+", Nombre de la Materia: "+materias[i].getNombre()+", Clave de la Materia: "+materias[i].getClave()+", Codigo de la Materia; "+materias[i].getCodigo()+", Licenciatura de la Materia"+materias[i].getLic());
                }
            break;   
            case 3:
                int pos=0;
                s.println("Ingresa el Numero dela materia a eliminar ");
                pos=leer.nextInt();
                for(int i=(pos-1);i<altaMateria;i++){
                    materias[i]=materias[i+1];
                }
                altaMateria--;
            break;
        }
        
    }
    
}