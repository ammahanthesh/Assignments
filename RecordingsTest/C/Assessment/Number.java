package R.C.Assessment;

public class Number {
	private int value;

	public Number(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}

	public int calculateFactors() {
		int count=0;
		for(int i=1;i<=value;i++) {
			if(value%i==0)
			{
				count++;
			}
		}
		return count;		
	}
}
