package domain;

import java.util.List;
import java.util.ArrayList;

public class Passenger extends Entity{
	
	private String firstName;
	private String surname;
	private String age;
	private String sex;
	private String idNumber;
	private int ticketId;
	private int journeyId;
	private Ticket ticket;
	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	private List<Luggage> luggages;
	
	
	public Passenger() {
		luggages = new ArrayList<>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int flightId) {
		this.journeyId = flightId;
	}

	public List<Luggage> getLuggages() {
		return luggages;
	}

	public void setLuggages(List<Luggage> luggages) {
		this.luggages = luggages;
	}

	
}
