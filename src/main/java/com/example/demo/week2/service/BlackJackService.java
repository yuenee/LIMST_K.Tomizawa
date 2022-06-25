package com.example.demo.week2.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlackJackService {
	public int[] hand() {
		int[] hand = new int[];
		Random ransu = new Random();
		List<Integer> beck = new ArrayList<>();
		for (int i2 = 1; i2 < 5; i2++) {
			for (int i = 1; i < 14; i++) {
				beck.add(i);
			}
		}
		System.out.println(beck);
		for (int i = 0; i < 3; i++) {
			hand[i] = beck.get(ransu.nextInt(beck.size()));
		}
		System.out.println("aaaa ->" + hand);
		return hand;
	}

	public int[] myhands() {
		int [] hand = this.hand();
		return hand ;
	}
	public int mytotal() {
		int mytotal = 0;
		int[] myhand = this.hand();
		for (int i = 0; i < myhand.length; i++) {
			mytotal += myhand[i];
		}
		return mytotal;
	}

	public int npc() {
		int npctotal = 0;
		int[] npchand = this.hand();
		for (int i = 0; i < npchand.length; i++) {
			npctotal += npchand[i];
		}
		return npctotal;
	}

	public int myresult() {
		int result = 0;
		if (this.mytotal() <= 21) {
			result = 21 - this.mytotal();
		} else {
			result = 50;

		}
		return result;
	}

	public int npcresult() {
		int result = 0;
		if (this.npc() <= 21) {
			result = 21 - this.npc();
		} else {
			result = 50;

		}
		return result;
	}

	public String judge() {
		String judge = null;

		if (this.myresult() < this.npcresult()) {
			judge = "勝ち";
		} else if (this.myresult() > this.npcresult()) {
			judge = "負け";
		} else if (this.myresult() == this.npcresult()) {
			judge = "引き分け";
		}
		return judge;
	}
}
