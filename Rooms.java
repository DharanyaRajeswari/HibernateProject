package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Rooms")
public class Rooms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
	private int Reservation_no;
	@Column(name="Room_No")
	 private int Room_No;
	@Column(name="Room_Type")
	 private String Room_Type;
	@Column(name="Bed_Type")
	 private String Bed_Type;
	@Column(name="Amount")
    private double Amount;
	 public Rooms()
	 {
		 
	 }
	public Rooms(int room_No, String room_Type, String bed_Type , double amount) {
		super();
		Room_No = room_No;
		Room_Type = room_Type;
		Bed_Type = bed_Type;
		Amount = amount;

	}
	
	public int getReservation_no() {
		return Reservation_no;
	}
	public void setReservation_no(int reservation_no) {
		Reservation_no = reservation_no;
	}
	public int getRoom_No() {
		return Room_No;
	}
	public void setRoom_No(int room_No) {
		Room_No = room_No;
	}
	public String getRoom_Type() {
		return Room_Type;
	}
	public void setRoom_Type(String room_Type) {
		Room_Type = room_Type;
	}
	public String getBed_Type() {
		return Bed_Type;
	}
	public void setBed_Type(String bed_Type) {
		Bed_Type = bed_Type;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
}
}
