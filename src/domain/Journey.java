package domain;

import java.util.ArrayList;
import java.util.List;



public class Journey extends Entity{
	
		private String departureDate;
		private String departurePlace;
		private String destination;
		private String distance;
		private String trainline;
		private int journeyId;
		private List<Passenger> passengers;
		

		public Journey() {
			passengers = new ArrayList<>();
		}
		
		public List<Passenger> getPassengers() {
			return passengers;
		}
		
		public void setPassengers(List<Passenger> passengers) {
			this.passengers = passengers;
		}
		
		public String getDepartureDate() {
			return departureDate;
		}
		
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		
		public String getDestination() {
			return destination;
		}
		
		public void setDestination(String destination) {
			this.destination = destination;
		}
		
		public String getDeparturePlace() {
			return departurePlace;
		}

		public void setDeparturePlace(String departurePlace) {
			this.departurePlace = departurePlace;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public String getTrainline() {
			return trainline;
		}
		
		public void setTrainline(String trainline) {
			this.trainline = trainline;
		}

		public int gettrainId() {
			return trainId;
		}

		public void setTrainId(int TrainId) {
			this.trainId = trainId;
		}
		
	
		
		
}