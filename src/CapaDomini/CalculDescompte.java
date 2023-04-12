package CapaDomini;

public class CalculDescompte {

	// la matriu productes té dos columnes: TIPUS i PREU
	// cada fila representa un producte
	// Si el tipus és 1 i el preu és superior a 20,00 euros aplicarem un 5% de descompte
	// si el tipus és 2 i el preu és superior a 50,00 euros aplicarem un 10% de descompte
	public static double getDescompte(double[][] productes)
	{
		double preu, percentatge, descompte = 0;
		int tipus;
		for( int index = 1; index <= productes.length; index++)
		{
			tipus = (int) productes[index][0];
			preu = productes[index][1];
			percentatge = 0;
			if(tipus == 1 && preu > 20)
				percentatge = 0.05;
			if(tipus == 2 && preu > 50)
				percentatge = 0.10;
			descompte =+ preu * percentatge;
		}
		return descompte;
	}
}
