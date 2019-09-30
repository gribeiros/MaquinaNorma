package application;

import java.util.Scanner;

import entities.Registrador;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Registrador rg1 = null;
			Registrador rg2 = null;
			Registrador rg3 = null;
			Registrador rg4 = null;

			System.out.println("Quantos registradores vai utilizar (Min:2 Max:4) ?");
			int a, b, c, d, n = sc.nextInt();
			String op;
			System.out.println();

			if (n == 4) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();

				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					rg1 = new Registrador("Registrador 1", 0, i);
					System.out.println(rg1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					rg2 = new Registrador("Registrador 2", 0, i);
					System.out.println(rg2);
				}
				System.out.println("\nRegistrador 3:\n");
				for (int i = 0; i <= c; i++) {
					rg3 = new Registrador("Registrador 3", 0, i);
					System.out.println(rg3);
				}
				System.out.println("\nRegistrador 4:\n");
				for (int i = 0; i <= d; i++) {
					rg4 = new Registrador("Registrador 4", 0, i);
					System.out.println(rg4);
				}

				System.out.println("\nEntre com a operação do rg1,rg2,rg3 e rg4:");
				op = sc.next();
				if (op.equals("rg1+rg2+rg3+rg4")) {
					rg1.increment(rg1, rg4);
					rg1.increment(rg1, rg3);
					rg1.increment(rg1, rg2);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2-rg3-rg4")) {
					rg1.decrement(rg1, rg4);
					rg1.decrement(rg1, rg3);
					rg1.decrement(rg1, rg2);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2+rg3+rg4")) {

					rg1.decrement(rg1, rg2);
					rg1.increment(rg1, rg3);
					rg1.increment(rg1, rg4);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1+rg2-rg3+rg4")) {

					rg1.increment(rg1, rg2);
					rg1.decrement(rg1, rg3);
					rg1.increment(rg1, rg4);

					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1+rg2+rg3-rg4")) {

					rg1.increment(rg1, rg2);
					rg1.increment(rg1, rg3);
					rg1.decrement(rg1, rg4);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2-rg3+rg4")) {
					rg1.decrement(rg1, rg2);
					rg1.decrement(rg1, rg3);
					rg1.increment(rg1, rg4);

					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1+rg2-rg3-rg4")) {
					rg1.increment(rg1, rg2);
					rg1.decrement(rg1, rg3);
					rg1.decrement(rg1, rg4);

					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2+rg3-rg4")) {
					rg1.decrement(rg1, rg2);
					rg1.increment(rg1, rg3);
					rg1.decrement(rg1, rg4);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1*rg2*rg3*rg4")) {
					rg1.multi(rg1, rg2);
					rg1.multi(rg1, rg3);
					rg1.multi(rg1, rg4);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				}

			} else if (n == 3) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					rg1 = new Registrador("Registrador 1", 0, i);
					System.out.println(rg1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					rg2 = new Registrador("Registrador 2", 0, i);
					System.out.println(rg2);
				}
				System.out.println("\nRegistrador 3:\n");
				for (int i = 0; i <= c; i++) {
					rg3 = new Registrador("Registrador 3", 0, i);
					System.out.println(rg3);
				}

				System.out.println("\nEntre com a operação do rg1,rg2 e rg3:");
				op = sc.next();

				if (op.equals("rg1+rg2+rg3")) {
					rg1.increment(rg1, rg2);
					rg1.increment(rg1, rg3);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2-rg3")) {
					rg1.decrement(rg1, rg2);
					rg1.decrement(rg1, rg3);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2+rg3")) {
					rg1.decrement(rg1, rg2);
					rg1.increment(rg1, rg3);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1+rg2-rg3")) {
					rg1.increment(rg1, rg2);
					rg1.decrement(rg1, rg3);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1*rg2*rg3")) {
					rg1.multi(rg1, rg2);
					rg1.multi(rg1, rg3);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				}

			} else if (n == 2) {
				a = sc.nextInt();
				b = sc.nextInt();

				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					rg1 = new Registrador("Registrador 1", 0, i);
					System.out.println(rg1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					rg2 = new Registrador("Registrador 2", 0, i);
					System.out.println(rg2);
				}

				System.out.println("\nEntre com a operação do rg1,rg2 e rg3:");
				op = sc.next();

				if (op.equals("rg1+rg2")) {
					rg1.increment(rg1, rg2);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1-rg2")) {
					rg1.decrement(rg1, rg2);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				} else if (op.equals("rg1*rg2")) {
					rg1.multi(rg1, rg2);
					System.out.println("\n\nResultado:");
					System.out.println(rg1);
				}

			} else {
				System.out.println("Numero de registradores deve ser maior do que 2 e menor que 4.");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());

		}

	}

}
