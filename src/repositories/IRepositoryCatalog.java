package repositories;

public interface IRepositoryCatalog {
	
	public IJourneyRepository getJourneys();
	public ILuggageRepository getLuggages();
	public IPassengerRepository getPassengers();
	public ITicketRepository getTickets();
	public ITrainRepository getTrains();
	
}
