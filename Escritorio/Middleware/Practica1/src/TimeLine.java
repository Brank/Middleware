import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class TimeLine extends AbstractList<Tweet>{

	List<Tweet> timeLine;
	int modCount;
	Usuario owner;
	
	public TimeLine(Usuario owner)
	{
		timeLine = new ArrayList<Tweet>();
		this.owner = owner;
	}
	@Override
	public Tweet get(int index) {
		// TODO Auto-generated method stub
		return timeLine.get(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return timeLine.size();
	}
	
	public boolean add(Tweet tweet)
	{
		boolean added = false;
		Usuario usuarioTemporal;
		for(int i = 0; i<owner.getListaDeSeguidores().size() ;i++)
		{
			usuarioTemporal = owner.getListaDeSeguidores().get(i); 
			usuarioTemporal.getTimeLine().add(tweet);/*Esto esta mal, deberia anadir al timeline sin consultar los de sus seguidores*/
		}
		timeLine.add(tweet);
		added = true;
		
		return added;
	}

}
