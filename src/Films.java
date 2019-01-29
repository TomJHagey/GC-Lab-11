//I think this part is set up correctly, but I'm not sure how to use it...

public class Films {

	private String title;

	private String category;

	public Films() {

		title = "";
		category = "";

	}

	public Films(String name) {

		setName(name);
		setCategory(category);

	}

	// getter
	public String getName() {
		return title;
	}

	// setter
	public void setName(String name) {
		this.title = name;
	}

	// getter
	public String getCategory() {
		return category;
	}

	// setter
	public void setCategory(String category) {
		this.category = category;
	}

}
