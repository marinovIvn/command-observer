package command;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;
import observer.Person;

public class TraningGuy extends Person implements Observable {
	
	public TraningGuy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<>();
	}
	
	private final List<Observer> observers;
	
	 private Position position;

	  public void Up() {
	        System.out.println("Горе!");
	        this.position = position.Up;
	        this.notifyObservers();
	    }

	    public void Down() {
	        System.out.println("Долу!");
	        this.position = position.Down;
	        this.notifyObservers();
	    }
	    
	    public Position getExercise() {
	        return this.position;
	    }

		@Override
		public void notifyObservers() {
			// TODO Auto-generated method stub
			for(Observer observer: this.observers) {
				observer.update();
			}
			
		}

		@Override
		public Position getUpdate() {
			// TODO Auto-generated method stub
			return this.getUpdate();
		}

		public void subscribe(Observer obs1, Observer obs2, Observer obs3) {
			// TODO Auto-generated method stub
			
		}

	
}