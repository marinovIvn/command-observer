package observer;

import command.Position;

public class Subscrber extends Person implements Observer {
	
	private String name;

	private Observable exercise;

	public Subscrber(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		if(exercise == null) {
			System.out.println(this.getName() + " has no topic");
			return;
		}
		
		Position newTopic = exercise.getUpdate();
		System.out.println(this.getName() + ": recieved new topic: " + newTopic);
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setExercise(Observable exercise) {
		// TODO Auto-generated method stub
		 this.exercise = exercise;
		
	}

}
