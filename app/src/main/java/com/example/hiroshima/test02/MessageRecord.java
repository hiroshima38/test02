//1つのセルにあるデータを保存するためのデータクラスです。
package com.example.hiroshima.test02;

public class MessageRecord {
    //保存するデータ全てを変数で定義します。
    private int rank;
    private String imageUrl;
    private String comment;

    //データを１つ作成する関数です。項目が増えたら増やしましょう。
    public MessageRecord(int rank, String imageUrl, String comment) {
        this.rank = rank;
        this.imageUrl = imageUrl;
        this.comment = comment;
    }
    //それぞれの項目を返す関数です。項目が増えたら増やしましょう。
    public int getRank(){
        return rank;
    }
    public String getComment() {
        return comment;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
