package pattern.behavioral.state.state;

import pattern.behavioral.state.context.Light;

public interface State {
	public void on_button_pushed(Light light);
	public void off_button_pushed(Light light);
}
