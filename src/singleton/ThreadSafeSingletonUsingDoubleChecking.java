package singleton;

public class ThreadSafeSingletonUsingDoubleChecking {
	private static ThreadSafeSingletonUsingDoubleChecking instance;

	private ThreadSafeSingletonUsingDoubleChecking() {
	}

	public static ThreadSafeSingletonUsingDoubleChecking getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingletonUsingDoubleChecking.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonUsingDoubleChecking();
				}
			}
		}
		return instance;
	}
}