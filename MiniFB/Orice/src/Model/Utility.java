package Model;

public class Utility {
	public static void close(AutoCloseable closeable) {
		if(closeable != null) {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
