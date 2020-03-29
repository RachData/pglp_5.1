package fr.uvsq.pglp.Exercice5_1;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PersonnelsDAO extends DAO<Personnels>{

	@Override
	public Personnels create(Personnels obj) {
		try {
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO personnes (nom, prenom, Id, dateDeNaissance,numTel) VALUES (?,?,?,?,?) ");
			prepare.setString(1, obj.getNom());
			prepare.setString(2, obj.getPrenom());
			prepare.setInt(3, obj.getId());
			//prepare.setBlob(4, obj.getDateDeNaissance());
			prepare.setArray(5, (Array) obj.getNumTel());
			int resultat=prepare.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return obj;
	}

	@Override
	public Personnels find(String rechercher) {

		Personnels perso=null;
		try {
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM personnes WHERE nom = ?");
			prepare.setString(1, rechercher);
			ResultSet result= prepare.executeQuery();
			if(result.first()) {
				perso = new Personnels
						.Builder(result.getString("nom"), result.getString("prenom"), result.getInt("Id"))
						.build();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return perso;
	}

	@Override
	public Personnels update(Personnels obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Personnels obj) {
		// TODO Auto-generated method stub
		
	}

}
