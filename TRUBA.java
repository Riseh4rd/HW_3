package HW_3;

public class TRUBA INSTRUMENTY INSTRUMENT{
	private int RADIUS;

	public TRUBA(int RADIUS){
		this.RADIUS = RADIUS;
	}

	@Override
	public void PLAY() {
		System.out.printf("INSTRUMENT: TRUBA, RADIUS: %d\n", this.RADIUS);
	}
}
