package Sekolah;

public class Mathematic extends Course{
	String mathematic;
	Mathematic(String Nilai) {
		super(Nilai);
	
	}
	
	    
		public void setMathematic(String M){
			this.mathematic = M;
		}
		public String getMathematic(){
			return mathematic;
		}
}
