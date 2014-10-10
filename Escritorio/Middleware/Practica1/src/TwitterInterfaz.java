import java.rmi.Remote;
import java.rmi.RemoteException;


public interface TwitterInterfaz extends Remote{

	/*Definicion de los metodos a utilizar*/
	
	/*
	 * Metodo que crear un nuevo usuario tomando su nombre, correo electronico, nombre de usuario y contrasena
	 */
	public Usuario crearUsuario(String nombre, String correoElectronico, String nombreUsuario, String password) throws RemoteException;
	
	/*Pregunta: Crear una clase usuario y que se reciba como parametro?  */
	/*
	 * Metodo registro el cual registra al usuario (en una base de datos) tomando datos como su nombre
	 * correo electronico, nombre de usuario y contrasena.
	 * Habra que ver en el metodo que no exista el nombre de usuario y que el correo electronico no haya sido registrado
	 * (Contrasena debe cumplir unos parametros para ser segura, letras y numeros combinados, al menos una letra mayuscula)
	 */
	/*public void registro(Usuario usarioNuevo) throws RemoteException;*/
	public void registro(Usuario nuevoUsuario) throws RemoteException;
	
	/*
	 * Metodo que conecta a la aplicacion recibiendo como parametros el nombre de usuario y contrasena
	 * buscara en (base de datos) si existe el usuario y si la contrasena es correcta
	 * retornara true si ha habido algun error(no existe usuario, contrasena incorrecta) y false si todo ha sido correcto.
	 */
	public boolean conectar(String nombreUsuario, String password) throws RemoteException;
	
	/*
	 * Metodo que desconecta a usuario si hay algun problema retorna true, si todo ha ido correcto retorna false
	 */
	public boolean desconectar(Usuario usuario) throws RemoteException;
	
	/* Metodo que escribe un tweet en el timeline del usuario*/
	public boolean twitear(String tweet) throws RemoteException;
	
	/*Metodo que sigue a un usuario*/
	public void follow(Usuario user) throws RemoteException;
	
	/*Metodo que deja de seguir a un usuario*/
	public void unfollow(Usuario user) throws RemoteException;
	
	/*Comprueba si el usuario sigue a otro usuario*/
	
	public boolean isFollow(Usuario user) throws RemoteException;
	
	
	
	
	
	
	
}
