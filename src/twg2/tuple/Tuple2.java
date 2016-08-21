package twg2.tuple;

/** Tuple (N-way {@link java.util.Map.Entry} like) data structure.
 * @author TeamworkGuy2
 * @since 2014-8-6
 */
@javax.annotation.Generated("StringTemplate")
public class Tuple2<A0, A1> implements java.util.Map.Entry<A0, A1> {
	// package-private
	final A0 value0;
	final A1 value1;


	public Tuple2(A0 arg0, A1 arg1) {
		this.value0 = arg0;
		this.value1 = arg1;
	}


	public A0 getValue0() {
		return this.value0;
	}


	public A1 getValue1() {
		return this.value1;
	}


	public Object getValue(int index) {
		switch(index) {
			case 0: return this.value0;
			case 1: return this.value1;
			default: throw new IndexOutOfBoundsException(index + " of 2 value tuple");
		}
	}


	public int size() {
		return 2;
	}


	@Override
	public A0 getKey() {
		return this.value0;
	}


	@Override
	public A1 getValue() {
		return this.value1;
	}


	@Override
	public A1 setValue(A1 value) {
		throw new IllegalStateException("cannot modify immutable tuple");
	}


	@Override
	public String toString() {
		return this.value0 + "=" + this.value1;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value0 == null) ? 0 : value0.hashCode());
		result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (!(obj instanceof Tuple2)) {
			return false;
		}

		@SuppressWarnings("unchecked")
		Tuple2<A0, A1> other = (Tuple2<A0, A1>)obj;
		if (value0 == null) {
			if (other.value0 != null) { return false; }
		}
		else if (!value0.equals(other.value0)) {
			return false;
		}

		if (value1 == null) {
			if (other.value1 != null) { return false; }
		}
		else if (!value1.equals(other.value1)) {
			return false;
		}

		return true;
	}


	/** Convert a set of values to a tuple
	 * @return the newly created tuple
	 */
	public static final <A0, A1> Tuple2<A0, A1> of(A0 arg0, A1 arg1) {
		return new Tuple2<>(arg0, arg1);
	}

}
