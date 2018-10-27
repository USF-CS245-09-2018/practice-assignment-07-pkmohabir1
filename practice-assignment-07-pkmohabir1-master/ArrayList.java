
public class ArrayList implements List{

	private int size;
	private Object[] a;
	
	public ArrayList(){
		size = 0;
		a = new Object[10000];
	}
	
	public void add(Object obj){
		if(size == a.length){
			grow_array();
		}
		a[size] = obj;
		++size;
	}
	
	public void add(int pos, Object obj){
		
		if(pos > size || pos < 0){
			throw new IllegalArgumentException("");
		}
		else if(size == a.length){
			grow_array();
		}
		for(int i = size; i > pos; i--){
			a[i]=a[i+1];
		}
		a[pos] = obj;
		size++;
	}
	
	public Object get(int pos){
		if(pos > size || pos < 0){
			throw new IllegalArgumentException("");
		}
		return a[pos];
	}
	
	public Object remove(int pos){
		if(pos >= size || pos < 0){
			throw new IllegalArgumentException("");
		}
		Object temp = a[pos];
		for(int i = pos; i < size-1; i++){
			a[i] = a[i+1];
		}
		size--;
		return temp;
	}
	
	public int size(){
		return size;
	}
	
	public void grow_array(){
		Object[] newArray = new Object[a.length*2];
		for(int i = 0; i <= size; i++){
			newArray[i] = a[i+1];
		}
		a = newArray;
		
	}


}