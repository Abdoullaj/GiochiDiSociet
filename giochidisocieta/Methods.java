package matrici;

public class Methods {

	public static void riempiMatrice(int[][] matr, int num) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				matr[i][j] = num;
			}
		}
		// stampaMatrice(matr);
	}

	public static void stampaMatrice(int[][] matr) {
		System.out.println("Stampo la matrice:");
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				System.out.print(matr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static boolean research(int[][] matr, int num) {
		boolean flag = false;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				if (num == matr[i][j]) {
					if (!flag)
						System.out.println("Elemento trovato nella posizione: ");
					flag = true;
					System.out.println("[" + i + "][" + j + "]");
					arrayPosizione(i, j);
				}
			}
		}
		if (!flag) {
			System.out.println("Il numero " + num + " non e' stato trovato");
		}
		return flag;

	}

	public static int[] arrayPosizione(int riga, int colonna) {
		int[] arr = new int[2];
		arr[0] = riga;
		arr[1] = colonna;
		return arr;
	}

	public static int sommaDiagonaleDaSinistra(int[][] matr) {
		int somma = 0;
		for (int i = 0; i < matr.length; i++) {
			somma = somma + matr[i][i];
		}
		return somma;
	}

	public static int sommaDiagonaleDaDestra(int[][] matr) {
		int somma = 0;
		for (int i = 0, j = matr.length - 1; i < matr.length; i++, j--) {
			somma = somma + matr[i][j];
		}
		return somma;
	}

	public static int sommaDiNumeriNonInDiagonali(int[][] matr) {
		int somma = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				if ((i + j) != matr.length - 1) {
					if (i != j) {
						somma = somma + matr[i][j];
						System.out.println("Sommati nelle pos: " + i + " e " + j);
					}
				}
			}
		}
		return somma;
	}

	public static void confrontoSomme(int[][] matr) {
		int diagonali = sommaDiagonaleDaDestra(matr) + sommaDiagonaleDaSinistra(matr);
		int nondiagonali = sommaDiNumeriNonInDiagonali(matr);
		System.out.println("Somma delle diagonali " + diagonali);
		System.out.println("Somma delle non diagonali " + nondiagonali);
		if (diagonali > nondiagonali)
			System.out.println("Il maggiore risulta la somma delle diagonali ");
		if (nondiagonali > diagonali)
			System.out.println("Il maggiore risulta la somma delle non diagonali ");
		if (diagonali == nondiagonali)
			System.out.println("Sono uguali");
	}
	
	
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
					if(i == tabella[1][pos1] && j == +tabella[2][pos1]) {
						System.out.print("A");
					}
					if(i == tabella[1][pos2] && j == +tabella[2][pos2]) {
						System.out.print("B");
					} else {
						System.out.print(" * ");
					}
				}
				System.out.println("");
			}
		
	}
	
	
	public static boolean stessaPosizione (int pos1, int pos2) {
		return (pos1 == pos2) ;
		
	}

		
		
		
		
}

	/*
	 * public static void positionElement (int riga,int colonna) {
	 * 
	 * System.out.println("Elemento trovato nella posizione ["+riga+"]["+colonna+"]"
	 * ); }
	 */

