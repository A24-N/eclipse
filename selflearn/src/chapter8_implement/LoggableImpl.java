package chapter8_implement;

public class LoggableImpl implements Loggable {
	@Override
	public void log(String msg) {
		Loggable.super.log(msg);
		System.out.println("LogImpl: " + msg);
	}

}
