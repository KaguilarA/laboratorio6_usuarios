package laboratorio6;

/**
 *
 * @author kevin
 */

import java.io.*;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Manager manager = new Manager();
    
    /**
     * 
     * @param args
     * @throws java.io.IOException 
     */
    public static void main(String[] args)throws java.io.IOException{      
        int option;
        boolean finish;
        
        do {
            out.println("<--- Seleccione la accion que desea ejecutar --->");
            out.println("1. Agregar Usuario");
            out.println("2. Listar Usuarios");
            out.println("3. Salir");
            option = readOption();
            finish = ejectOption(option);
        } while (finish != true);
    }
    
    /**
     * 
     * @return Selected option
     * @throws IOException 
     */
    static int readOption() throws IOException{
        int option = 0;
        out.println("Ingrese una opción");
        option = Integer.parseInt(in.readLine());
        return option;
    }
    
    static boolean ejectOption(int pOption) throws IOException{
        boolean finish = false;
        
        switch(pOption){
            case 1:
               menuRegisterUser();
             break;
            case 2:
               listUser();
            break;
            case 3:
               out.println("Gracias por usar el sistema de registro de usuarios");
               finish = true;
            break;
            default:
                out.println("Opción Inválida");
            break;           
        }
        return finish;
    }
    
    public static void menuRegisterUser () throws IOException {
        int option;
        
        do {
            out.println("<--- Seleccione el tipo de usuario que desea crear --->");
            out.println("1. Agregar Cliente");
            out.println("2. Agregar Usuario");
            out.println("3. Volver");
            option = readOption();
            switch(option){
                case 1:
                   registerClient();
                 break;
                case 2:
                   registerUser();
                break;
                default:
                    out.println("Opción Inválida");
                break;           
            }
        } while (option !=4);
    }
    
    public static void registerClient() throws IOException
    {
        String identification, name, surname, secondSurname, password, email, address;
        int phone1, phone2;
        boolean validation;
        
        out.println("Digite la identidicaci\u00f3n del nuevo cliente");
        identification = in.readLine();
        
        out.println("Digite el nombre del nuevo cliente");
        name = in.readLine();
        
        out.println("Digite el primer apellido del nuevo cliente");
        surname = in.readLine();
        
        out.println("Digite el segundo apellido del nuevo cliente");
        secondSurname = in.readLine();
        
        out.println("Digite la contraseña del nuevo cliente");
        password = in.readLine();
        
        out.println("Digite el correo electr\u00f3nico del nuevo cliente");
        email = in.readLine();
        
        out.println("Digite la direcci\u00f3n del nuevo cliente");
        address = in.readLine();
        
        out.println("Digite el telef\u00f3no 1 del nuevo cliente");
        phone1 = Integer.parseInt(in.readLine());
        
        out.println("Digite el telef\u00f3no 2 del nuevo cliente");
        phone2 = Integer.parseInt(in.readLine());
        
        validation = Manager.addCliente(address, email, phone1, phone2, identification, name, surname, secondSurname, password);
        
        if(validation == true){
            out.println("¡Registro del cliente fue exitoso!");
        }else{
            out.println("Ha ocurrido un  error, int\u00e9ntelo desp\u00faes");
        }
    }
    
        public static void registerUser() throws IOException
    {
        String identification, name, surname, secondSurname, password, profile;
        boolean validation;
        
        out.println("Digite la identidicaci\u00f3n del nuevo usuario");
        identification = in.readLine();
        
        out.println("Digite el nombre del nuevo usuario");
        name = in.readLine();
        
        out.println("Digite el primer apellido del nuevo usuario");
        surname = in.readLine();
        
        out.println("Digite el segundo apellido del nuevo usuario");
        secondSurname = in.readLine();
        
        out.println("Digite la contraseña del nuevo usuario");
        password = in.readLine();
        
        out.println("Digite informaci\u00f3n para el perf\u00edl del nuevo usuario");
        profile = in.readLine();
        
        validation = Manager.addUser(profile, identification, name, surname, secondSurname, password);
        
        if(validation == true){
            out.println("¡Registro del usuario fue exitoso!");
        }else{
            out.println("Ha ocurrido un  error, int\u00e9ntelo desp\u00faes");
        }
    }
        
    public static void listUser(){
        String [] allUsers;
        allUsers = Manager.getListPerson();
        int catSize = allUsers.length;
        
        if(catSize != 0){
            for(int i=0; i < catSize; i++){
                out.println(allUsers[i] + "\n");
            }
        }else{
            out.println("Aún no hay tiendas registradas.");
            
        }
    }
        
}
