package com.core07.annotation;

public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();

}
