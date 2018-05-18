package unit_tests;

import java.util.ArrayList;

public class LearningArrayLists {

	public static void addToArrayList(ArrayList test, String string) {
		// TODO Auto-generated method stub
		test.add(string);
		
	}

	public static ArrayList<String> createArrayList() {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
		return list;
	}

	public static int getNumberOfItems(ArrayList<String> list) {
		// TODO Auto-generated method stub
	
		return list.size();
	}

	public static String getItem(ArrayList<String> list, int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	public static String iterateOver(ArrayList<String> list) {
		// TODO Auto-generated method stub
		String s ="";
		for(String a:list) {
			s+=a;
		}
		
		return s;
	}

	public static int findItemOnList(ArrayList<String> list, String string) {
		// TODO Auto-generated method stub
		
		return list.indexOf(string);
	}

	public static void replaceItem(ArrayList list, int i, String string) {
		// TODO Auto-generated method stub
		list.remove(i);
		list.add(i, string);
		
	}

	public static void insertItem(ArrayList list, int i, String string) {
		// TODO Auto-generated method stub
		list.add(i, string);
		
	}

	public static ArrayList<Integer> createTypedArrayList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		return list;
	}

	public static Object addAllInteger(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int s=0;
		for(int x:list) {
			s+=x;
		}
		return s;
	}

	public static String addAllString(ArrayList<String> list) {
		// TODO Auto-generated method stubint s=0;
		String s="";
		for(String x:list) {
			s+=x;
		}
		return s;
	
	
	}

	
}
