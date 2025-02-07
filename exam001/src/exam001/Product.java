package exam001;

public class Product {
	private int id;
	private String comment;
	private String productor;
	private int price;
	
	public Product() {}
	public Product(int id, String comment, String productor, int price) {
		this.id=id;
		this.comment=comment;
		this.productor=productor;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void display() {
		System.out.print(id+"\t");
		System.out.print(comment+"\t");
		System.out.print(productor+"\t");
		System.out.print(price+"\t");
	}
}
