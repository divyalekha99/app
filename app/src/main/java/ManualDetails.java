package com.example.sarjhu.prochecq;

public class ManualDetails {

    String Id;
    String date;
    String pay_name;
    String amount_words;
    Integer amount_num;
    Integer accno;
    Integer cheq;
    Integer micr;
    Integer brno;
    Integer two;

    public ManualDetails()
    {

    }

    public ManualDetails(String Id, String date, String pay_name, String amount_words, Integer amount_num, Integer accno, Integer cheq, Integer micr,Integer brno, Integer two)
    {
        this.Id = Id;
        this.date = date;
        this.pay_name = pay_name;
        this.amount_words = amount_words;
        this.amount_num = amount_num;
        this.accno = accno;
        this.cheq = cheq;
        this.micr = micr;
        this.brno = brno;
        this.two = two;
    }

    public String getId(){
        return Id;
    }

    public String getDate() {
        return date;
    }

    public String getPayto() {
        return pay_name;
    }

    public String getWords() {
        return amount_words;
    }

    public Integer getNums() {
        return amount_num;
    }

    public Integer getAccno() {
        return accno;
    }

    public Integer getCheq() {
        return cheq;
    }

    public Integer getMicr() {
        return micr;
    }

    public Integer getBrno() {
        return brno;
    }

    public Integer getTwo() {
        return two;
    }

}
