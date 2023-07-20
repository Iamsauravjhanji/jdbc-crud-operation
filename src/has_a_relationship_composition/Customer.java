package has_a_relationship_composition;

public class Customer {
		int id;
		String name;
		String Email;
		Product p=new Product(120, "Prince",123.5);
		
		Customer()
		{
			
		}
		Customer(int id, String name, String Email)
		{
			this.id=id;
			this.name=name;
			this.Email=Email;
		}

		Customer(int id, String name, String Email, Product p)
		{
			this.id=id;
			this.name=name;
			this.Email=Email;
			this.p=p;
		}
		public void displayCustomer()
		{
			System.out.println("Customer id is: "+id);
			System.out.println("Customer name  is: "+name);
			System.out.println("Customer Email  is: "+Email);
			p.displayProduct();
		}
		

	}
