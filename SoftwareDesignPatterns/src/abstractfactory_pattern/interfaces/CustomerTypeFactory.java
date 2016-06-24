package abstractfactory_pattern.interfaces;

public interface CustomerTypeFactory {
	public abstract Bag createBag();
	public abstract Box createBox();
	public abstract Wrap createWrap();
}