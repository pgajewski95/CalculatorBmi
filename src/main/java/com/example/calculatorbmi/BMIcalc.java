package com.example.calculatorbmi;

public class BMIcalc {

    private double weight;
    private double height;

    public BMIcalc(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public BMIcalc() {
    }

    public String getBmiKgCm(int weight, int height, String unitweight,String unitheight) {
        if (height == 0 || weight == 0) {
            return "Wrong input";
        }

        double factor1 = unitheight.equals("cm") ? 1 : 2.54 ;
        double factor2 = unitweight.equals("kg") ? 1 : 2.20462262 ;

        Double bmi = (weight/factor2) / (height * height * 0.0001 *factor1*factor1);
        if (bmi<16){
            return String.format("%.1f", bmi)+"     " + "wygłodzenie";}
        else if (bmi>=16 && bmi<17){
            return String.format("%.1f", bmi)+"     " + "wychudzenie";}
        else if (bmi>=17 && bmi <18.5){
            return String.format("%.1f", bmi)+"     " + "niedowaga";}
        else if(bmi>=18.5 && bmi <25){
            return String.format("%.1f", bmi)+"     " + "waga prawidłowa";}
        else if (bmi>=25 && bmi<30){
            return String.format("%.1f", bmi)+"     " + "nadwaga";}
        else if (bmi>=30 && bmi<35){
            return String.format("%.1f", bmi)+"     " + "I Stopien otyłosci";}
        else if (bmi>=35 && bmi<40){
            return String.format("%.1f", bmi)+"     " + "II Stopien otyłosci";}
       else {
            return String.format("%.1f", bmi) + "     " + "otyłosc skrajna";
        }

    }


}