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
	private FollowList listaDeSeguidores;
	private TimeLine timeline;
	
	public Usuario(String nombre,String usuario,String password, String correoElectronico)
	{
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		this.correoElectronico = correoElectronico;
		this.listaDeSeguidores = new FollowList();
		this.timeline = new TimeLine(this);
	}
	
	/*Metodos get*/
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
	public FollowList getListaDeSeguidores()
	{
		return this.listaDeSeguidores;
	}
	public TimeLine getTimeLine()
	{
		return this.timeline;
	}
	/*Implementacion de los metodos de la interfaz remota*/
	public boolean twitear(String tweet)
	{
		boolean added = false;
		Tweet tweetNuevo = new Tweet(tweet,this);
		timeline.add(tweetNuevo);
		added = true;
		return added;
	}
	public boolean follow(Usuario user)
	{
		boolean added = false;
		listaDeSeguidores.add(user);
		added = true;
		return added;
	}
}
