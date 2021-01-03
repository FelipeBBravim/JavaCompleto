package model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.services.OnlineService;

public class Contract {

	private Integer number;
	private Date date;
	private Double price;
		
	List<Installments> list = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Date date, Double price) {
		this.number = number;
		this.date = date;
		this.price = price;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public List<Installments> getList() {
		return list;
	}

	public void addInstallment(Installments installment) {
		list.add(installment);
	}
	
	public void removeInstallment(Installments installment) {
		list.remove(installment);
	}
	
}
