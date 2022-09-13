package HW_3;

public class PIANINO implements INSTRUMENT{
	private int RAZMER;

	public PIANINO(int RAZMER){
		this.RAZMER = RAZMER;
	}

	@Override
	public void MUZIKA() {
		System.out.printf("INSTRUMENT: PIANINO, RAZMER: %d\n", this.RAZMER);
	}
}
