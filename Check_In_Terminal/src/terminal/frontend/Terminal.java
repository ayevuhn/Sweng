package terminal.frontend;

import terminal.*;

public class Terminal implements ITerminal_Communication
{
//ButtonAction
//	Backend.abbortCheckIn(meineNummer);
	
	public boolean displayFlightInfo(int flight)
	{
		System.out.println(flight);
		return true;
	}

	@Override
	public boolean changeGuiMessage(int messageNR) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean abortCheckin(int message) {
		// TODO Auto-generated method stub
		return false;
	}
}
