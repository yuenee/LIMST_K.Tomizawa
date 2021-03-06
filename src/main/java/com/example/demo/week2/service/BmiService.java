package com.example.demo.week2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BmiService {
	@Autowired
	BlackJackService b = new BlackJackService();

    /**
     * <pre>
     * 【問題文】
     *  getBmiCalcResultは、引数のheight(身長)、weight(体重)を用いて
     *  BMIを計算するメソッドです。( BMIの計算式 : 体重 ÷ (身長 × 身長) )
     *   ・BMI計算処理を記載してください。
     *   ・BMI計算結果は変数resultに格納して返却してください。
     * </pre>
     *
     * @param height 身長
     * @param weight 体重
     * @return result bmi計算結果
     */
    public double getBmiCalcResult(double height, double weight) {
    	System.out.println(b.hand());
		double resultbmi = weight / (height * height) ;
		System.out.println(resultbmi);
		return resultbmi ;
    }

}
