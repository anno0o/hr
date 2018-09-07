package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Ex1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		File src = new File("D:\\ДњТы\\Test.txt");
		File dst = new File("D:\\ДњТы\\Demo.txt");
		System.out.println("OK");
			try {
				@SuppressWarnings("rawtypes")
				TreeSet<Student> set = new TreeSet();
				FileReader fr = null;
				BufferedReader br = null;
				fr = new FileReader(src);
				br = new BufferedReader(fr);
				FileWriter fw =null;
				fw = new FileWriter(dst);
				BufferedWriter bw = null;
				bw = new BufferedWriter(fw);
				String line =null;
				while((line=br.readLine())!=null){
					String[] str = line.split("#");
					int score= Integer.valueOf(str[2])+Integer.valueOf(str[3])+Integer.valueOf(str[4]);
					Student stu =new Student(str[1],score);
					set.add(stu);
				}
				for(Student s :set){
					bw.write(s.toString());
					bw.newLine();
				}
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}























