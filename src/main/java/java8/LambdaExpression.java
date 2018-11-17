package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Hello world!"));
        thread.run();
	}
}
