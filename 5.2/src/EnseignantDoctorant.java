
public class EnseignantDoctorant extends Enseignant {


	
	public EnseignantDoctorant(String nom, String prenom, int nbHeureCoursAnnee) {
		super(nom, prenom, nbHeureCoursAnnee);
		this.nbHeureCoursAnnee = nbHeureCoursAnnee;
	}
	
	
	
	public double getSalaireAnnuel() {
		
		double prixParHeure = 30;
		
		if ( super.nbHeureCoursAnnee <= 96 ) {
			double salaireAnnuel = prixParHeure * super.nbHeureCoursAnnee;
			return salaireAnnuel;
		} else {
			
			double salaireAnnuel = prixParHeure * 96;
			return salaireAnnuel;
		}
	}
	
public double getSalaireWithCostsAnnuel() {
		
		double prixParHeure = 30;
		
		if ( super.nbHeureCoursAnnee <= 96 ) {
			double salaireAnnuel = prixParHeure * super.nbHeureCoursAnnee;
			
			double costs = salaireAnnuel * Enseignant.POURCENTAGECHARGE;
			
			salaireAnnuel += costs;
			
			return salaireAnnuel;
		} else {
			
			double salaireAnnuel = prixParHeure * 96;
			
			double costs = salaireAnnuel * Enseignant.POURCENTAGECHARGE;
			
			salaireAnnuel += costs;
			
			return salaireAnnuel;
		}
	}
	
}
