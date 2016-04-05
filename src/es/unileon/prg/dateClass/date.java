
package es.unileon.prg.dateClass;

public date(int day, int month, int year) throws myException{
		StringBuffer mensaje= new StringBuffer();
		if((day<0||day>31)||(month<1||month>12)){
			mensaje.append("Error");
		}
		else{
			this.day=day;
			this.month=month;
		}
		if(mensaje.lenth()!=0){
			throw new myException(mensaje.toString());
		}
}
