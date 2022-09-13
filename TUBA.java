package HW_3;

public class TUBA INSTRUMENTY INSTRUMENT{
	private int RADIUS;

	public TUBA(int RADIUS){
		this.RADIUS = RADIUS;
	}

	@Override
	public void MUZIKA() {
		System.out.printf("INSTRUMENT: TUBA, RADIUS: %d\n", this.RADIUS);
	}
}
