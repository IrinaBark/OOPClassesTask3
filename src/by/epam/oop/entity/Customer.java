package by.epam.oop.entity;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long cardNumber;
	private long accountNumber;
	
	private static final int DEFAULT_ID = 0;
	private static final String DEFAULT_NAME = "";
	private static final String DEFAULT_SURNAME = "";
	private static final String DEFAULT_PATRONYMIC = "";
	
	private static final long DEFAULT_CARD_NUMBER_MIN = 100_000_000_000L;
	private static final long DEFAULT_CARD_NUMBER_MAX = 999_999_999_999L;
	
	private static final long DEFAULT_ACCOUNT_NUMBER_MAX = 100_000_000L;
	
	public Customer(int id, String name, String surname, String patronymic) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public Customer() {
		this(DEFAULT_ID, DEFAULT_NAME, DEFAULT_SURNAME, DEFAULT_PATRONYMIC);
	}

	public Customer(int id, String name, String surname, String patronymic, String adress, long cardNumber,
			long accountNumber) {
		this(id, name, surname, patronymic);
		this.adress = adress;
		this.setCardNumber(cardNumber);
		this.setAccountNumber(accountNumber);
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new RuntimeException("Id is incorrect!");
		}
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		if (cardNumber < DEFAULT_CARD_NUMBER_MIN || cardNumber > DEFAULT_CARD_NUMBER_MAX) {
			throw new RuntimeException("Invalid card number!");
		}
		this.cardNumber = cardNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		if (accountNumber < 0 || accountNumber > DEFAULT_ACCOUNT_NUMBER_MAX) {
			throw new RuntimeException("Invalid account number!");
		}
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", cardNumber=" + cardNumber + ", accountNumber=" + accountNumber + "]";
	}
}
