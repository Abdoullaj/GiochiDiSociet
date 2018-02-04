package matrici;

public class NonTiArrabbiare {
	
	public static int [][] creazioneTabella ( int [][] matr) {
		
		int [][] tabella = new int [3][(matr.length)*(matr[0].length)]; 
		int cont = 0;
		for (int j = 0 ; j < matr[0].length; j++) {
			
			for (int i = matr.length-1;i >= 0;i--) {
				
				tabella = riempiMatrice(tabella,cont,i,j);
				cont++;
			}
			
			j++;
			
			for (int i = 0 ;i < matr.length;i++) {
				tabella = riempiMatrice(tabella,cont,i,j);
				cont++;
			}
		}
		
		return tabella;
	}
	
	public static int [][] riempiMatrice (int [][]tabella,int cont, int i, int j) {
		
		tabella[0][cont] = cont;
		tabella[1][cont] = i;
		tabella[2][cont] = j;
		return tabella;
		
	}
	
	
	
	public static int lancioDelDado () {
		int numero = 0;
		numero =(int)(Math.random()*100)%7;
		if (numero == 0) numero = 1;
		System.out.println("Il dato e' stato lanciato ed e' uscito: "+numero);
		return numero;
	}
	
	
	
	
	public static boolean posizioni (int [][] tabella,String player1,String player2,int pos1,int pos2,boolean esito) {
		
		
		
		if (pos1 >= tabella[0].length) {
			System.out.println(player1+" ha raggiunto il traguardo, ha vinto la partita per primo");
			esito = true;
		}
		else if (pos2 >= tabella[0].length) {
			System.out.println(player2+" ha raggiunto il traguardo, ha vinto la partita per primo");
			esito = true;
		} else {
		System.out.println(player1+" si trova nella posizione x: "+tabella[1][pos1]+"\ty:"+tabella[2][pos1]);
		System.out.println(player2+" si trova nella posizione x: "+tabella[1][pos2]+"\ty:"+tabella[2][pos2]);}
		return esito;
	}
	
	
	public static void stampaTabella(int[][] matr,int [][] tabella,int pos1, int pos2) {
			System.out.println("Stampo la matrice:");
			for (int i = 0; i < matr.length; i++) {
				for (int j = 0; j < matr[0].length; j++) {
				
					
					
					if(i == tabella[1][pos1] && j == tabella[2][pos1]) {
						System.out.print(" A ");
					}
					 if (i == tabella[1][pos2] && j == tabella[2][pos2]) {
						System.out.print(" B ");
					} 
					 if(!(i == tabella[1][pos1] && j == tabella[2][pos1]) && !(i == tabella[1][pos2] && j == tabella[2][pos2])) {
						
						 System.out.print(" * ");
					 }
					
				}
				System.out.println("");
			}
		
	}
	
	
	public static boolean stessaPosizione (int pos1, int pos2) {
		return (pos1 == pos2) ;
		
	}
	public static int azzeraPosizione (int lanciatore,int avversario) {
		if (lanciatore == avversario) {
			System.out.println("Sei arrivato nella stessa posizione dell'avversario.\nPosizione avversario azzerata.");
			avversario = 0;
		}
		return avversario;
	}

	
	public static boolean condizioniDiUscita (int numerouscito,boolean condizioneGiocatore) {
		if (!condizioneGiocatore) {
		 if (numerouscito == 6) {
			 System.out.println("Hai fatto 6, sei uscito.");
			 condizioneGiocatore = true;
		 }else
			 {
			 System.out.println("Non hai fatto 6, rimani bloccato.");
			 }
		}
		 return condizioneGiocatore;
		
	}
}	
	
	
	

	/*
	 * public static void positionElement (int riga,int colonna) {
	 * 
	 * System.out.println("Elemento trovato nella posizione ["+riga+"]["+colonna+"]"
	 * ); }
	 */




