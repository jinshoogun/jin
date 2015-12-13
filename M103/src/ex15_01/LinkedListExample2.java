package ex15_01;
import java.util.LinkedList;



public class LinkedListExample2 {
	public static void main(String args[]){
		LinkedList <String> list = new LinkedList<String>(); 
		// LinkedList °´Ã¼¸¦ »ý¼º
		list.add("Æ÷µµ");
		list.add("µþ±â");
		list.add("º¹¼þ¾Æ");        
		
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}


// ÇöÀç »óÅÂ´Â 
//    1        2         3    
//   Æ÷µµ -> <- µþ±â -> <- º¹¼þ¾Æ
//
//