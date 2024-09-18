package com.coderscampuse.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	int size = 0;
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {

		if (size == items.length) {
			resizeArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	private void resizeArray() {
		Object[] newItems = new Object[items.length * 2];
		for (int i = 0; i < items.length; i++) {
			newItems[i] = items[i];
		}
		items = newItems;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		return (T) items[index];
	}

}
