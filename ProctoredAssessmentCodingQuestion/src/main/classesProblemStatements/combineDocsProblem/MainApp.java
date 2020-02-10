package main.classesProblemStatements.combineDocsProblem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	private static List<Document> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Document docx1 = new Document(1,"resume","personal",50);
			list.add(docx1);
		Document docx2 = new Document(2,"question1","exams",55);
			list.add(docx2);
		Document docx3 = new Document(3,"question2","exams",45);
			list.add(docx3);
		Document docx4 = new Document(4,"India","misc",40);
			list.add(docx4);
			
			
		System.out.println(combineDocs());
	}

	public static Document combineDocs()	{
		
		int sum = 0;
		String title = "";
		String folderName = "";
		int pages = 0;
		
		for(Document obj1 : list)	{
			sum = sum + obj1.getId();
			title = title + obj1.getTitle()+"#";
			folderName = folderName + obj1.getFolderName() + "@";
			pages = pages + obj1.getPages();
		}
		
		title = title.substring(0, title.length()-1);
		folderName = folderName.substring(0, folderName.length()-1);
		
		Document obj = new Document(sum, title, folderName, pages);
		
		return obj;
	}
}
