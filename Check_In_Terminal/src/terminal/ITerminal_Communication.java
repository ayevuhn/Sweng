package terminal;

interface ITerminal_Communication 
{
	
	boolean changeGuiMessage(int messageNR);
	
	
	boolean timeoutCheckin();
	
	boolean displayFlightInfo(int flight);

}
