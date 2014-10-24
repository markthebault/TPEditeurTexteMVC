package Editeur;

public class CommandeSupprimer extends CommandeLigne
{

	public CommandeSupprimer(Ligne l)
	{
		super(l);
	}

	@Override
	public void executer()
	{
		ligne.supprimer();

	}

	@Override
	public boolean estExecutable()
	{
		// TODO Auto-generated method stub
		return ligne.getLongueur() >=1;
	}

}
