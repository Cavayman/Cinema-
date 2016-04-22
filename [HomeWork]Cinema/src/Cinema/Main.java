package Cinema;

import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {
public static void main(String[] args) 
{
	Seance s1=new Seance("Akula",60, 8, 0);
	Seance s2=new Seance("Kruk",20, 13, 0);
	Seance s3=new Seance("Akula2",100, 14, 0);
	Seance s4=new Seance("Akula3",200, 15, 0);
	Seance s5=new Seance("Akula4",20, 16, 0);
	Seance s6=new Seance("Akula5",30, 17, 0);
	Seance s7=new Seance("Akula6",180, 18, 0);
	
	Schedule sched1=new Schedule();
	sched1.addSeance(s1);
	sched1.addSeance(s2);
	sched1.addSeance(s3);
	sched1.addSeance(s4);
	sched1.addSeance(s5);
	sched1.addSeance(s6);
	sched1.addSeance(s7);
	sched1.addSeance(s7);
	System.out.println(sched1);
	
	Schedule sched2=new Schedule();
	sched2.addSeance(s1);
	sched2.addSeance(s2);
	sched2.addSeance(s3);
	sched2.addSeance(s4);
	sched2.addSeance(s5);
	sched2.addSeance(s6);
	sched2.addSeance(s7);
	sched2.addSeance(s7);
	System.out.println(sched2);
	
	Cinema m=new Cinema();
	m.addSchedule(Day.Monday, sched1);
	m.addSchedule(Day.Saturday, sched1);
	m.addSchedule(Day.Thursday, sched1);
	m.addSchedule(Day.Tuesday, sched1);
	m.addSchedule(Day.Wednesday, sched1);
	m.addSchedule(Day.Friday, sched1);
	m.addSchedule(Day.Sunday, sched1);
	m.addSeance("Friday", new Seance("test",20,17,00));
	System.out.println(m);
}
}
