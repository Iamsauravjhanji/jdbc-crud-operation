package has_a_relationship_composition;

public class Product
{
		int id;
		String name;
		double price;
		Product()
		{
			
		}
		Product(int id, String name,double price)
		{
			this.id=id;
			this.name=name;
			this.price=price;
		}
			
		public void displayProduct()
		{
			System.out.println("Id is: "+id);
			System.err.println("Name is: "+name);
			System.out.println("Price is: "+price);
		
		}
	}

