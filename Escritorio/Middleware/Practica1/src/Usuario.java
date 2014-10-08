import java.io.Serializable;


public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String usuario;
	private String password;
	private String correoElectronico;
	
	public Usuario(String nombre,String usuario,String password, String correoElectronico)
	{
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		this.correoElectronico = correoElectronico;
	}
	
	public String getCorreoElectronico()
	{
		return this.correoElectronico;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public String getUsuario()
	{
		return this.usuario;
	}
	public String getPass()
	{
		return this.password;
	}
	public Tweet twitear(Tweet tweet)
	{
		return tweet;
	}
}
