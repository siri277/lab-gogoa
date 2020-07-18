package services;
import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking {
	
	public double book(Hotel hotel) {
		double totalfare = 0;
		int totalDays=hotel.getTodate().getDayOfMonth()-hotel.getTodate().getDayOfMonth();
		if(hotel.getFromdate().isAfter(hotel.getTodate())) {
			totalfare=totalDays*booking(hotel.getNoOfPersons(), hotel.getRates());
		}
		return totalfare;
	}
	public double book(Flight flight) {
		double totalfare=0;
		if(flight.getTriptype().equals("one-way"))
			totalfare = booking(flight.getNoOfPersons(),flight.getRates());
		else if(flight.getFrom().isBefore(flight.getTo()))
			totalfare = booking(flight.getNoOfPersons(),flight.getRates());
		else
			return 0;
		return totalfare;

		}
	public double book(Train train) {
		double totalfare=0;
		totalfare=train.getNoOfPersons()*train.getRates();
		return totalfare;
	}
	public double book(Bus bus) {
		double totalfare=0;
		totalfare=bus.getNoOfPersons()*bus.getRates();
		return totalfare;
	}

}