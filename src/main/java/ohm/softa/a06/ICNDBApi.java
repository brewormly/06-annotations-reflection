package ohm.softa.a06;

import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi {
	@GET("jokes/random")
	Call<Joke> getRandomJoke();

	Call<Joke> getRandomJoke(String[] categoriesToInclude);

	Call<List<Joke>> getRandomJokes(int count);

	Call<Joke> getJokeById(int id);
}
