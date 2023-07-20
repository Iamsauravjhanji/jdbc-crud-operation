package has_a_relationship_composition;

public class Driver {
		public static void main(String[] args) {
			Customer c=new Customer(101,"Mayank", "Saurav@");
			
			c.displayCustomer();
			Customer c1=new Customer(102,"Saurav", "Saurav@", new Product(130, "Saish",12345.5));
			c1.displayCustomer();
			
			
		}

	}

