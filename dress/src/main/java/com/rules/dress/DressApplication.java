package com.rules.dress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rules.DressFactory;
import com.rules.DressStates;

/*
 * Getting Dressed
 * @author Ying Zhou
 * @Date Oct 15 2019
 * 
 * You have to get dressed in the morning before going to work.
 * 1 = hat 2 = pants 3 = shirt 4 = shoes 5 = socks  
 *
 *	Rules:  • You must put your socks on before your shoes. 
 *			• You must put your pants on before your shoes. 
 *			• You must put your shirt on before your hat. 
 *			• A hat is optional, but all other articles of clothing are required. 
 *			• You must leave the house when receiving the number 6. 
 *			• You must leave the house after getting dressed. 
 *			• Any violation should output "fail" and stop immediately. 
 */
@SpringBootApplication
public class DressApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressApplication.class, args);
		System.out.println("hello world");

		///////////////////////////////////////////////////
		play("5 2 3 4 6");
		play("2 5 3 4 1 6");
		play("3 1 2 5 4 6");
		play("4 3 2 1 6");
		play("2 5 3 4 1");
		play("2 3 4 5 1");
		play("5 1 3 ");

	}

	private static void play(String strCommand) {
		System.out.print(strCommand + " -> ");
		int[] intList = Arrays.stream(strCommand.split(" ")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> aList = IntStream.of(intList).boxed().collect(Collectors.toCollection(ArrayList::new));
	
		DressStates.getInstance().reset();
		aList.forEach(item -> {
			DressFactory.getInstance(item).execute();
			;
		});
		DressStates.getInstance().getStatus();
	}
}
