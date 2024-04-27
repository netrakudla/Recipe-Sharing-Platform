// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Recipe object
        Recipe recipe = new Recipe();

        // Set properties
        recipe.setTitle("Chocolate Cake");
        recipe.setIngredients("Flour, sugar, cocoa powder, eggs, milk, butter");
        recipe.setInstructions("1. Preheat oven to 350°F. \n2. Mix dry ingredients. \n3. Add wet ingredients. \n4. Bake for 30 minutes.");

        // Display Recipe details
        System.out.println("Title: " + recipe.getTitle());
        System.out.println("Ingredients: " + recipe.getIngredients());
        System.out.println("Instructions: \n" + recipe.getInstructions());
    }
}
