package HW_3;

public class GITARA implements INSTRUMENT{
	private int KOLI4ESTVO_STRUN;

	public GITARA(int KOLI4ESTVO_STRUN){
		this.KOLI4ESTVO_STRUN = KOLI4ESTVO_STRUN;
	}


	@Override
	public void PLAY() {
		System.out.printf("INSTRUMENT: GITARA, KOLI4ESTVO_STRUN: %d\n", this.KOLI4ESTVO_STRUN);
	}
}
