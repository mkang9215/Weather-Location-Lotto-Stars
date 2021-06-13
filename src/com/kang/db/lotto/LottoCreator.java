package com.kang.db.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class LottoCreator {

	public static void create(HttpServletRequest request) {
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		while (true) {
			hs.add(r.nextInt(45) + 1);

			if (hs.size() == 6) {
				break;
			}
		}

		ArrayList<Integer> lotto = new ArrayList<Integer>(hs);

		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		lotto.sort(c);
		request.setAttribute("lotto", lotto);
	}
	
}