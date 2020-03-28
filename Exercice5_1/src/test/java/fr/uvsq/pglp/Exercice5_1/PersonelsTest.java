package fr.uvsq.pglp.Exercice5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonelsTest {
	
	Personnels perso1;
	Personnels perso2;
	Personnels perso3;
	Personnels perso4;
	
	CompositePerso grp1;
	CompositePerso grp2;
	CompositePerso grp3;
	
	@Before
	  public void setup() {
		
		perso1= new Personnels
				.Builder("Derra", "Abdoul", 2).build();
		
		perso3= new Personnels
				.Builder("Simpore", "Naimatou", 5).build();
		
		perso4= new Personnels
				.Builder("Traore", "Bene", 6).build();
		
		perso2= new Personnels
				.Builder("Maiga", "Abdallah", 7).build();
		
		
		
		grp1 = new CompositePerso(1);
		grp2 = new CompositePerso(3);
		grp3 = new CompositePerso(4);
		
		
	}

	@Test
	public void test() {
		
		grp1.add(perso1);
		grp1.add(grp2);
		
		grp2.add(grp3);
		grp2.add(perso3);
		
		grp3.add(perso4);
		grp3.add(perso2);
		
		grp1.print();
	}

}
