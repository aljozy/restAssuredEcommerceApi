package resources;


public enum APIResources {

	GetProducts ("/products"),
	PostProducts("/products");
	private String resources;
	
	 APIResources(String resources) {
		this.resources = resources;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}
	
	
	
	
	
	
}
