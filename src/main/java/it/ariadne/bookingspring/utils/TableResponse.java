package it.ariadne.bookingspring.utils;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TableResponse <T>{
	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private ArrayList<? extends T> data;
	
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public ArrayList<? extends T> getData() {
		return data;
	}
	public void setData(ArrayList<? extends T> data) {
		this.data = data;
	}

}
