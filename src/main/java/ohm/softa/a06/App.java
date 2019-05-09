package ohm.softa.a06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App {

	public static void main(String[] args) throws IOException {
		// TODO fetch a random joke and print it to STDOUT
		final Gson responseGson = new GsonBuilder()
			.registerTypeAdapter(Joke.class, new JokeAdapter())
			.create();
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("http://api.icndb.com/")
			.addConverterFactory(GsonConverterFactory.create(responseGson))
			.build();
		ICNDBApi service = retrofit.create(ICNDBApi.class);
		//Call<Joke> call = service.getRandomJoke();
		Call<Joke> call = service.getRandomJoke(new String[]{"nerdy"});
		Response<Joke> jokeResponse = call.execute();

		Joke lol = jokeResponse.body();
		System.out.println(lol);



	}

}
