package ohm.softa.a06;

import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi {
	@GET("jokes/random")
	Call<Joke> getRandomJoke();
	@GET("jokes/random")
	Call<Joke> getRandomJoke(@Query("limitTo") String[] categoriesToInclude);
	@GET("jokes/random/{n}")
	Call<List<Joke>> getRandomJokes(int count);
	@GET("jokes/{id}")
	Call<Joke> getJokeById(int id);
}
