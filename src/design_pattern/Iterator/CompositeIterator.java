package design_pattern.Iterator;

import java.util.Iterator;
import java.util.Stack;

//类比N叉树的非递归DFS,其中菜单都是非叶节点，菜单项都是叶节点

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<>();
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	public  MenuComponent next() {
		if(hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if(component instanceof Menu1) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
	
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
