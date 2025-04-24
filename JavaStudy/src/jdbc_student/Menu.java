package jdbc_student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private static Menu instance = new Menu();
	
	private Menu() {}
	
	public static Menu getInstance() {
		return instance;
	}
	
	public Menu step(Runnable runnable) {
		this.runners.add(runnable);
		return this;
	}
	
	private static List<Runnable> runners = new ArrayList<>();
	
	public void nice(String title, Runnable... runnables) {
		if (runnables.length > 0)
			runners = Arrays.asList(runnables);
		
		var scanner = new Scanner(System.in);
		int menu = 0;
		
		while (true) {
			System.out.print(title);
			try { menu = scanner.nextInt(); }
			catch (Exception e) {
				scanner.next();
				System.out.println("숫자만 입력 바랍니다.");
				continue;
			}
			
			if (menu == 0) {
				System.out.println("쇼생크 탈출.");
				return;
			}
			
			if (runners.size() < menu) continue;
			runners.get(menu - 1).run();
		}
	}
	
	public static <T>void menu(String title, Runnable... runnable) {
		var scanner = new Scanner(System.in);
		
		int menu = 0;
		while (true) {
			System.out.print(title);
			menu = scanner.nextInt();
			
			if (menu == 0) return;
			if (runnable.length < menu) continue;
			runnable[menu -1].run();
		}
	}
}
