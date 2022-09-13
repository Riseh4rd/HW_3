

public class Main {
	public static void main(String[] args) {
		// Задание 2
		INSTRUMENT[] INSTRUMENTY = new INSTRUMENT[3];

		INSTRUMENTY[0] = new Guitar(9);
		INSTRUMENTY[1] = new Drum(9);
		INSTRUMENTY[2] = new Truba(9);

		for (int i = 0; i < INSTRUMENTY.length; i++) {
			INSTRUMENTY[i].play();
		}

		// Задание 3

			for (Seasons season : Seasons.values()) {
				System.out.printf("Name: %s, avg_temperature: %s, ", season.name(), season.getAverageTemperature());
				season.getDescription(season);
			}
			System.out.printf("Favorite season: %s",Seasons.WINTER);
	}
}
