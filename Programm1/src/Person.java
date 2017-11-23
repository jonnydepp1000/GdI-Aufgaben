public class Person {

	static int altersgrenze;
	String name;
	int alter;

	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	public void sagHallo() {
		System.out.println("Hallo! Ich bin " + this.name + ".");
	}

	public void sagAlter() {
		if (this.alter < Person.altersgrenze) {
			System.out.println("Ich bin jünger als " + Person.altersgrenze);
		} else if (this.alter == Person.altersgrenze) 
			System.out.println("Ich bin genau " + Person.altersgrenze);
		else
			System.out.println("Ich bin älter als " + Person.altersgrenze);

	}

	public static void main(String[] args) {

		Person.altersgrenze = 18;
		Person hans = new Person("Hans", 0);
		Person klara = new Person("Klara", 0);
		Person ajani = new Person("Ajani", 45);
		Person aiana = new Person("Aiana", 18);
		klara.sagHallo();
		klara.sagAlter();
		hans.sagHallo();
		hans.sagAlter();
		ajani.sagHallo();
		ajani.sagAlter();
		aiana.sagHallo();
		aiana.sagAlter();

	}
}