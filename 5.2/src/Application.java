
public class Application {

	public static void main(String[] args) {
		
		EnseignantChercheur enseignantChercheurAbdou = new EnseignantChercheur("Fernandes","Abdoulaye",200);
		EnseignantVacataire enseignantVacataireAbdou = new EnseignantVacataire("Fernandes","Abdoulaye",200, "AFPA");
		EnseignantDoctorant enseignantDoctorantAbdou = new EnseignantDoctorant("Fernandes","Abdoulaye",200);
		
		
		
		System.out.println("Le salaire de l'enseignant chercheur : "+enseignantChercheurAbdou.getSalaireAnnuel());
		System.out.println("Le salaire de l'enseignant chercheur avec charges : "+enseignantChercheurAbdou.getSalaireWithCostsAnnuel());
		System.out.println("-----------------------------------------");
		
		System.out.println("Le salaire de l'enseignant vacateur : "+enseignantVacataireAbdou.getSalaireAnnuel());
		System.out.println("Le salaire de l'enseignant vacateur avec charges : "+enseignantVacataireAbdou.getSalaireWithCostsAnnuel());
		System.out.println("-----------------------------------------");
		
		System.out.println("Le salaire de l'enseignant doctorant : "+enseignantDoctorantAbdou.getSalaireAnnuel());
		System.out.println("Le salaire de l'enseignant doctorant avec charges : "+enseignantDoctorantAbdou.getSalaireWithCostsAnnuel());
		
		
	}

}
