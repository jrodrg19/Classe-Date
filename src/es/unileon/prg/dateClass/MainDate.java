package es.unileon.prg.dateClass;

public class MainDate{

	public static void main(String args[]){
	try{
		Date date = new Date(4,2,2015);
		
	}catch(myException exception){
		exception.getMessage();
	}
		
		System.out.println(date.printDate());
	}
}
