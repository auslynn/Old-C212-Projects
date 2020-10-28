
public class Book implements Scannable, Comparable {

	private String name;
	private double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		double price = 0;
		
		if(obj instanceof Magazine)
		{
			Magazine m = (Magazine)obj;
			price = m.getPrice();
		}
		else if(obj instanceof Book)
		{
			Book b = (Book)obj;
			price = b.getPrice();
		}
		else if(obj instanceof Newspaper)
		{
			Newspaper n = (Newspaper)obj;
			price = n.getPrice();
		}
		
		if (this.price == price/*|| (this.price == ((Book)obj).getPrice()) || (this.price == ((Newspaper)obj).getPrice())*/)
		{
			return 0;
		}
		else if (this.price > price /*|| (this.price > ((Book)obj).getPrice()) || (this.price > ((Newspaper)obj).getPrice())*/)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
	@Override
	public double scanMe() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
}
