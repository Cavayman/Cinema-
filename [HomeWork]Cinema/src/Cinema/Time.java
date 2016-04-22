package Cinema;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Time {
private int hour ; 
private int min ;
private int time; 
public Time() {
	// TODO Auto-generated constructor stub
}
public Time(int hour, int min) {
	
	this.setHour(hour);
	this.setMin(min);
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	while(hour>23)
	{hour=hour-24; 
	}
	this.hour = hour;
	}

public int getMin() {
	return min;
}
public int getTime()
{ int tempmin=min;
	int temphour=hour;
	while(temphour>0)
	{tempmin+=60; 
	temphour--; 
		
	}
	return tempmin;
}
public void setMin(int min) {
	while(min>=60){
		this.setHour(this.getHour()+1);
		min=min-60;
	}
	
	
	this.min = min;
}
@Override
public String toString() {
	NumberFormat nf= new DecimalFormat("##"+"##");
	nf.setMinimumIntegerDigits(2);
	

	
	return nf.format(hour)+":"+nf.format(min);
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + time;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	if (time != other.time)
		return false;
	return true;
} 




}
