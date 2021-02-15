package pack;
import java.util.*;
public class Jmap
{
	public static void main(String[] args) {
		HashMap<Integer,String> maps = new HashMap<Integer,String>();
		maps.put(101,"AJAY");
		maps.put(102,"vijay");
		maps.put(103,"sandeep");
		System.out.println(maps);
		maps.put(102,"ramesh");
		System.out.println(maps);
		maps.put(104,"ramesh");
		maps.remove(102);
		System.out.println(maps);
	}
}