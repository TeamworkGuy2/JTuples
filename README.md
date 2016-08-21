JTuples
==============
version: 0.1.0

Helpers for working with Tuples (i.e. Map.Entry), including 2, 3, and 4 parameter tuple implementations.
The purpose is to provide type inference to shorten the amount of code needed to create an entry (i.e. Tuples.of() instead of new AbstractMap.SimpleImmutableEntry()) and provide methods for mapping, copying, and comparing entries.
```Java
val t = Tuples.of("one", 2, true);
t.getValue0(); // "one"
t.getValue(2); // true
t.toString(); // ["one", 2, true]
```

Also includes various utility methods in Entries and Tuples:
```Java
Entries.toMutable(entry); // returns a Map.Entry with a setValue() method that does not throw an exception
Entries.binarySearch(entries, key); // searches the array of entries and returns an index (see Collections.binarySearch())
Tuples.copy(entry); // returns an immutable shallow copy of the entry
```
