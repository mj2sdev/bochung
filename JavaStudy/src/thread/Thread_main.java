package thread;

public class Thread_main {

	public static int target = 0;

	public static synchronized int touch() {
		return ++target;
	}
	public static void main(String[] args) throws Exception {

		new Thread(() -> {
			int count = 5;
			while (count-- > 0) {
				System.out.println(Thread_main.touch());
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		}).start();
		new Thread(() -> {
			int count = 5;
			while (count-- > 0) {
				System.out.println(Thread_main.touch());
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		}).start();
	}
}