package org.example;

import java.util.*;

/**
 * Represents a shopping cart that allows adding, removing, and clearing items.
 */
public class ShoppingCart {

	/**
	 * List of items in the shopping cart.
	 */
	private List<Product> items;

	/**
	 * Initializes an empty shopping cart.
	 */
	public ShoppingCart() {
		items = new ArrayList<>();
	}

	/**
	 * Gets the total balance of the items in the shopping cart.
	 *
	 * @return The total balance of the items.
	 */
	public double getBalance() {
		double balance = 0.00;
		for (Product item : items) {
			balance += item.getPrice();
		}
		return balance;
	}

	/**
	 * Adds a product to the shopping cart.
	 *
	 * @param item The product to add to the cart.
	 */
	public void addItem(Product item) {
		items.add(item);
	}

	/**
	 * Removes a product from the shopping cart.
	 *
	 * @param item The product to remove from the cart.
	 * @return True if the item was successfully removed, false if the item was not found.
	 */
	public boolean removeItem(Product item) {
		return items.remove(item);
	}

	/**
	 * Gets the number of items in the shopping cart.
	 *
	 * @return The number of items in the cart.
	 */
	public int getItemCount() {
		return items.size();
	}

	/**
	 * Empties the shopping cart by removing all items.
	 */
	public void clear() {
		items.clear();
	}
}
