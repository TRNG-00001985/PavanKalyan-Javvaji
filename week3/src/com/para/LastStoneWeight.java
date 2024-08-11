package com.para;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int Stone(int [] stones) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int st:stones) {
			pq.add(st);
		}
		
		while(pq.size()>1) {
			int stone1=pq.poll();
			int stone2=pq.poll();
			
			if(stone1!=stone2) {
				pq.add(stone1-stone2);
			}
		}
		return pq.isEmpty() ? 0 : pq.poll();
		
	}

	public static void main(String[] args) {
		 LastStoneWeight sw=new LastStoneWeight();
		 int[] a= {2, 7, 4, 1, 8, 1};
		 System.out.println(sw.Stone(a));

	}

}
