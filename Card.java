/*
Name:          Aishwarya Panchumarty
File:          Card.java
Date:          12/12/17
Description:   This class contains information about each
               card. 
*/

public class Card{
    private int index; // this variable is used so the user can identify the card without looking at the actual value
    private String number;
    private String group;
    private String status;
    private String printVal;
    private String color;

    public Card(int index, String number, String group, String status, String printVal, String color){
	this.index = index;
	this.number = number;
	this.group = group;
	this.status = status;
	this.printVal = printVal;
	this.color = color;
    }
   
    public String getPrintVal(){
	return printVal;
    }

    public void setStatus(String status){
	this.status = status;
    }

    public String getStatus(){
	return status;
    }

    public String getNumber(){
	return number;
    }

    public String getColor(){
	return color;
    }

}