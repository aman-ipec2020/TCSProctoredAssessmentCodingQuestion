package main.classesProblemStatements.simCardProblem;

import java.util.Comparator;

public class Sim {

	private String simID;
	private String providerName;
	private double balance;
	private double ratePerSec;
	private String circle;
	
	public Sim() {
		
	}

	public Sim(String simID, String providerName, double balance, double ratePerSec, String circle) {
		super();
		this.simID = simID;
		this.providerName = providerName;
		this.balance = balance;
		this.ratePerSec = ratePerSec;
		this.circle = circle;
	}

	public String getSimID() {
		return simID;
	}

	public void setSimID(String simID) {
		this.simID = simID;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatePerSec() {
		return ratePerSec;
	}

	public void setRatePerSec(double ratePerSec) {
		this.ratePerSec = ratePerSec;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "Sim [simID=" + simID + ", providerName=" + providerName + ", balance=" + balance + ", ratePerSec="
				+ ratePerSec + ", circle=" + circle + "]";
	}
}

class SortByBalance implements Comparator<Sim>{

	@Override
	public int compare(Sim o1, Sim o2) {
		return (int) ((int) o2.getBalance() - o1.getBalance());
	}
}
