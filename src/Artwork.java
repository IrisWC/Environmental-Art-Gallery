
public class Artwork {

	private int x, y;
	private int pageNum;
	
	public Artwork(int xcord, int ycord, int page) {
		x = xcord;
		y = ycord;
		pageNum = page;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getPage() {
		return pageNum;
	}
}
