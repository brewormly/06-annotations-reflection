package ohm.softa.a06;

import com.google.gson.annotations.SerializedName;
import ohm.softa.a06.model.Joke;

public class JokeWrapper {
	@SerializedName("type")
	private String type;
	@SerializedName("value")
	private Joke value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Joke getValue() {
		return value;
	}

	public void setValue(Joke value) {
		this.value = value;
	}
}
