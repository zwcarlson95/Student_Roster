package Module8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDriver {
	
	public static void main(String[] args) throws IOException {
		String cont;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Student> studentList = new LinkedList<Student>();
		
		System.out.println("Welcome to the Student GPA Sorter");
		
		try {			
			do {
				System.out.println("");
				System.out.print("Enter student name: ");
				String name = br.readLine();
				
				System.out.print("Enter student address: ");
				String address = br.readLine();
				
				System.out.print("Enter student GPA: ");
				double GPA = Double.parseDouble(br.readLine());
				
				Student s = new Student(name, address, GPA);
				studentList.add(s);
				
				System.out.println("");
				System.out.print("Do you want to add another student?(y/n): ");
				cont  = br.readLine();
			}
			while (!cont.equals("n"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		Collections.sort(studentList);
		
		Iterator<Student> sIter = studentList.iterator();
		
		try {
			FileWriter fw = new FileWriter("/Users/ZachCarlson/Documents/StudentData.txt");
			while (sIter.hasNext()) {
				fw.write(sIter.next().toString() + "\n");
			}
			fw.close();
			System.out.print("File has been created!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
