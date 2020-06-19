package crackingwithinterview;

public class Main {
	public static void main(String[] args) {
		System.out.println("jestem 1");
		System.out.println(run());
		System.out.println("jestem 2");
	}

	private static String run() {
		try {
			return "kończę";
		} catch (Exception e) {
			
		} finally {
			System.out.println("jestem w finally.");
		}
		return "gdy wystąpił błąd";
	}
}
