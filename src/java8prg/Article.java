package java8prg;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Article {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String doc=sc.nextLine();
		String s=doc.replaceAll("[,;:?!]","");
		String[] doch=s.split(" ");
		System.out.println("Total number of words is:"+ doch.length);
		List<String> listl=Arrays.asList(doch);
		System.out.println("Uniq words are:");
		List<String> uniq =listl.stream().distinct().sorted().toList();
		System.out.println("No.of unique elemnts is:"+ uniq.size());
		
		uniq.forEach(t->System.out.println(t));
		
		
		
	}

}
