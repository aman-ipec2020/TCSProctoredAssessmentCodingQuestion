package main.classesProblemStatements.technologyAssociateProblem;

import java.util.Comparator;

public class Associate implements Comparable<Associate>{
	
	private String associateID;
	private String associateName;
	private String associateTechnology;
	private int experinceInYear;

	public Associate() {
		super();
	}
	
	public Associate(String associateID, String associateName, String associateTechnology, int experinceInYear) {
		super();
		this.associateID = associateID;
		this.associateName = associateName;
		this.associateTechnology = associateTechnology;
		this.experinceInYear = experinceInYear;
	}

	public String getAssociateID() {
		return associateID;
	}

	public void setAssociateID(String associateID) {
		this.associateID = associateID;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getAssociateTechnology() {
		return associateTechnology;
	}

	public void setAssociateTechnology(String associateTechnology) {
		this.associateTechnology = associateTechnology;
	}

	public int getExperinceInYear() {
		return experinceInYear;
	}

	public void setExperinceInYear(int experinceInYear) {
		this.experinceInYear = experinceInYear;
	}

	@Override
	public String toString() {
		return "Associate [associateID=" + associateID + ", associateName=" + associateName + ", associateTechnology="
				+ associateTechnology + ", experinceInYear=" + experinceInYear + "]";
	}

//	sorting with class attributes, that are not a primitive data type	
	@Override
	public int compareTo(Associate o) {
		// TODO Auto-generated method stub
		return this.getAssociateName().compareTo(((Associate) o).getAssociateName());
	}
}

//	sorting with primitive data type
class SortByExperince implements Comparator<Associate>	{

	@Override
	public int compare(Associate o1, Associate o2) {
//			sort in ascending order
		return o1.getExperinceInYear() - o2.getExperinceInYear();
		
//		 	sort in descending order
//		return o2.getExperinceInYear() - o1.getExperinceInYear();
	}	
}
