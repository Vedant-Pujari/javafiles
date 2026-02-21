import java.io.*;
import java.util.*;
import java.lang.*;

class Book{
	String author,publisher,title;
	Book(String a,String p,String t){
		author = a;
		publisher = p;
		title = t;
	}
}
class Book_Info extends Book{
	int price;
	int stock;
	Book_Info(String a,String p,String t,int pr,int s){
		super(a,p,t);
		price = pr;
		stock = s;
	}
	void show(){
		System.out.println("Book author is "+author);
		System.out.println("Book title is "+title);
		System.out.println("Book publisher is "+publisher);
		System.out.println("Book price is "+price);
		System.out.println("Book stock is "+stock);
	}
}
class Aq{
	public static void main(String args[]){
		Book_Info b1 = new Book_Info("Rakhadi","Rakhu publishers","The house next door",10000,2);
		b1.show();
	}
}