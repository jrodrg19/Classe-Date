package es.unileon.prg.dateClass;

public class Date {

	private int day;
	private int month;
	private int year;
	
public Date(){
	/*Damos valores a las variables a la vez que las creamos*/
	 day=1;
	 month=1;
	 year=2015;
}

public Date(int day,int month,int year) throws myException{
		StringBuffer message= new StringBuffer();
		if(day<0){/*hay que dividir en varios if hay que hacer un @Test para cara if*/
			message.append("El dia es erroneo has dado el "+day+".\n");
		if(month<0||month>12)
			message.append("El mes es erroneo tu mes es "+month+".\n");
		}
		else if (day>daysOfMonth(getMonth())){
				message.append("El mes "+month+" no tiene "+day+" dias\n");
			}
		else if(year<0){
			message.append("El "+year+" es incorrecto.\n");
		}
		else{
			this.day=day;
			this.month=month;
			this.year=year;
		}
		if(message.length()!=0){
			throw new myException(message.toString());
		}
}

public int getDay(){
	return this.day;
}

public int getMonth(){
	return this.month;
}

public int getYear(){
	return this.year;
}

void setDay(int newDay){
	this.day=newDay;
}

void setMonth(int newMonth){
	this.month=newMonth;
}

void setYear(int newYear){
	this.year=newYear;
}
/*Here start the for's exercises*/
public String printDate(){
	StringBuffer date=new StringBuffer();
	date.append(getDay()+","+getMonthName(getMonth())+","+getYear());
	return date.toString();
}

public String getMonthLeft(){
	StringBuffer output=new StringBuffer();
	output.append("The remaining months are: \n");
	for(int i=month+1;i<12;i++){
		output.append(getMonthName(getMonth())+"\n");
	}
	return output.toString();
}

public String untilTheEnd(){
	int i;
	StringBuffer dates=new StringBuffer();
	for(i=getDay()+1;i<daysOfMonth(getMonth());i++){
		dates.append(i+","+getMonthName(getMonth())+","+getYear()+"\n");
	}
	return dates.toString();
}

public String sameDaysMonth(){
	StringBuffer months=new StringBuffer();;
	int days=daysOfMonth(getMonth());
	int i;
	months.append("The remaining months are: \n");
	for(i=1;i<=12;i++){
		if(daysOfMonth(getMonth())==days){
			months.append(getMonthName(i)+", ");	
		}
	}
	return months.toString();
}

public String untilTheFirst(){
	StringBuffer dates = new StringBuffer();
	int i, j, k;
	for(i=1;i<=getMonth();i++){
		if(i!=getMonth()){
			for(j=1;j<=daysOfMonth(getMonth());j++){
				dates.append(j+","+getMonthName(getMonth())+","+getYear()+"\n");
			}
		}
		else{
			for(k=1;k<getDay();k++){
				dates.append(k+","+getMonthName(getMonth())+","+getYear()+"\n");
			}
		}
	}
	return dates.toString();
}
/*End for's exercises*/
public boolean sameDay(Date var){
	boolean dayRetorno=false;
	if(this.day==var.getDay()){
		dayRetorno=true;
	}
	return dayRetorno;
}

public boolean sameMonth(Date var){
	boolean monthRetorno=false;
	if(this.month==var.getMonth()){
		monthRetorno=true;
	}
	return monthRetorno;
}

public boolean sameYear(Date var){
	boolean yearRetorno=false;
	if(this.year==var.getYear()){
		yearRetorno=true;
	}
	return yearRetorno;
}

public String getMonthName(int month){
	String res= new String();
	switch(getMonth()){
		case 1:res="January";
		break;
		case 2:res="February";
		break;
		case 3:res="March";
		break;
		case 4:res="April";
		break;
		case 5:res="May";
		break;
		case 6:res="June";
		break;
		case 7:res="July";
		break;
		case 8:res="August";
		break;
		case 9:res="September";
		break;
		case 10:res="October";
		break;
		case 11:res="November";
		break;
		case 12:res="Deceember";
		break;
	}
	return res;
}

public int daysOfMonth(int month){
	int days;
	switch(getMonth()){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			 days=31;
		break;
		case 2:
			 days=28;
		break;
		default:
			 days=30;
		break;
	}
	return days;
}

public String season(int month){
	String season=new String();
	switch(getMonth()){
	case 1:
	case 2:
		season=("Winter");
	break;
	case 3:
			if(getDay()<21){
				season=("Winter");
			}
			else{
				season=("Spring");
			}
	break;
	case 4:
	case 5:
		season=("Spring");
	break;
	case 6: 
			if(getDay()<21){
				season=("Spring");
			}
			else
			{
				season=("Summer");
			}
	break;
	case 7:
	case 8:
		season=("Summer");
	case 9:
			if(getDay()<23){
				season=("Summer");
			}
			else{
				season=("Autumn");
			}
	break;
	case 10:
	case 11:
		season=("Autumn");
	break;
	case 12:
			if(getDay()<22){
				season=("Autumn");
			}
			else{
				season=("Winter");
			}
	break;
	}
	return season;
}
}
