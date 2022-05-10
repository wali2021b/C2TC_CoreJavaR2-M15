package com.tns.abstractclass;
abstract class Movie{
 private void setTitle(String title);
}
class MyMovie extends Movie{

	@Override
	private void setTitle(String title) {

		System.out.println("Title of the movie is : "+title);
	}
	
}
class Mybook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMovie t01=new MyMovie();
		t01.setTitle("Krish");

	}

}
