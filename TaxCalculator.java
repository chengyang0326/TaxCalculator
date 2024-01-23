import java.util.Scanner;

public class TaxCalculator{
	public static void main(String[] args) {
		//get income
		Scanner scnr = new Scanner(System.in);
		System.out.print("What is your 2019 income? ");
		int income= scnr.nextInt();
		double tax1=0;
		double tax2=0;
		double tax3=0;
		double tax4=0;
		double tax5=0;
		double tax6=0;
		double tax7=0;
		//range lower than 9700
		if(income<=9700){
			tax1 = income *0.1;

		}
		else{
			tax1 =970.0;
		}
		//9700-39475
		if(income >9700&&income <=39475){
			
			tax2=(income-9700)*0.12;
			
		}
		else if(income >39475){
			tax2=3573.0;
		}
		else{
			tax2=0;
		}
		//39475-84200
		if(income>39475&&income<=84200){
			tax3=(income-39475)*0.22;
			
		}
		else if(income>84200){
			tax3=9839.5;
		}
		else{
			tax3=0;
		}
		//84200-160724
		if(income>84200&&income<=160725){
			tax4=(income-84200)*0.24;
			
		}
		else if(income>160725){
			tax4=18366;
		}
		else{
			tax4=0;
		}
		//160725-204100
		if(income>160725&&income<=204100){
			tax5=(income-160725)*0.32;
		
		}
		else if(income>204100){
			tax5=13880;
		}
		//204100-510300
		if(income>204100&&income<=510300){
			tax6=(income-204100)*0.35;
		}
		
		else if(income>510300){
			tax6=107170;
		}
		else{
			tax6=0;
		}
		//over 510300
		if(income> 510300){
			tax7=(income-510300)*0.37;

				
		}
		else{
			tax7=0;
		}
		double tax = tax1+tax2+tax3+tax4+tax5+tax6+tax7;
		double rate = tax/income;
		rate = rate*100;
		if(tax1!=0){
			System.out.println("First $9700: $"+tax1);

		}
		if(tax2!=0){
			System.out.println("$9700-$39275: $"+tax2);

		}
		if(tax3!=0){
			System.out.println("$39475-$84200: $"+tax3);

		}
		if(tax4!=0){
			System.out.println("$84200-$160725: $"+tax4);

		}
		if(tax5!=0){
			System.out.println("$160725-$204100: $"+tax5);

		}
		if(tax6!=0){
			System.out.println("$204100-$510300: $"+tax6);

		}
		if(tax7!=0){
			System.out.println("Over $510300:  $"+tax7);

		}
		System.out.println("Total tax owed: $" +tax);
		System.out.println("Effective tax rate : "+ rate +"%");





	}
}
