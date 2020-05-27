package pl.marcinblok.wyrazenia.lambda;

public interface DataGenerator<T> {
	T[] generate(T length) throws LengthException;
}
