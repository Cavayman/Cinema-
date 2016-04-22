package Cinema;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema {
	private TreeMap<Day, Schedule> map;
	private Time timeOpen = new Time(23, 59); // 23:59 becouse we search the
												// smallest time of opening and
												// if 00:00 thenn 00 00 would be
												// the smallest.
	private Time timeClose = new Time(0, 0);

	public Cinema(Day day, Schedule schedule) {

		map.put(day, schedule);
	}

	public Cinema() {
		map = new TreeMap<Day, Schedule>();
	}

	public void addSchedule(Day day, Schedule schedule) {

		map.put(day, schedule);
		openClose(map.get(day));
	}

	/*
	 * ADDMOVIE NOT WORKING NEEED TO ADD MOVIE TO WHOLE SEANCES IN THAT TIME !
	 */
	// public void addMovie(String title, int duration, int sTHour, int sTMin,
	// Seance... seance) {
	// for (Seance s : seance) {
	// s = new Seance(title, duration, sTHour, sTMin);
	// map.put(key, value)
	// }
	// }

public void addSeance(String day,Seance seance) 
{	if(!(seance.getStartTime().getHour()<timeOpen.getHour())&&!(seance.getStartTime().getHour()>timeClose.getHour()))
	{this.map.get(Day.valueOf(day)).addSeance(seance);
	}else System.out.println("Sorry chek time first");
	
	
}

	public void removeSeance(String day, Seance seance) {
		this.map.get(Day.valueOf(day)).removeSeance(seance);
		openClose(this.map.get(Day.valueOf(day)));
	}

	public void openClose(Schedule schedule) {
		for (Seance s : schedule.getSeances()) {
			if (timeOpen.getTime() > s.getStartTime().getTime()) {
				timeOpen = s.getStartTime();
			}
			if (timeClose.getTime() < s.getEndTime().getTime()) {
				timeClose = s.getEndTime();
			}
		}

	}

	public void removeMovie(Movie movietoRemove) {
		Day d[] = Day.values();
		for (int i = 0; i < d.length; i++) {
			Iterator<Seance> it = this.map.get(Day.valueOf(d[i].toString())).getSeances().iterator();
			while (it.hasNext()) {
				Seance s = it.next();
				if (s.getMovie().equals(movietoRemove))
					s.setMovie(null);

			}
		}
	}

	@Override
	public String toString() {
		return "Den:" + map + ", Otkrutya=" + timeOpen + ", Close=" + timeClose + "]";
	}

}
