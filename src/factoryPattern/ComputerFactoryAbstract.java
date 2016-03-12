package factoryPattern;

public class ComputerFactoryAbstract {
	public static Computer getComputer(IComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}