package org.arj.thornbird.demo.app.jpa;

public abstract class AbstractEntity {
	private final int hashCode = getClass().getName().hashCode();

	@Override
	public final int hashCode() {
		return hashCode;
	}

	@Override
	abstract public boolean equals(Object obj);
}
