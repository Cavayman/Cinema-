package Cinema;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
private Set<Seance> seances;
private int count=0; 

public Schedule() {
seances=new TreeSet<Seance>();
}

public Schedule(Set<Seance> seances) {
	seances= new TreeSet<Seance>();
	this.seances = seances;
}



/**
 * Додати провірку чи ми додаємо 
 * не посередині сеансу і чи кінець 
 * і початок не пересікається з іншимми
 */
public boolean addSeance(Seance temp){
	if(temp!=null){
		
		if(count>=2){System.out.println("entered");
				Iterator<Seance> it=seances.iterator();
				
				while(it.hasNext())
				{
					Seance s1=it.next();
					Seance s2=it.next();					
					if( temp.getStartTime().getTime()>s2.getEndTime().getTime())
					{
						seances.add(temp);return true;
					}
					else
						if(temp.getStartTime().getTime()>s1.getEndTime().getTime()&&temp.getEndTime().getTime()<s2.getStartTime().getTime())
				 { seances.add(temp);System.out.println("addet");return true;}
				}
			}
			
			
			else{
	seances.add(temp);count++;return true;
		}}
		return false;
}
public boolean removeSeance(String title)
{Iterator<Seance> it=seances.iterator();
while(it.hasNext())
{Seance s=it.next();
if(s.getMovie().getTitle().equals(title))
{
	it.remove();
	return true;
}
else return false; 
}
return false;
	
}
public boolean removeSeance(Seance seance)
{ 	Iterator<Seance> it=seances.iterator();
	while(it.hasNext())
	{
		Seance temp=it.next();
		if(temp.equals(seance))
			{it.remove();
			return true;
			}
	}
	return false; 
}
public Seance getSeance(Seance seance)
{
	Iterator<Seance> it=seances.iterator();
	while(it.hasNext())
	{
		Seance temp=it.next();
				if(temp.equals(seance))
				{
					return temp;
				
				}
	}
	System.out.println("There is no  such Seance");
	return  null; 
}
public void showSchedule(){
	Iterator<Seance> it=seances.iterator();
	while(it.hasNext())
	{
		Seance temp=it.next();
				System.out.println(temp);
	}
	
}


public Set<Seance> getSeances() {
	return seances;
}

public void setSeances(Set<Seance> seances) {
	this.seances = seances;
}

@Override
public String toString() {
	return ""+seances+"\n";
}







}
