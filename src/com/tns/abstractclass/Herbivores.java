package com.tns.abstractclass;

 interface M{
	final void mm();
}
 abstract class Animal
{
abstract void eat();
	abstract void dd();
}
class  Carnivores extends Animal
{


@Override
void eat() {
	// TODO Auto-generated method stub
	System.out.println("I am non-vegetarian");
}

@Override
void dd() {
	// TODO Auto-generated method stub
	
}
}
class Herbivores extends Animal {
void eat()
{
System.out.println("I am vegetarian");
}
public static void main(String args[])
{
Animal goat = new Herbivores();
Animal lion =new Carnivores();
goat.eat();
lion.eat();
}
@Override
void dd() {
	// TODO Auto-generated method stub
	
}
}