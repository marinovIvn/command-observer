package observer;

import command.Position;

public interface Observable {
	   void notifyObservers();
	    Position getUpdate();
}
