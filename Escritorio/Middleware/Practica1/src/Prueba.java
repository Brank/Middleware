
public class Prueba {

	public static void main(String args[])
	{
		Usuario user1 = new Usuario("Brandon", "Brank", "123456", "brank.vh@gmail.com");
		Usuario user2 = new Usuario("Angel", "ACDC", "Clapton", "angel@gmail.com");
		user1.follow(user2);
		
		user1.twitear("lsfkjsdksmdlkfmdlskfjldkmvlkamflkdmfjlasdkfmjalkfjmlakfmvklmfjlakfjk" +
				"alskmflkadmflkdsmflksmfjlkfmjlkfmjlsdkfmjsaldkfmjslakfmjslkfmalksfmskdlfjslkfmjslkdfmslkadfmlksfsa" +
				"mslkfjmalksfmklsdfmjslkdmfjlksdfmjlksmdfjlksdmfslkmfjslamfldskmfdlksmfjlksdmjfkdsmfjldsak");
		user2.twitear("Hola !");
		
		System.out.println("El usuario sigue a: " + user1.getListaDeSeguidores().get(0).getUsuario());
		System.out.println("El tamaño del tweet es: "+ user1.getTimeLine().get(0).getTweet().length());
		System.out.println("El usuario es: " + user1.getUsuario());
		System.out.println("Primer tweet en el timeline de Brank: " + user1.getTimeLine().get(0).getTweet());
		System.out.println("El primer tweet en timeline de Angel:" + user2.getTimeLine().get(0).getTweet());
		System.out.println("El segundo tweet en el timeline de Angel: " + user2.getTimeLine().get(1).getTweet());
		//System.out.println("El segundo tweet en el timeline de Brank: " + user1.getTimeLine().get(1).getTweet());
		
		/*Lista de seguidores de Brank*/
		System.out.println("Brank sigue a: " + user1.getListaDeSeguidores().get(0).getNombre());
	}
}
