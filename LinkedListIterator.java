

import java.util.Iterator;


public class LinkedListIterator<T> implements Iterator<T> {
	
		private pos<T> current;
		
		public LinkedListIterator (pos<T> head){
			current=head;
		}
		
		public boolean hasNext() {
			return current!=null;
		}
		
		public T next() {
			T data = current.value(); 
	        current = current.after(); 
	        return data;
		}
		
		 public void remove() 
		    { 
		        throw new UnsupportedOperationException(); 
		    } 
		
		 
		
	}


