package chapter8_implement;

public interface Loggable {
	default void log(String msg) {
		System.out.println("Log: " + msg);
	}
}
