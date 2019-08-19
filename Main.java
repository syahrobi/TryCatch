package Sekolah;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String []args){
		Activity s = new ScientificStudent("");
	    Kelas k = new Kelas();
	    Teacher t = new Teacher();
	    Echonomic e = new Echonomic("");
	    Mathematic m = new Mathematic("");
	    
	String jawab;
	Scanner sc = new Scanner(System.in);
	
	
		String username="";
		String password ="";
	System.out.print("Username = ");
	username = sc.next();
	System.out.print("Password = ");
	password = sc.next();
	
    if(username.equals("robi") && password.equals("123masuk")){
    	
    	try{
    		System.out.print("Input Name \t: ");
    		jawab = sc.next();
    		
	if(jawab.equals("ahmad")){
		s.ahmad();
		k.setKelas("5");
		t.setTeacher("Ibu Rina");
		e.setEchonomi("90");
		m.setMathematic("70");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
	else if(jawab.equals("cinta")){
		s.cinta();
		k.setKelas("6");
		t.setTeacher("BPK AHMAD");
		e.setEchonomi("9");
		m.setMathematic("73");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
	else if(jawab.equals("sinta")){
		s.sinta();
		k.setKelas("6");
		t.setTeacher("BPK AHMAD");
		e.setEchonomi("80");
		m.setMathematic("50");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
	else if(jawab.equals("rifki")){
		s.rifki();
		k.setKelas("4");
		t.setTeacher("BPK ARIF");
		e.setEchonomi("98");
		m.setMathematic("77");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
	else if(jawab.equals("janita")){
		s.janita();
		k.setKelas("4");
		t.setTeacher("BPK ARIF");
		e.setEchonomi("99");
		m.setMathematic("79");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
	else if(jawab.equals("kasih")){
		s.kasih();
		k.setKelas("4");
		t.setTeacher("BPK ARIF");
		e.setEchonomi("96");
		m.setMathematic("45");
		System.out.println("KELAS \t: "+k.getKelas());
		System.out.println("TEACHER \t: "+t.getTeacher());
		System.out.println("NILAI EKONOMI \t: "+e.getEchonomi());
		System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
	}
    	}
    	catch(Exception ee){System.out.print("username atau password tidak diketahui");
    	}
    }System.out.print("username atau password tidak diketahui");
}
}
