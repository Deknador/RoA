package application.instalation;

import java.nio.file.Paths;

public class mainInsatalation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
	}

}
