package lv19007fase2grupo5;
import java.io.*;
import java.util.Random;
/**
 *
 * @author RONALDMO
 */
public class BD {
    private static File archivo = new File("src/bd/bd.txt");
    public BD(){}
    public void crearArchivo(){
        //File fichero = new File("bd/bd.txt");
    }
    public static void guardarEnBD(String cadena){
        EcribirFichero(archivo,cadena);
    }
    public static void eliminarEnBD(String cadena){
        EliminarRegistro(archivo,cadena);
    }
    public ListaJugadores listaJugadores(){
        ListaJugadores listaBD = new ListaJugadores();
        
        return listaBD;
    }
    public static void EcribirFichero(File fichero,String cadena){
        try {
                //Si no Existe el fichero lo crea
                 if(!fichero.exists()){
                     fichero.createNewFile();
                 }                
                BufferedWriter escribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero,true), "utf-8"));                
                escribe.write(cadena + "\r\n");                
                escribe.close();
             } catch (Exception ex) {                
                System.out.println(ex.getMessage());
             } 
      }
    public static  void leerDesdeFichero(ListaJugadores listaActualizar){
        try {            
            if(archivo.exists()){                
                BufferedReader flee= new BufferedReader(new FileReader(archivo));
                String slinea;                
                while((slinea=flee.readLine())!=null) {                
                    //Creamos el jugador 
                    Jugador jugador = new Jugador();
                    //splitiamos la linea de la BD
                    String[] arrLinea = slinea.split("-");                    
                    jugador.numero=Integer.parseInt(arrLinea[0]);
                    jugador.nombre=arrLinea[1];                    
                    jugador.posicion=arrLinea[2];
                    listaActualizar.insertar(1, jugador);
                }                
                flee.close();
              }else{
                System.out.println("Fichero No Existe");
              }
        } catch (Exception ex) {            
             System.out.println(ex.getMessage());
        }
      }
    public static  void EliminarRegistro(File ficheroAntiguo,String atigualinea){        
        /*Obtengo un numero aleatorio*/
        Random numaleatorio= new Random(3816L);         
        String nombFichNuev=ficheroAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
        /*Crea un objeto File para el fichero nuevo*/
        File ficheroNuevo=new File(nombFichNuev);
        if(ficheroNuevo.exists()){ //Si existe lo eliminamos y volvemos a crear
            BorrarFichero(ficheroNuevo);
            ficheroNuevo=new File(nombFichNuev);
        }
        try {
            /*Si existe el fichero inical*/
            if(ficheroAntiguo.exists()){
                /*Abro un flujo de lectura*/
                BufferedReader Flee= new BufferedReader(new FileReader(ficheroAntiguo));
                String slinea;
                /*Recorro el fichero de texto linea a linea*/
                while((slinea=Flee.readLine())!=null) { 
                     /*Si la linea obtenida es distinta al la buscada
                     *para eliminar*/
                    if (!slinea.toUpperCase().trim().equals(atigualinea.toUpperCase().trim())) {
                       /*la escribo en el fichero nuevo*/ 
                       EcribirFichero(ficheroNuevo,slinea);
                    }else{
                        /*Si es igual simple mete no hago nada*/
                    }             
                }
                /*Obtengo el nombre del fichero inicial*/
                String nomAntiguo=ficheroAntiguo.getName();
                /*Borro el fichero inicial*/
                BorrarFichero(ficheroAntiguo);
                /*renombro el nuevo fichero con el nombre del fichero inicial*/
                ficheroNuevo.renameTo(ficheroAntiguo);
                /*Cierro el flujo de lectura*/
                Flee.close();
            }else{
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
    }
    public static  void BorrarFichero(File Ffichero){
     try {         
         if(Ffichero.exists()){          
           Ffichero.delete(); 
           System.out.println("Fichero Borrado con Exito");
         }
     } catch (Exception ex) {         
          System.out.println(ex.getMessage());
     }
} 

}
