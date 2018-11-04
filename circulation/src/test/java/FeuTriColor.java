import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FeuTriColor {
	Vitessevoiture vvoiture = new Vitessevoiture("traverse","vert");
	

	@Test
	void statutvoiture() {
	assertEquals("arret", vvoiture.vitesse);
	System.out.println("La voiture roule avec une vitesse:\n --> "+vvoiture.vitesse);
	}

}
