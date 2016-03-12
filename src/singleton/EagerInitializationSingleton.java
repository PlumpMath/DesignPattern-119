package singleton;

public class EagerInitializationSingleton {
	int c;
	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {
	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}
