

public class Main {
	public static void main(String[] args) {
		// Задание 2
		INSTRUMENT[] INSTRUMENTY = new INSTRUMENT[3];

		INSTRUMENTY[0] = new GITARA(9);
		INSTRUMENTY[1] = new DRUM(9);
		INSTRUMENTY[2] = new TRUBA(9);

		for (int i = 0; i < INSTRUMENTY.length; i++) {
			INSTRUMENTY[i].PLAY();
		}

		// Задание 3

			for (VREMYANA_GODA VREMYA_GODA :VREMYANA_GODA.values()) {
				System.out.printf("Название: %s, avg_TEMPERATURA: %s, ", VREMYA_GODA.name(), VREMYA_GODA.getTEMPERATURA());
				VREMYA_GODA.getOPISANIE(VREMYA_GODA);
			}
			System.out.printf("Любимое Время года: %s",VREMYA_GODA.ZIMA);
	}
}
