package myproject;

import java.security.DomainCombiner;

public class ScopeRules {
	

	void add() {
		int x=5,y=10;
		System.out.println("result is:"+(x+y));
	}
int sum (int x,int y,int z) {
	return(x+y+z);
}
	

public static void main(String[] args) {
	System.out.println("hello");
	ScopeRules sr=new ScopeRules();
	sr.add();
int res=sr.sum(10, 38, 49);
	
	System.out.println("the sum is:"+res);
}}
	