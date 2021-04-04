package command;

public class UpExercise implements Exercise {
	private Up up;
	
	public UpExercise(Up up) {
		this.up = up;
	}

	@Override
	public void execute() {
		up.Up();
		
	}
}
