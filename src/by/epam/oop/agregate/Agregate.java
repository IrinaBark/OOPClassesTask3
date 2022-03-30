package by.epam.oop.agregate;

import by.epam.oop.entity.Customer;

public class Agregate {

	private int count;
	private Customer[] clientBase;

	private static final int DEFAULT_ARRAY_LENGTH = 5;

	public Agregate(int count) {
		this.count = count;
		clientBase = new Customer[count];
	}

	public Agregate() {
		this(DEFAULT_ARRAY_LENGTH);
	}

	public Agregate(Customer[] array) {
		clientBase = array;
	}

	public void sortBySurname() {

		Customer temp;

		for (int j = clientBase.length - 1; j > 0; j--) {

			for (int i = 0; i < j; i++) {

				String surnameI = clientBase[i].getSurname();
				char[] charArrayI = surnameI.toCharArray();

				String surnameNext = clientBase[i + 1].getSurname();
				char[] charArrayNext = surnameNext.toCharArray();

				int size;

				if (charArrayI.length < charArrayNext.length) {
					size = charArrayI.length;
				} else {
					size = charArrayNext.length;
				}

				for (int k = 0; k < size; k++) {

					if (charArrayNext[k] < charArrayI[k]) {

						temp = clientBase[i];
						clientBase[i] = clientBase[i + 1];
						clientBase[i + 1] = temp;
						break;
					}
				}
			}
		}
	}

	public Customer[] returnListOfCard(long min, long max) {

		int counter = 0;

		if (min > max) {
			long temp = min;
			min = max;
			max = temp;
		}
		for (int i = 0; i < clientBase.length; i++) {
			long card = clientBase[i].getCardNumber();
			if (card >= min && card <= max) {
				counter++;
			}
		}
		Customer[] customerArray = new Customer[counter];

		int num = 0;

		for (int i = 0; i < clientBase.length; i++) {

			long card = clientBase[i].getCardNumber();

			if (card >= min && card <= max) {
				customerArray[num] = clientBase[i];
				num++;
			}
		}
		return customerArray;
	}

	public void printArray() {
		for (int i = 0; i < clientBase.length; i++) {
			System.out.println(clientBase[i]);
		}
	}
}
