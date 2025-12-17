package system;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * @author emsi
 * @version 1.0
 * @created 02-janvier 2023
 */



public class Client {
	private static final Logger logger = Logger.getLogger(Client.class.getName());
	private int numClient;
	private String nomClient;
	private String prenomClient;
	protected static final List<Compte> mCompte =new ArrayList<Compte>();
	
	
	public Client(String nomClient, int numClient, String prenomClient) {
		this.nomClient = nomClient;
		this.numClient = numClient;
		this.prenomClient = prenomClient;
	}
	public Client(){

	}


	public void afficherClient() {

		if (logger.isLoggable(Level.INFO)) {

			logger.info("nom du client: " + nomClient);
			logger.info("prenom du client: " + prenomClient);
			logger.info("------- Les comptes bancaires associés : --------");

			for (int i = 0; i < mCompte.size(); i++) {
				Compte compte = mCompte.get(i);
				if (compte != null) {
					// invoke toString() only if logging enabled
					logger.info(compte.toString());
				}
			}
		}
	}


	public String getNomClient(){
		return nomClient;
	}

	public int getNumClient(){
		return numClient;
	}

	public String getPrenomClient(){
		return prenomClient;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNomClient(String newVal){
		nomClient = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumClient(int newVal){
		numClient = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrenomClient(String newVal){
		prenomClient = newVal;
	}

}