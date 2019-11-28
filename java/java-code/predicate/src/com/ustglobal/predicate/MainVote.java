package com.ustglobal.predicate;

import java.util.function.Predicate;

public class MainVote {
 public static void main(String[] args) {
	
	 Predicate<Vote> p = v->{
		 if(v.Age >= 18) {
			 return true;
			 
		 }else {
			 return false;
		 }
	 };
	 
	 Vote v = new Vote ("Amrit",22);
	 boolean res = p.test(v);
	 System.out.println("Result "+res);
	 
}
}
