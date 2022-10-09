package com.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HotelReservation")
public class Hotelreservationlog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
      private int Reservation_no;
	@Column(name="name")
      private String name;
	@Column(name="Address")
      private String Address;
	@Column(name="Mobile_no")
      private Long Mobile_no;
    @Column(name="Check_in")
      private LocalDate Check_in;
    @Column(name="Check_out")
      private LocalDate Chech_out;
    @Column(name="Room_No")
	 private int Room_No;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Reservation_no")
	private Rooms rooms;
	
      public Hotelreservationlog()
      {
    	  
      }
	public Hotelreservationlog( String name, String address, Long mobile_no, LocalDate check_in,
			LocalDate chech_out, int room_no) {
		super();
		this.name = name;
		Address = address;
		Mobile_no = mobile_no;
		Check_in = check_in;
		Chech_out = chech_out;
		Room_No = room_no;
	}
	public int getReservation_no() {
		return Reservation_no;
	}
	public void setReservation_no(int reservation_no) {
		Reservation_no = reservation_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}
	public LocalDate getCheck_in() {
		return Check_in;
	}
	public void setCheck_in(LocalDate check_in) {
		Check_in = check_in;
	}
	public LocalDate getChech_out() {
		return Chech_out;
	}
	public void setChech_out(LocalDate chech_out) {
		Chech_out = chech_out;
	}
	
	
	public int getRoom_No() {
		return Room_No;
	}
	public void setRoom_No(int room_No) {
		Room_No = room_No;
	}
	public Rooms getRooms() {
		return rooms;
	}
	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
}
}
