package com.example.demo.week4.service;

import org.springframework.stereotype.Service;

@Service
public class EndlessOmikujiService {
	/**
	 * <pre>
	 * 【問題文】
	 * getResultはおみくじを引いた結果が"凶"になるまで繰り返しおみくじを引き続けるメソッドです。
	 * ・ランダムなおみくじの結果を取得する処理を記載してください。
	 * ・おみくじの結果が凶になるまで、繰り返しおみくじの結果を取得してください。
	 * ・おみくじの結果は変数resultに格納して返却してください。 例.凶
	 * なお、
	 * </pre>
	 *
	 * @return result おみくじの結果
	 */
	public String getResult() {
		int luck = 0;
		String result = null;
		while (true) {
			luck = (int) (Math.random() * 4);
			if (luck == 0) {
				result = "大吉";
			} else if (luck == 1) {
				result = "中吉";
			} else if (luck == 2) {
				result = "吉";
			} else if (luck == 3) {
				result = "凶";
				break;
			}
		}
		return result;
	}

	/**
	 * <pre>
	 * 【問題文】
	 * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
	 * ・無限おみくじの仕様に沿ったコメントを取得する記述をしてください。
	 * ・コメントはresultCommentに格納して返却してください。 例.凶です、今あなたの後ろに・・・
	 * ※なお、引数のresultはメソッドgetResultで取得した結果が格納されています。
	 * </pre>
	 *
	 * @return resultComment 無限おみくじの仕様に沿ったコメント
	 */
	public String getResultComment() {
		String resultComment = null;
		if (getResult() == "大吉") {
			resultComment = "だめ";
		} else if (getResult() == "中吉") {
			resultComment = "ダメ";
		} else if (getResult() == "吉") {
			resultComment = "だめ";
		} else if (getResult() == "凶") {
			resultComment = "今あなたの後ろに";
		}
		return resultComment;

	}
}
