

import java.util.Iterator;



public class LinkedList<T> implements LinkedList_<T> {
	public pos<T> head;
	private int size;
	public LinkedList(){
		size=0;
	}
	 public int  count() {
		 return size;
	 }
	 public pos<T> add(T e){
		 if(count()==0) {
			 pos<T> node=new pos<>(e,null);
			 head=node;
			 size++;
		 }
		 else {
		 pos<T> node =new pos<> (e,head);
		 head=node;
		 size++;
		
		 }
		 return head;
	 }



	public LinkedListIterator<T> positions() {
		 LinkedListIterator<T> obj=new LinkedListIterator<>(head);
		 return obj;
	}
	 

		 
	 
	

}
