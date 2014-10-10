import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/*Lista de usuarios a los que sigue*/
public class FollowList extends AbstractList<Usuario>{

	List<Usuario> lista;
	public FollowList()
	{
		lista = new ArrayList<Usuario>();
	}

	@Override
	public Usuario get(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return lista.size();
	}
	
	public boolean add(Usuario user)
	{
		boolean added = false;
		lista.add(user);
		added = true;
		return added;
	}
	

}
