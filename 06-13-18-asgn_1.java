/*
	Sports
		name - String
		player - int
		outdoor - boolean
*/

class Sports{
	private String name;
	private int player;
	private boolean outdoor;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPlayer(int player){
		this.player=player;
	}
	public int getPlayer(){
		return player;
	}
	public void setOutdoor(boolean outdoor){
		this.outdoor=outdoor;
	}
	public boolean isOutdoor(){
		return outdoor;
	}
}

// bypass all set methods to a constructor

class Sports{
	private String name;
	private int player;
	private boolean outdoor;
	Sport(){}
	Sport(String name, int player, boolean outdoor){
		this.name=name;
		this.player=player;
		this.outdoor=outdoor;
	}
	public String getName(){
		return name;
	}
	public int getPlayer(){
		return player;
	}
	public boolean isOutdoor(){
		return outdoor;
	}
}