package exam001;

public class CompackDisc extends Product {
	private String albumTitle;
	private String singer;
	
	public CompackDisc() {}
	public CompackDisc(int id, String comment, String productor,
			int price, String albumTitle, String singer) {
		super(id, comment, productor, price);
		this.albumTitle=albumTitle;
		this.singer=singer;
	}
	public void display() {
		super.display();
		System.out.print(albumTitle+"\t");
		System.out.println(singer+"\t");
	}
}
