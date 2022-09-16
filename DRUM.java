package HW_3;

public class DRUM implements INSTRUMENT{
	private int RAZMER;

	public DRUM(int RAZMER){
		this.RAZMER = RAZMER;
	}

	@Override
	public void PLAY() {
		System.out.printf("INSTRUMENT: DRUM, RAZMER: %d\n", this.RAZMER);
	}
}
