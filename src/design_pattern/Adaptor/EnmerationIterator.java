package design_pattern.Adaptor;

public class EnmerationIterator implements Iterator {
	Enumeration enums;
	
	public EnmerationIterator(Enumeration enums) {
		this.enums = enums;
	}
	
	public boolean hasNext() {
		return enums.hasMoreElements();
	}
	
	public Object next() {
		return enums.nextElements();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
