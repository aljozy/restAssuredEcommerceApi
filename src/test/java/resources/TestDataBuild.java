package resources;

import pojo.Products;

public class TestDataBuild {
	
	public Products myProduct(String title,double price,String category) {
		Products product = new Products();
		product.setTitle(title);
		product.setPrice(price);
		product.setDescription("A Christmas gift");
		product.setCategory(category);
		product.setImage("https://i.pinimg.com/1200x/d1/25/10/d12510b77867b4f0ccff92fee47ee770.jpg");
		
		return product;
	}
	
	public Products updatedProduct() {
		Products product = new Products();
		product.setTitle("Update Test");
		product.setPrice(200);
		product.setDescription("An Eid gift");
		product.setCategory("Electronics");
		product.setImage("https://i.pinimg.com/1200x/d1/25/10/d12510b77867b4f0ccff92fee47ee770.jpg");
		
		return product;
	}
	

}
