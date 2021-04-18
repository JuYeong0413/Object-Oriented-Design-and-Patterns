// 2016111540 이주영

class DogBot {

	protected int hungry,tired;

	public DogBot(int h,int t) {
		hungry = h;
		tired = t;
	}

	public boolean eat() {
		if(hungry>6) {
			hungry -= 3;
			return true;
		}
		else return false;
	}

	public void rest() {
		hungry++;
		tired -= 2;
	}

	public void play() {
		hungry += 2;
		tired += 3;
	}

	public String noise() {
		if (hungry > 8 && tired < 11) return "whine ";
		else if (tired > 7 && tired > hungry) return "snore ";
		else return "woof ";
	}

}
