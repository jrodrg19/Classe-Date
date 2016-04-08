package es.unileon.prg.dateClass;

public class MainDate{

	public static void main(String args[]){
		Date date=new Date();
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.printDate());
		System.out.println(date.season());
		System.out.println(date.getMonthLeft());
		System.out.println(date.sameDaysMonth());
		System.out.println(date.untilTheEnd());
		System.out.println(date.untilTheFirst());
		System.out.println(date.theSameDate());	
	}
}
