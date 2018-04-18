package cn.appsys.pojo;

public class Flight_Tickets {
	private int id;
	private int flightId;
	private int ticketPrice;
	private String sellCompany;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getSellCompany() {
		return sellCompany;
	}
	public void setSellCompany(String sellCompany) {
		this.sellCompany = sellCompany;
	}
}
