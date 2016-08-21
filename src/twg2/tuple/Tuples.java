package twg2.tuple;

import java.util.Map;

/** Tuples utility methods.
 * @author TeamworkGuy2
 * @since 2014-8-6
 */
@javax.annotation.Generated("StringTemplate")
public final class Tuples {

	private Tuples() { throw new AssertionError("cannot instantiate static class Tuples"); }


	/** Convert a set of values to a tuple
	 * @return the newly created tuple
	 */
	public static final <A0, A1> Tuple2<A0, A1> of(A0 arg0, A1 arg1) {
		return new Tuple2<>(arg0, arg1);
	}


	/** Copy an existing tuple
	 * @return the new tuple containing the same values as the original tuple
	 */
	public static final <A0, A1> Tuple2<A0, A1> copy(Tuple2<A0, A1> src) {
		return new Tuple2<>(src.value0, src.value1);
	}


	/** Convert a set of values to a tuple
	 * @return the newly created tuple
	 */
	public static final <A0, A1, A2> Tuple3<A0, A1, A2> of(A0 arg0, A1 arg1, A2 arg2) {
		return new Tuple3<>(arg0, arg1, arg2);
	}


	/** Copy an existing tuple
	 * @return the new tuple containing the same values as the original tuple
	 */
	public static final <A0, A1, A2> Tuple3<A0, A1, A2> copy(Tuple3<A0, A1, A2> src) {
		return new Tuple3<>(src.value0, src.value1, src.value2);
	}


	/** Convert a set of values to a tuple
	 * @return the newly created tuple
	 */
	public static final <A0, A1, A2, A3> Tuple4<A0, A1, A2, A3> of(A0 arg0, A1 arg1, A2 arg2, A3 arg3) {
		return new Tuple4<>(arg0, arg1, arg2, arg3);
	}


	/** Copy an existing tuple
	 * @return the new tuple containing the same values as the original tuple
	 */
	public static final <A0, A1, A2, A3> Tuple4<A0, A1, A2, A3> copy(Tuple4<A0, A1, A2, A3> src) {
		return new Tuple4<>(src.value0, src.value1, src.value2, src.value3);
	}


	/** Copy an existing Map.Entry
	 * @return the new Map.Entry containing the same values as the original tuple
	 */
	public static final <A1, A2> Map.Entry<A1, A2> copy(Map.Entry<A1, A2> src) {
		return new Tuple2<>(src.getKey(), src.getValue());
	}

}