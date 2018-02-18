package com.mg0401.datastructure.stack;

public class StackMain 
{
    public static void main( String[] args )
    {
    	StackImpl stackImplObj = new StackImpl(5);
    	stackImplObj.push(3);
    	stackImplObj.push(4);
    	stackImplObj.push(5);
    	stackImplObj.push(6);
    	stackImplObj.push(7);
    	stackImplObj.push(8);
    	
    	for(int i = 0; i < stackImplObj.getStackSize(); i++) {
    		System.out.println(i +" element is " +stackImplObj.getStackArrayElemet(i));
    	}
    		
    	System.out.println("Pop: " +stackImplObj.pop());
    	System.out.println("Peak: " +stackImplObj.peak());
        
    }
}
