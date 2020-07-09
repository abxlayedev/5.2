
public class EnseignantVacataire extends Enseignant {
	

	String nomOrganismeExterieur;
	
	public EnseignantVacataire (String nom, String prenom, int nbHeureCoursAnnee, String nomOrganismeExterieur) {
		super(nom, prenom, nbHeureCoursAnnee);
		this.nomOrganismeExterieur = nomOrganismeExterieur;
	}

	
public double getSalaireAnnuel() {
		
	int prixParHeure = 40;
	
	double salaireAnnuel = super.nbHeureCoursAnnee * prixParHeure;
	return salaireAnnuel;
		
	}

public double getSalaireWithCostsAnnuel() {
	
	int prixParHeure = 40;
	
	double salaireAnnuel = super.nbHeureCoursAnnee * prixParHeure;
	
	double costs = salaireAnnuel * Enseignant.POURCENTAGECHARGE;
	
	salaireAnnuel += costs;
	
	
	return salaireAnnuel;
		
	}
	
	
}
