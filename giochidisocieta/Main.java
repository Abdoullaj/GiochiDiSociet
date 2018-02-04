package matrici;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println((int)(Math.random()*100)%7);

		// Methods.research(matrice, 5);
		/*
		 * Methods.research(matrice, 8); matrice[3][2]= 8;
		 * Methods.stampaMatrice(matrice); Methods.research(matrice, 8);
		 */

		/*
		 * System.out.println("La somma della diagonale da dx: " +
		 * Methods.sommaDiagonaleDaSinistra(matrice) + "  da sx: " +
		 * Methods.sommaDiagonaleDaDestra(matrice));
		 */
		// Methods.stampaMatrice(matrice);
		// Methods.confrontoSomme(matrice);
		int[][] matrice = new int[13][16];
		Methods.riempiMatrice(matrice, 5);
		Methods.stampaMatrice(matrice);

		int[][] tabella = Methods.creazioneTabella(matrice);

		// Methods.stampaMatrice(tabella);

		/*
		 * int cont1 = 0; int cont2 = 0; boolean flag = false; String player1 = "Pinco";
		 * String player2 = "Pallino"; flag=Methods.posizioni(tabella, player1, player2,
		 * cont1, cont2,flag); Methods.stampaTabella(matrice, tabella, cont1, cont2);
		 * for (int i = 0;flag == false;) { cont1 = cont1+(Methods.lancioDelDado());
		 * cont2 = NonTiArrabbiare.azzeraPosizione(cont1, cont2); cont2 =
		 * cont2+(Methods.lancioDelDado()); cont1 =
		 * NonTiArrabbiare.azzeraPosizione(cont1, cont2);
		 * flag=Methods.posizioni(tabella, player1, player2, cont1, cont2,flag); if
		 * (!flag)Methods.stampaTabella(matrice, tabella, cont1, cont2);
		 * 
		 * System.out.println("\n\n");
		 */

		int cont1 = 0;
		int cont2 = 0;
		boolean flag = false;
		boolean inizio1 = false;
		boolean inizio2 = false;
		int avanzamentoPlayer1 = 0;
		int avanzamentoPlayer2 = 0;
		String player1 = "Pinco";
		String player2 = "Pallino";
		flag = NonTiArrabbiare.posizioni(tabella, player1, player2, cont1, cont2, flag);
		NonTiArrabbiare.stampaTabella(matrice, tabella, cont1, cont2);
		for (int i = 0; flag == false;) {

			avanzamentoPlayer1 = NonTiArrabbiare.lancioDelDado();
			inizio1 = NonTiArrabbiare.condizioniDiUscita(avanzamentoPlayer1, inizio1);
			if (inizio1) {
				cont1 = cont1 + avanzamentoPlayer1;
				cont2 = NonTiArrabbiare.azzeraPosizione(cont1, cont2);
			}
			avanzamentoPlayer2 = NonTiArrabbiare.lancioDelDado();
			inizio2 = NonTiArrabbiare.condizioniDiUscita(avanzamentoPlayer2, inizio2);
			if (inizio2) {
				cont2 = cont2 + (NonTiArrabbiare.lancioDelDado());
				cont1 = NonTiArrabbiare.azzeraPosizione(cont2, cont1);
				flag = NonTiArrabbiare.posizioni(tabella, player1, player2, cont1, cont2, flag);
			}
			if (!flag)
				NonTiArrabbiare.stampaTabella(matrice, tabella, cont1, cont2);
			System.out.println("\n\n");

		}

	}

}