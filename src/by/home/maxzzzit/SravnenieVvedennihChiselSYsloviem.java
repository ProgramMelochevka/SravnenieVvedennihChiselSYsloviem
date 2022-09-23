package by.home.maxzzzit;

import java.util.Scanner;

public class SravnenieVvedennihChiselSYsloviem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double dig1,dig2,num;
		System.out.println("Введите первое число: ");
		dig1=scn.nextDouble();
		System.out.println("Введите второе число: ");
		dig2=scn.nextDouble();
			if (dig1>dig2){
				num=dig1*10+dig2;
				System.out.println("Число 1>2 получаем результат = "+num);
				}
			else if (dig1<dig2){
				num=dig2*10+dig1;
				System.out.println("Число 2>1 получаем результат = "+num);
				}
			else if (dig1==dig2)
				System.out.println("Число 1 = 2");
		}
	}

