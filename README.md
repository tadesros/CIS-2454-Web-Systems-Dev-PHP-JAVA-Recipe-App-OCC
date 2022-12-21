# JavaTemplate

Please submit the URL to your repository AND a self assessment using the rubric

Create a Java web application that has a controller servlet and JSP views that allows a user to display a recipe and display different versions based on reducing the # of servings or increasing the number of servings

Have a hard coded recipe in the servlet (it would be fun to pull them from a database, but we're not there yet), but include a form with a drop down that allow them to 1/4, 1/2, 1, 2, 3, 4 multiply the recipe.

The form should submit to the servlet, and the servlet can modify each ingredient's quantity in the recipe before adding to the request and forwarding the jsp view.

Include a Recipe class that has attributes for the ArrayList<Ingredient> and a String for directions.

The Ingredient class should have attributes for Name, Measure, Quantity ( as a double ).

Like, name: Flour, measure: Cup, quantity: 1.5

  Criteria                                  Complete    Missing   Criterions Score
  Recipe and Ingredient Classes
  are Java Beans with all attributes           yes                    5/5

  Servlet controller that has a hard
  coded recipe and handles a form with         yes                     5/5
  a multiplier

  recipe view JSP, display all                yes                      5/5
  ingredients and the directions

  Total:                                                              15/15
