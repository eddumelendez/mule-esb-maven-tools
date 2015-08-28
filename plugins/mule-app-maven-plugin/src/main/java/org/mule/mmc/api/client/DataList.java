package org.mule.mmc.api.client;

/**
 * @author Eddú Meléndez
 */
public class DataList<T> {

	private int total;

	private T data;

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataList{" +
				"total=" + total +
				", data=" + data +
				'}';
	}
}
