package guru.springframework.sfgjokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesService implements JokesService {
	
	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public ChuckNorrisJokesService() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	/*
	 * public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
	 * this.chuckNorrisQuotes = chuckNorrisQuotes; }
	 */

	@Override
	public String getRandomJokes() {
		// TODO Auto-generated method stub
		String randomQuotes = chuckNorrisQuotes.getRandomQuote();
		System.out.println("randomQuotes..."+randomQuotes);
		return randomQuotes;
	}

}
