public class HelpDesk{

    private ArrayPriorityQueue<Ticket> ganG;

    public void Help( Ticket x )
    {
	if (x.getProb() == "Money"){
	    x.setSolutionz( "Save up bro" );
	}
	if (x.getProb() == "Time"){
	    x.setSolutionz( "Just use The World if you're having trouble with time" );
	}
	if (x.getProb() == "Space"){
	    x.setSolutionz( "Just use The Hand for all your spacial issues" );
	}
}
