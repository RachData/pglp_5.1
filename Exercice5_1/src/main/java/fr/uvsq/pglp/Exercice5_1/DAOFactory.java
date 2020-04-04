package fr.uvsq.pglp.Exercice5_1;

public class DAOFactory {
	
	public static DAO<Personnels> getPersonneDAO(){
		return new PersonnelsDAO();
	}

}
