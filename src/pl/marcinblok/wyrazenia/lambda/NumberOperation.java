package pl.marcinblok.wyrazenia.lambda;

@FunctionalInterface
public interface NumberOperation<T extends Number>  {
	int func(T x, T y);
}
