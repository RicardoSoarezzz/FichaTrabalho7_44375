package org.example;

/**
 * Represents a product with a title and price.
 */
public class Product {
	private String title;
	private double price;

	/**
	 * Initializes a new product with the given title and price.
	 *
	 * @param title The title of the product.
	 * @param price The price of the product.
	 */
	public Product(String title, double price) {
		this.title = title;
		this.price = price;
	}

	/**
	 * Gets the title of the product.
	 *
	 * @return The title of the product.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Gets the price of the product.
	 *
	 * @return The price of the product.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Checks if the current product is equal to another object based on their titles.
	 *
	 * @param o The object to compare with.
	 * @return True if the objects are equal (have the same title), false otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		return Double.compare(product.price, price) == 0 &&
				title.equals(product.title);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = title.hashCode();
		temp = Double.doubleToLongBits(price);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
