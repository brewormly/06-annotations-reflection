package ohm.softa.a06;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ohm.softa.a06.model.Joke;

import java.io.IOException;

public class JokeAdapter extends TypeAdapter<Joke> {

	@Override
	public void write(JsonWriter out, Joke value) throws IOException {

	}

	@Override
	public Joke read(JsonReader reader) throws IOException {
		Gson gson = new Gson();
		JokeWrapper data = gson.fromJson(reader, JokeWrapper.class);
		Joke joke = data.getValue();
		if(joke == null) throw new IOException();

		return joke;
	}
}
