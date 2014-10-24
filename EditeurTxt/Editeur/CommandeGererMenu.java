package Editeur;

public class CommandeGererMenu implements Commande
{
	private Menu menu;
	
	public CommandeGererMenu(Menu m)
	{
		this.menu = m;
	}

	@Override
	public void executer()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estExecutable()
	{
		// TODO Auto-generated method stub
		return false;
	}

}
