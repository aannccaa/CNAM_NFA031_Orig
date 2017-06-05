package Basic;

public class Fundamental {

	public static void main(String[] args) {
		int nrBirouri = 3;
		int nrCandidati = 2;
		int[][] voturi = new int[nrBirouri][nrCandidati];

		voturi[0][0] = 10;
		voturi[0][1] = 15;
		voturi[1][0] = 20;
		voturi[1][1] = 25;
		voturi[2][0] = 30;
		voturi[2][1] = 35;

		int candidat = 1;
		int birou = 0;
		System.out.println(voturi[birou][candidat]);
		int totalVoturi = 0 + voturi[0][0] + voturi[0][1] + voturi[1][0] + voturi[1][1] + voturi[2][0] + voturi[2][1];
		System.out.println(totalVoturi);

		int voturiC0 = 0 + voturi[0][0] + voturi[1][0] + voturi[2][0];
		System.out.println(voturiC0);
		double procC0 = voturiC0 * 100.0 / totalVoturi;
		System.out.println(procC0);

		int voturiC1 = 0 + voturi[0][1] + voturi[1][1] + voturi[2][1];
		System.out.println(voturiC1);
		double procC1 = voturiC1 * 100.0 / totalVoturi;
		System.out.println(procC1);

		int totalVoturiB2 = voturi[2][0] + voturi[2][1];
		double procB2C0 = voturi[2][0] * 100.0 / (totalVoturiB2);
		System.out.println(procB2C0);

		double procB2C1 = voturi[2][1] * 100.0 / (totalVoturiB2);
		System.out.println(procB2C1);
	}

	public static int somme(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		return somme;
	}

	public static void cumuleazaVoturiPeCandidatFaraBucla(int[][] voturi) {
		int nbCandidats = 2;
		int nbBirouri = 3;
		// cumul voturi pe candidat
		int voturiC0 = voturi[0][0] + voturi[1][0] + voturi[2][0];
		int voturiC1 = voturi[0][1] + voturi[1][1] + voturi[2][1];
		
	}

	// suma voturilor pe candidat si pe birou de vot
	public static int[] cumuleazaVoturiPeCandidat(int[][] tab) {
		int nbCandidats = tab[0].length;
		int nbBirouri = tab.length;
		int[] cumulCandidat = new int[nbCandidats];
		for (int nrCandidat = 0; nrCandidat < nbCandidats; nrCandidat++) {
			int somme = 0;
			for (int nrBirou = 0; nrBirou < nbBirouri; nrBirou++) {
				somme = somme + tab[nrBirou][nrCandidat];
			}
			cumulCandidat[nrCandidat] = somme;

		}
		return cumulCandidat;
	}

	public static double[] calculeazaProcente(int[] voturiCandidat) {
		int totalVoturi = somme(voturiCandidat);
		double[] resultats = new double[voturiCandidat.length];
		for (int i = 0; i < voturiCandidat.length; i++) {
			resultats[i] = voturiCandidat[i] * 100.0 / totalVoturi;
		}
		return resultats;

	}

}
