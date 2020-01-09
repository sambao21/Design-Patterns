package trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroStreams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> str = list.stream();
		// even number
		List<Integer> list1 = str.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);

		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Stream has intermediate and terminal operations
		// intermediate 
		//map,sorted,filter

		memberNames.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
		memberNames.stream().filter(s-> s.startsWith("A")).map(String :: toUpperCase).forEach(System.out :: println);
		memberNames.stream().sorted().map(String :: toUpperCase).forEach(System.out :: println);
		
		//termninal operations
		//return result of certain type
		//forEach.collect,match,count,reduce
		
		System.out.println (memberNames.stream().anyMatch(s -> s.endsWith("E")));	
		String s = memberNames.stream().findFirst().get();
		System.out.println(s);	
	}

}
