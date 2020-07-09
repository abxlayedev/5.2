
public class EnseignantChercheur extends Enseignant {



	
	
	public EnseignantChercheur(String nom, String prenom, int nbHeureCoursAnnee) {
		super(nom, prenom, nbHeureCoursAnnee);
	}
	
	
	
	public double getSalaireAnnuel() {
		
		double nbMoisAnnée = 12;
		double salaire = 2000;
		
		if ( super.nbHeureCoursAnnee <= 192 ) {
			
			double salaireAnnuel = salaire * nbMoisAnnée;
			
			return salaireAnnuel;
			
		} else {
			
			double salaireAnnuel = salaire * nbMoisAnnée;
			
			double prixParHeureSupp = 40;
			
			double nbHeureSupp = super.nbHeureCoursAnnee - 192;
			
			double salaireAnnuelHeureSupp = nbHeureSupp * prixParHeureSupp;
	
			double salaireAnnuelTotal = salaireAnnuel + salaireAnnuelHeureSupp;
			
			return salaireAnnuelTotal;
		}	
	}
	
	
public double getSalaireWithCostsAnnuel() {
		
		int nbMoisAnnée = 12;
		double salaire = 2000;
		
		if ( super.nbHeureCoursAnnee <= 192 ) {
			
			double salaireAnnuel = salaire * nbMoisAnnée;
			
			double costs = salaireAnnuel * Enseignant.POURCENTAGECHARGE;
			
			salaireAnnuel += costs;
			
			return salaireAnnuel;
			
		} else {
			
			double prixParHeureSupp = 40;
			
			int nbHeureSuppParHeure = super.nbHeureCoursAnnee - 192;
			double salaireSupp = nbHeureSuppParHeure * prixParHeureSupp;
			
			double salaireAnnuel = salaire + salaireSupp;
			
			double costs = salaireAnnuel * Enseignant.POURCENTAGECHARGE;
			
			salaireAnnuel += costs;
			
			return salaireAnnuel;
		}	
	}
	
	
	
}
