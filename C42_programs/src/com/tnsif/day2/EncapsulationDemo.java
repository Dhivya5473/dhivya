package com.tnsif.day2;

public class EncapsulationDemo {
	private static String playerName;
	private static int orderNo;
	private static int jersyNo;

	//Team RCB
	
	
	//constructor
	
	//non-parameterized constructor
   public EncapsulationDemo() {
	
	}
	
	
	//Parameterized constructor
	public EncapsulationDemo(String playerName,int orderNo, int jersyNo) {
		
		
		this.playerName=playerName;
		this.orderNo=orderNo;
		this.jersyNo=jersyNo;

		
	}
	
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	
	

	@Override
	public String toString() {
		return "EncapsulationDemo [PlayerName=" + playerName + ", orderNo=" + orderNo + ", jersyNo=" + jersyNo + "]";
	}

	public static void main(String[] args) {
		
				
		EncapsulationDemo obj = new EncapsulationDemo(playerName, jersyNo, orderNo);
	
		obj.setPlayerName("Virat kohli");
		obj.setJersyNo(18);
		obj.setOrderNo(1);
		System.out.println(obj);
	
	}


}
