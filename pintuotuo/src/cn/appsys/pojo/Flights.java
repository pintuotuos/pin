package cn.appsys.pojo;

import java.util.Date;



public class Flights {
	private int id;
	private String flightCode;
	private Date flightDate;
	private String airline;
	private String type;
	private int takeoffAirportId;
	private int landingAirportId ;
	private Date takeoffTime;
	private Date landingTime;
	private String cName;//出发地
	private String mName;//目的地
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTakeoffAirportId() {
		return takeoffAirportId;
	}
	public void setTakeoffAirportId(int takeoffAirportId) {
		this.takeoffAirportId = takeoffAirportId;
	}
	public int getLandingAirportId() {
		return landingAirportId;
	}
	public void setLandingAirportId(int landingAirportId) {
		this.landingAirportId = landingAirportId;
	}
	public Date getTakeoffTime() {
		return takeoffTime;
	}
	public void setTakeoffTime(Date takeoffTime) {
		this.takeoffTime = takeoffTime;
	}
	public Date getLandingTime() {
		return landingTime;
	}
	public void setLandingTime(Date landingTime) {
		this.landingTime = landingTime;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public String getStopAirport() {
		return stopAirport;
	}
	public void setStopAirport(String stopAirport) {
		this.stopAirport = stopAirport;
	}
	public int getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(int referencePrice) {
		this.referencePrice = referencePrice;
	}
	private String flightTime;
	private String stopAirport;
	private int referencePrice;
	
	
}
