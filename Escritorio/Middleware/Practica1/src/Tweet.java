import java.io.Serializable;
/*PRUEBA DE QUE VA EL GITHUB sld;kadlsakd*/
public class Tweet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tweet;
	private Usuario usuario;
	
	public Tweet(String tweet, Usuario usuario)
	{
		if(tweet.length() < 140)
		{
			this.tweet = tweet;
		}
		else
		{
			/* TRUNCAR*/
		}
		this.usuario = usuario;
	}
	
	public String getTweet()
	{
		return this.tweet;
	}
	public Usuario getUsuario()
	{
		return this.usuario;
	}
}
