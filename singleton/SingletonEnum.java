package singleton;

public enum SingletonEnum {
	INSTANCE;
	int value;

	public final int getValue() {
		return value;
	}

	public final void setValue(int value) {
		this.value = value;
	}
	
	protected Object readResolve() {
        return INSTANCE;
    }
}
