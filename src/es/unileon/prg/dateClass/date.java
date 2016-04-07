package es.unileon.prg.dateClass;

public class Date {

public date(){
	/*Damos valores a las variables a la vez que las creamos*/
	int day=1;
	int month=1;
	int year=2016;
}

public date(int day, int month, int year) throws myException{
		StringBuffer mensaje= new StringBuffer();
		if(dia<0){/*hay que dividir en varios if hay que hacer un @Test para cara if*/
			mensaje.append("El dia es erroneo has dado el "+day+".\n");
		if(month<0||month>12)
			mensaje.append("El mes es erroneo tu mes es "+month+".\n");
		}
		else if (day>daysOfMonth(month)){
				mensaje.append("El mes "+month+" no tiene "+day+" dias\n");
			}
		else if(year<0){
			mensaje.append("El "+year+" es incorrecto.\n");
		}
		else{
			this.day=day;
			this.month=month;
			this.year=year;
		}
		if(mensaje.length()!=0){
			throw new myException(mensaje.toString());
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

public String printDate(){
	String fecha=new String();
	fecha.append(getDay()+","+getMonthName(getMonth())+","+getYear());
	return fecha;
}

public String getMonthLeft(int month){
	StringBuffer res= new StringBuffer();
	res.append=("Los meses que quedan son: ");
	for(int i=month+1;i<12;i++){
		res.append=(getNameMonth(month)+"\n");
	}
	return res.toString();
}

public String untilTheEnd(){
	StringBuffer fechas= new StringBuffer();
	for(i=getDay()+1;i<daysOfMonth();i++){
		fechas.append=(i+","+getMonth()+","+getYear()+"\n");
	}
	return fechas;
}

public String sameDaysMonth(int month){
	StrigBuffer meses = new StringBuffer();
	int dias=daysOfMonth(month);
	int i;
	meses.append("Los meses que quedan son: \n");
	for(i=1;i<=12;i++){
		if(daysOfMonth(i)==dias){
			meses.append(getMonthName(i)+", ");	
		}
	}
	return meses;
}

public String untilTheFirst(){
	StringBuffer fechas = new StringBuffer();
	int i, j, k;
	for(i=1;i<=getMonth();i++){
		for(j=1;j<daysOfMOnth(i);j++){
			fechas.append=(j+","+getMonthName(i)+","+getYear());
			if(i==getMonth()){
				for(k=2;k<getDay();k++){
					fechas.append(j+","+getMonthName(i)+","+getYear());
				}
			}
		}
	}
	return fechas;
}

public boolean sameDay(Date var){
	boolean dayRetorno=false;
	if(this.day=var.getDay()){
		dayRetorno=true;
	}
	return dayRetorno;
}

public boolean sameMonth(Date var){
	boolean monthRetorno=false;
	if(this.month=var.getMonth()){
		monthRetorno=true;
	}
	return monthRetorno;
}

public boolean sameYear(Date var){
	boolean yearRetorno=false;
	if(this.year=var.getYear()){
		yearRetorno=true;
	}
	return yearRetorno;
}

public String getMonthName(int month){
	String res= new String();
	switch(month){
		case 1:res="Enero";
		break;
		case 2:res="Febrero";
		break;
		case 3:res="Marzo";
		break;
		case 4:res="Abril";
		break;
		case 5:res="Mayo";
		break;
		case 6:res="Junio";
		break;
		case 7:res="Julio";
l		break;
		case 8:res="Agosto";
		break;
		case 9:res="Septiembre";
		break;
		case 10:res="Octubre";
		break;
		case 11:res="Noviembre";
		break;
		case 12:res="Diciembre";
		break;
	}
	return res;
}

public daysOfMonth(int month){
	switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		return 31;
		break;
		case 2:
		return 28;
		break;
		default:
		return 30;
		break;
	}
}

public String season(){
	String estacion=new String();
	switch(getMonth()){
	case 1:
	case 2:
		estacion.append=("invierno");
	break;
	case 3:
			if(getDay()<21){
				estacion.append=("invierno");
			}
			else{
				estacion.append=("primavera");
			}
	break;
	case 4:
	case 5:
		estacion.append=("primavera");
	break;
	case 6: 
			if(getDay()<21){
				estacion.append=("primavera");
			}
			else
			{
				estacion.append=("Verano");
			}
	break;
	case 7:
	case 8:
		estacion.append=("Verano");
	case 9:
			if(getDay()<23){
				estacion.append=("verano");
			}
	break;
	default:
		estacion.append=("Otoño");
	break;
}

}
