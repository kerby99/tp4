import java.util.List;

public class GestionnaireCommande implements Commande {

	private List<Commande> listeCommades;
	private GestionnaireCommande gestionnairesCommandes;

	public GestionnaireCommande(){
		
	}

	/**
	 * @return the gestionnairesCommandes
	 */
	public GestionnaireCommande getGestionnairesCommandes() {
		return gestionnairesCommandes;
	}
	
	public void ajouterCommande(Commande commande){
		
	}
		
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executer() {
		// TODO Auto-generated method stub
		
	}


	
}
