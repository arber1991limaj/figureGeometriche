import java.util.Scanner;


// ho aggiunto un commento per vederlo in github
public class Calcolatore {
	static FiguraGeometrica[] figura;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		figura = new FiguraGeometrica[10];
		chiediFigura(0);
		for (int i = 0; i < figura.length; i++) {
			if(figura[i] ==null) break;
			System.out.println("Area figura ("+figura[i].getClass().getName()+")" + figura[i].getArea());
		}
	}

	private static void chiediFigura(int i) {
		stampaMenu();
		int scelta = scanner.nextInt();
		if(scelta!=0 && i< figura.length){
			FiguraGeometrica nuovaFigura = null;
			switch (scelta) {
			case 1:
				System.out.println("Inserisci il lato:");
				int lato = scanner.nextInt();
				nuovaFigura= new Quadrato(lato);
				break;
			case 2:
				System.out.println("Inserisci la base:");
				int base= scanner.nextInt();
				System.out.println("Inserisci l'altezza:");
				int altezza= scanner.nextInt();
				nuovaFigura= new Rettangolo(base, altezza);
				break;
			case 3:
				System.out.println("Inserisci il raggio:");
				int raggio= scanner.nextInt();
				nuovaFigura= new Cerchio(raggio);
				break;
			case 4:
				System.out.println("Inserisci la base:");
				int baseTriangolo= scanner.nextInt();
				System.out.println("Inserisci la base:");
				int altezzaTriangolo= scanner.nextInt();
				nuovaFigura= new Triangolo(baseTriangolo,altezzaTriangolo);
				break;
			default:
				System.out.println("Attenzione scelta non prevista.");
				break;
			}
			
			figura[i]=nuovaFigura;
			i++;
			chiediFigura(i);
		}
	}

	private static void stampaMenu() {
		System.out.println("INSERISCI UNA NUOVA FIGURA: ");
		System.out.println("1 - Quadrato ");
		System.out.println("2 - Rettangolo ");
		System.out.println("3 - Cerchio ");
		System.out.println("4 - Triangolo ");
		System.out.println("0 - Calcola Area delle figure ");
		System.out.println("");
	}
}
