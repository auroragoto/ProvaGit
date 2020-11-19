/*ESERCIZIO 1 - Rendere interattivo il programma calcolatrice. Attenzione alle divisioni per zero.*/
package it.corso.git;

import java.util.Scanner;

public class Main1711es1 {
		public static void main (String[] args) {
			System.out.print("Ciaooooooooooooo");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Inserisci:\n'1' se vuoi inserire un numero\n'2' se vuoi terminare il programma\n ");
			int inizia = scanner.nextInt();
 			try {
				if (inizia == 1) {
					int continua = 1;
					while (continua != 2) {
						continua = 1;
						Scanner scanner1 = new Scanner(System.in);
						System.out.print("Inserisci un numero: ");
						int numA = scanner1.nextInt();
						Scanner scanner2 = new Scanner(System.in);
						System.out.print("Inserisci un numero: ");
						int numB = scanner2.nextInt();
						Scanner scanner3 = new Scanner(System.in);
						System.out.print("Inserisci i seguenti numeri per scegliere l'operazione da effettuare\n'1'per l'addizione\n'2' per la sottrazione\n'3' per la moltiplicazione\n'4' per la divisione\n");
						int segno = scanner3.nextInt();
						switch (segno) {
						  case 1:
						    System.out.println("Il risultato dell'addizione è "+(numA+numB));
						    break;
						  case 2:
						    System.out.println("Il risultato della sottrazione è "+(numA - numB));
						    break;
						  case 3:
						    System.out.println("Il risultato della moltiplicazione è "+(numA * numB));
						    break;
						  case 4:
						    System.out.println("Il risultato della divisione è "+(numA / numB));
						    break;
						}
					if (continua != 2) {
						Scanner scanner4 = new Scanner(System.in);
						System.out.print("Inserisci '1' se vuoi inserire un nuovo numero, '2' se vuoi terminare il programma: ");
						continua= scanner4.nextInt();
						}
					else {System.out.println("Programma finito! Ciao!");
					System.exit(0);
							}
						}
					}
				else {System.out.println("Programma finito! Ciao!");
					System.exit(0);
					}
 				}
			catch (ArithmeticException Ecc) {
				System.out.println("Non è possibile dividere un numero per 0");
				}
			}
		}
