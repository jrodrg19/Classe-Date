package es.unileon.prg.dateClass;

public class Date{

	private int day;
	private int month;
	private int year;
	
public Date(){

	this.day=19;
	this.month=4;
	this.year=2015;
}

public Date(int day,int month,int year)throws myException{

		StringBuffer message= new StringBuffer();

		if(day<1||day>31){
			message.append("The number of the day is wrong you write "+day+".\n");
		}
		if(month<1||month>12){
			message.append("The month is wrong your month is "+month+".\n");
		}
		else if ((day>30)&&(month==4||month==6||month==9||month==11)){
				message.append("The month "+month+" haven't "+day+" days\n");
			}
		else if ((day>28)&&(month==2)){
				message.append("The month "+month+" haven't "+day+" days\n");
			}
		else if(year<1){
			message.append("The "+year+" is wrong.\n");
		}
		
		if(message.length()!=0){
			throw new myException(message.toString());
		}
		else{
			this.day=day;
			this.month=month;
			this.year=year;
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

public void setDay(int newDay){
this.day=newDay;
}
public void setMonth(int newMonth){
this.month=newMonth;
}
public void setYear(int newYear){
this.year=newYear;
}

public boolean sameDay(Date var){
	boolean dayReturn=false;
	if(this.day==var.getDay()){
		dayReturn=true;
	}
	return dayReturn;
}

public boolean sameMonth(Date var){
	boolean monthReturn=false;
	if(this.month==var.getMonth()){
		monthReturn=true;
	}
	return monthReturn;
}

public boolean sameYear(Date var){
	boolean yearReturn=false;
	if(this.year==var.getYear()){
		yearReturn=true;
	}
	return yearReturn;
}

/*switch execises*/
public String getMonthName(int month){
	String res= new String();
	switch(month){
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
		case 12:res="December";
		break;
	}
	return res;
}
public int daysOfMonth(int month){
	int days;
	switch(month){
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
public String season(){
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
/*end switch exercises*/
/*Here start the for's exercises*/
public String printDate(){
	StringBuffer date=new StringBuffer();
	date.append(getDay()+","+getMonthName(getMonth())+","+getYear());
	return date.toString();
}

public String getMonthLeft(){
	StringBuffer output=new StringBuffer();
	int month=getMonth();
	output.append("The remaining months are: \n");
	for(int i=month+1;i<=12;i++){
		output.append(getMonthName(i)+"\n");
	}
	return output.toString();
}

public String untilTheEnd(){
	int i;
	StringBuffer dates=new StringBuffer();
	dates.append("The days to the end of the month;\n");
	for(i=getDay()+1;i<=daysOfMonth(getMonth());i++){
		dates.append(i+","+getMonthName(getMonth())+","+getYear()+"\n");
	}
	return dates.toString();
}

public String sameDaysMonth(){
	StringBuffer months=new StringBuffer();;
	int days=daysOfMonth(getMonth());
	int i;
	months.append("The months with same days are: \n");
	for(i=1;i<=12;i++){
		if(daysOfMonth(i)==days){
			months.append(getMonthName(i)+", ");	
		}
	}
	return months.toString();
}

public String untilTheFirst(){
	StringBuffer dates = new StringBuffer();
	int i, j, k;
	dates.append("The days since the first day of the year:\n");
	for(i=1;i<=getMonth();i++){
		if(i!=getMonth()){
			for(j=1;j<=daysOfMonth(i);j++){
				dates.append(j+","+getMonthName(i)+","+getYear()+"\n");
			}
		}
		else{
			for(k=1;k<getDay();k++){
				dates.append(k+","+getMonthName(i)+","+getYear()+"\n");
			}
		}
	}
	return dates.toString();
}
/*End for's exercises*/
/*while exercise*/
public int theSameDate(){
	int cont=0;
	double day=3;
	double month=3;
	while(day!=getDay()&&month!=getMonth()){
		day=Math.random()*31+1;
		month=Math.random()*12+1;
		year=getYear();
		if (day!=getDay()&&month!=getMonth()){
			cont++;
		}

	}
	return cont;
}
/*End while exercise*/
}
