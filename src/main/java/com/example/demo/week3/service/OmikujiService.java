package com.example.demo.week3.service;

import org.springframework.stereotype.Service;

@Service

public class OmikujiService {
    /**
     * <pre>
     * 【問題文】
     * getResultはおみくじを引いた結果を取得するメソッドです。
     * ・ランダムなおみくじの結果を取得する処理を記載してください。
     * ・おみくじの結果は変数resultに格納して返却してください 例.大吉
     * </pre>
     *
     * @return result おみくじの結果
     */
    public String getResult() {
    int luck = (int)(Math.random()*7);
    String result ="";
    switch(luck){
    case 0:
    	result = "大吉" ;
    	break ;
    case 1:
    	result= "中吉";
    	break ;
    case 2:
    	result ="小吉";
    	break ;
    case 3:
    	result ="吉";
    	break ;
    case 4:
    	result ="末吉";
    	break ;
    case 5:
    	result ="凶";
    	break ;
    case ６:
    	result ="大凶";
    	break ;
    }
    	return result;   	
    }

    /**
     * <pre>
     * 【問題文】
     * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
     * ・result(おみくじの結果)に紐づいた、コメントを取得する処理を記載してください。
     * ・コメントはresultCommentに格納して返却してください 例.大吉です、今日はとても良い日でしょう
     * ・条件分岐は引数で渡している'result'を用いてください
     * ※なお、引数のresultはgetResultメソッドで取得した結果が格納されています。
     * </pre>
     *
     * @param result おみくじの結果
     * @return resultComment おみくじ結果に対してのコメント
     */
    public String getResultComment(String result) {
    String resultComment="";
    switch(result){
    case "大吉":
    	resultComment="ランチに入ったお店でサービスしてもらえるかも";
    	break ;
    case "中吉":
    	resultComment="風邪引かないかも";
    	break ;
    case "小吉":
    	resultComment="なぜか髪サラサラになるかも";
    	break ;
    case "吉":
    	resultComment="悩み事解決のヒントが見つかるかも";
    	break ;
    case "末吉":
    	resultComment="買い物で小銭をぴったり出せるかも";
    	break ;
    case "凶":
    	resultComment="コーヒー買うのに万札しかないかも";
    	break ;
    case "大凶":
    	resultComment="コインパーキングで別車の清算しちゃうかも";
    	break ;
    }
    		return resultComment ;
}
}
        //おみくじの結果に紐づいた、コメントを定数として定義

