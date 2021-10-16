

public class pos<T> implements Position_<T> {
	
	private T v;
	private pos<T> n;
	public pos (T val,pos<T> next) 
	{
		v=val;
		n=next;
		
	}
	public T value() {
		return v;
	}
	
	public pos<T> after(){
		return n;
	}
}
