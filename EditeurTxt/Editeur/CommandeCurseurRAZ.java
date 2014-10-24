package Editeur;


public class CommandeCurseurRAZ extends CommandeLigne
{

	public CommandeCurseurRAZ(Ligne l)
	{
		super(l);
	}

	
    public void executer() {
	ligne.raz();
    }

    public boolean estExecutable() {
	return ligne.getLongueur() >= 1;
    }

}
