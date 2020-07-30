
package com.singleton.demo;
interface CarFactory {
	public void start();
	public void stop();
}
 
 
class SmallCar implements CarFactory{
	@Override
	public void start() {
		System.out.println("Small car code....");		
	}
 
	@Override
	public void stop() {
		System.out.println("BigCar code...");
	}
}
 
class BigCar implements CarFactory{
 
	@Override
	public void start() {
		System.out.println("Big car code...");	
	}
 
	@Override
	public void stop() {
		System.out.println("BiG Car Code");
	}
}
 
 class Factory {
	public static CarFactory createCar(String m){
		CarFactory p = null;
		if(m == "smallcar"){
			p = new SmallCar();
		}else if(m == "bigcar"){
			p = new BigCar();
		}
 
		return p;
	}
}