package Cinema;

public class Movie {
private  String title; 
private Time duration=new Time();;
public Movie() {
	// TODO Auto-generated constructor stub
}
public Movie(String title, int durationInMin) {
	super();
	this.title = title;
	
	this.duration.setMin(durationInMin);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	title = title;
}
public int getDuration() {
	return this.duration.getTime();
}
public void setDuration(int durationMin){
	this.duration.setMin(durationMin);
} 
public String showTime()
{
	return this.duration.toString();
}
@Override
public String toString() {
	return " "+ title + " Duration:" + duration + " min";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((duration == null) ? 0 : duration.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
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
	Movie other = (Movie) obj;
	if (duration == null) {
		if (other.duration != null)
			return false;
	} else if (!duration.equals(other.duration))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}



	

}
