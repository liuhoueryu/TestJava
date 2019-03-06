package com.neuedu.java10;

import java.util.Comparator;

public class WordItemComparator implements Comparator<WordItem> {

	@Override
	public int compare(WordItem w1, WordItem w2) {
		return w1.getCount() > w2.getCount() ? 1 : w1.getCount() < w2.getCount() ?  -1 : w1.getContent().compareTo(w2.getContent());
	}

}
