package Epam.epamtask7;



public abstract class Process {
	public abstract void setNext(Process nextProcess);
	public abstract boolean process(int year);
}