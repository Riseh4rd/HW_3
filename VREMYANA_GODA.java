package HW_3;

public enum Seasons {
	ZIMA(-25), VESNA(16), LETO(25), OSEN(15);

	VREMYANA_GODA(int TEMPERATURA) {
		this.TEMPERATURA = TEMPERATURA;
	}

	public int getTEMPERATURA() {
		return TEMPERATURA;
	}

	public void getOPISANIE(VREMYANA_GODA VREMYA_GODA) {
		if (VREMYA_GODA.getTEMPERATURA() < 16){
			System.out.println("Холодно");
		}
		else{
			System.out.println("Тепло");
		}
	}

	private int TEMPERATURA;
}
