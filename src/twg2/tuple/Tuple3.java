package twg2.tuple;

/** Tuple (N-way {@link java.util.Map.Entry} like) data structure.
 * @author TeamworkGuy2
 * @since 2014-8-6
 */
@javax.annotation.Generated("StringTemplate")
public class Tuple3<A0, A1, A2> {
	// package-private
	final A0 value0;
	final A1 value1;
	final A2 value2;


	public Tuple3(A0 arg0, A1 arg1, A2 arg2) {
		this.value0 = arg0;
		this.value1 = arg1;
		this.value2 = arg2;
	}


	public A0 getValue0() {
		return this.value0;
	}


	public A1 getValue1() {
		return this.value1;
	}


	public A2 getValue2() {
		return this.value2;
	}


	public Object getValue(int index) {
		switch(index) {
			case 0: return this.value0;
			case 1: return this.value1;
			case 2: return this.value2;
			default: throw new IndexOutOfBoundsException(index + " of 3 value tuple");
		}
	}


	public int size() {
		return 3;
	}



	@Override
	public String toString() {
		return "[" + this.value0 + ", " + this.value1 + ", " + this.value2 + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value0 == null) ? 0 : value0.hashCode());
		result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
		result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (!(obj instanceof Tuple3)) {
			return false;
		}

		@SuppressWarnings("unchecked")
		Tuple3<A0, A1, A2> other = (Tuple3<A0, A1, A2>)obj;
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

		if (value2 == null) {
			if (other.value2 != null) { return false; }
		}
		else if (!value2.equals(other.value2)) {
			return false;
		}

		return true;
	}


	/** Convert a set of values to a tuple
	 * @return the newly created tuple
	 */
	public static final <A0, A1, A2> Tuple3<A0, A1, A2> of(A0 arg0, A1 arg1, A2 arg2) {
		return new Tuple3<>(arg0, arg1, arg2);
	}

}
