package Cinema;

public class Seance implements Comparable<Seance> {
	private Movie movie;
	private Time startTime;
	private Time endTime;

	public Seance() {
		movie = new Movie();
		startTime = new Time();
		endTime = new Time();
	}

	public Seance(String movieTitle, int durationTime, int StartHour, int StartMin) {
		this.movie = new Movie(movieTitle, durationTime);
		this.startTime = new Time(StartHour, StartMin);
		this.endTime = new Time(0, movie.getDuration() + startTime.getTime());

	}

	public Seance(int startTimeHour, int startTimeMin) {

		this.startTime = new Time(startTimeHour, startTimeMin);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
		endTime.setMin(this.movie.getDuration());
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public int getDuration() {
		return movie.getDuration();
	}

	@Override
	public String toString() {
		return "Seance:" + movie.getTitle() + ",Start=" + startTime + ", End=" + endTime + " Duration:"
				+ movie.getDuration() + ",min\n";
	}

	@Override
	public int compareTo(Seance arg0) {
		return this.endTime.getTime() - arg0.endTime.getTime();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		Seance other = (Seance) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

}
