package com.cookingblog.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
  private String title;
  private String description;
  private String imageUrl;
  private String[] ingredients;
  private String[] instructions;

  public Recipe() {
  }

  public static List<Recipe> getAllRecipes() {
    List<Recipe> recipes = new ArrayList<>();

    // Jamaica drink
    recipes.add(new Recipe(
            "Jamaica (Hibiscus Tea)",
            "A refreshing drink made from dried hibiscus flowers.",
            "https://www.savoryspiceshop.com/cdn/shop/products/hibiscus-tea-or-agua-de-jamaica-1027_800x533.jpg?v=1663245006",
            new String[]{
                    "1 cup dried hibiscus flowers",
                    "8 cups water",
                    "1/2 cup sugar (or to taste)",
                    "Ice cubes"
            },
            new String[]{
                    "Rinse the hibiscus flowers in cold water to get rid of any excess dust",
                    "In a medium to large size pot, bring your water to a boil",
                    "Once boiling, add the hibiscus flowers",
                    "Let boil for 10 minutes after adding the flowers, then reduce heat and simmer for another 10 minutes.",
                    "Remove from heat and let steep for another 10 minutes until cool.",
                    "Strain the water into a pitcher, discarding the flowers after fully drained.",
                    "Add sugar while still warm and stir.",
                    "Refrigerate until cool or add ice.",
                    "Enjoy your delicious and refreshing Jamaica drink!"
            }
    ));

    // Fettuccine alfredo with breaded chicken
    recipes.add(new Recipe(
            "Fettuccine Alfredo with Breaded Chicken",
            "A yummy homemade alfredo sauce over fettuccine pasta and breaded chicken.",
            "https://media.olivegarden.com/en_us/images/product/classic-chicken-alfredo-dinner-dpv-590x365.jpg",
            new String[]{
                    "8 oz fettuccine pasta",
                    "2 chicken breasts",
                    "1 cup breadcrumbs",
                    "1/2 cup grated parmesan cheese",
                    "2 cups heavy cream",
                    "1/2 cup butter",
                    "3 garlic cloves, minced",
                    "2-3 eggs, based on amount of chicken",
                    "Salt and pepper to taste"
            },
            new String[]{
                    "Boil pasta until al dente, then drain and set aside",
                    "Pound chicken breasts so they can be a little thinner, season with salt and pepper",
                    "Coat chicken in whisked eggs and then breadcrumbs mixed with 1/4 cup parmesan",
                    "Pan-fry chicken in olive oil until golden brown and cooked through (about 6-7 minutes per side)",
                    "In a saucepan, melt butter over medium heat and sauté garlic for 1 minute",
                    "Add heavy cream and remaining parmesan, whisk until smooth and slightly thick. Add chili flakes for some extra flavor",
                    "Slice chicken and serve with pasta and sauce",
                    "Serve and add extra parmesan or parsley and enjoy!"
            }
    ));

    // albondigas soup
    recipes.add(new Recipe(
            "Albondigas Soup",
            "Traditional Mexican meatball and vegetable soup in a flavorful broth.",
            "https://villacocina.com/wp-content/uploads/2023/09/Caldo-de-albondigas-WEBSITE--800x530.jpg",
            new String[]{
                    "1 lb ground beef",
                    "1/2 cup rice",
                    "1 egg",
                    "1 tsp dried oregano",
                    "1 tsp ground cumin",
                    "8 cups chicken broth",
                    "2 carrots, diced",
                    "2 potatoes, diced",
                    "1 zucchini, diced",
                    "1 onion, chopped",
                    "2 garlic cloves, minced",
                    "1 can diced tomatoes",
                    "Fresh cilantro for garnish"
            },
            new String[]{
                    "In a bowl form meatballs with mixed ground beef, rice, egg, oregano",
                    "In a large pot, sauté onion and garlic until translucent",
                    "Add broth and bring to a simmer",
                    "Slowly add meatballs into the broth",
                    "Add carrots and potatoes then let simmer for 15 minutes",
                    "Add zucchini and tomatoes let simmer for another 10 minutes",
                    "Season with salt, pepper, and beef or tomato bouillon to taste",
                    "Add lemons and chili flakes for extra flavor, and enjoy!"
            }
    ));

    return recipes;
  }

  public Recipe(String title, String description, String imageUrl, String[] ingredients, String[] instructions) {
    this.title = title;
    this.description = description;
    this.imageUrl = imageUrl;
    this.ingredients = ingredients;
    this.instructions = instructions;
  }

  // Getters
  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public String[] getIngredients() {
    return ingredients;
  }

  public String[] getInstructions() {
    return instructions;
  }
}