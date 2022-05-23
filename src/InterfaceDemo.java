
public class InterfaceDemo {

	public static void main(String[] args) {
		/*ICalculator calc = new ICalculator() {
			
			@Override
			public void Subtraction() {
				System.out.println(5-8);
			}
			
			@Override
			public void Addition() {
				System.out.println(5+8);
			}
		};
		calc.Addition();
		calc.Subtraction();*/
		/*ICalculator calc=() -> System.out.println("hello lambda");
		calc.display();*/
		ICalculator calc=(a, b) -> {
			return a+b;
		};
		int c=calc.addition(5, 9);
		System.out.println(c);

	}

}
