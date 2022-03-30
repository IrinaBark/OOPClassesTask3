package by.epam.oop.main;

import java.util.Scanner;

import by.epam.oop.agregate.Agregate;
import by.epam.oop.entity.Customer;

public class Main {

	public static void main(String[] args) {

		int count = getSize();

		Customer[] ar = new Customer[count];
		init (ar, count);
		
		Agregate base = new Agregate(ar);

		base.sortBySurname();
		base.printArray();

		System.out.println();

		Customer[] arrayCard = base.returnListOfCard(500_000_000_000L, 700_000_000_000L);

		Agregate arrayC = new Agregate(arrayCard);
		arrayC.printArray();

	}
	public static int getSize () {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество клиентов >");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Неверный ввод! Введите количество клиентов >");
		}
		int count = sc.nextInt();
		
		return count;
	}
	public static void init (Customer[] ar, int count) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < count; i++) {
			ar[i] = new Customer();

			System.out.println("Введите идентификационный номер клиента " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите идентификационный номер клиента >");
			}
			ar[i].setId(sc.nextInt());
			sc.nextLine();

			System.out.println("Введите имя клиента " + (i + 1) + " >");
			ar[i].setName(sc.nextLine());

			System.out.println("Введите фамилию клиента " + (i + 1) + " >");
			ar[i].setSurname(sc.nextLine());

			System.out.println("Введите отчество клиента " + (i + 1) + " >");
			ar[i].setPatronymic(sc.nextLine());

			System.out.println("Введите адрес клиента " + (i + 1) + " >");
			ar[i].setAdress(sc.nextLine());

			System.out.println("Введите номер карточки клиента " + (i + 1) + " >");
			while (!sc.hasNextLong()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите номер карточки клиента >");
			}
			ar[i].setCardNumber(sc.nextLong());

			System.out.println("Введите номер аккаунта клиента " + (i + 1) + " >");
			while (!sc.hasNextLong()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите номер аккаунта клиента >");
			}
			ar[i].setAccountNumber(sc.nextLong());
		}
	}
}









