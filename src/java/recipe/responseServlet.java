package recipe;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TomD
 */
public class responseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Get the updated amount values for ingredient 1 and 2 and three
        Double ingredientValue1  =  Double.parseDouble(request.getParameter("ingredChoice1"));
        Double ingredientValue2  =  Double.parseDouble(request.getParameter("ingredChoice2"));
        Double ingredientValue3  =  Double.parseDouble(request.getParameter("ingredChoice3"));
              
        //Create the object
        String recipeInstructions = "Mix all ingredients together.";
     
        //Create recipe object      
        Recipe myRecipe = new Recipe(recipeInstructions);         

        //Calculate New Quantity
        Double newQuantity1 = myRecipe.ingredients.get(0).getQuantity() * ingredientValue1;
        //Second  Ingrediant Quantity
        Double newQuantity2 = myRecipe.ingredients.get(1).getQuantity() * ingredientValue2;      
        //Third  Ingrediant Quantity
        Double newQuantity3 = myRecipe.ingredients.get(2).getQuantity() * ingredientValue3;        
        
        //Set new quantity in recipe object
        myRecipe.ingredients.get(0).setQuantity(newQuantity1);
        myRecipe.ingredients.get(1).setQuantity(newQuantity2);   
        myRecipe.ingredients.get(2).setQuantity(newQuantity3);
        
        
        //First Ingredient
        String name1 =  myRecipe.ingredients.get(0).getName();
        String unit1 =  myRecipe.ingredients.get(0).getMeasure();       
        Double quantity1 =  myRecipe.ingredients.get(0).getQuantity();   
        
        //Second Ingredient
        String name2 =  myRecipe.ingredients.get(1).getName();
        String unit2 =  myRecipe.ingredients.get(1).getMeasure();       
        Double quantity2 =  myRecipe.ingredients.get(1).getQuantity();  
        
        //Third Ingredient
        String name3 =  myRecipe.ingredients.get(2).getName();
        String unit3 =  myRecipe.ingredients.get(2).getMeasure();       
        Double quantity3 =  myRecipe.ingredients.get(2).getQuantity();  
        
        //Add an attribute of the stocks collection
        request.setAttribute("name1", name1);
        request.setAttribute("unit1", unit1);    
        request.setAttribute("quantity1", quantity1);  
        
          //Add an attribute of the stocks collection
        request.setAttribute("name2", name2);
        request.setAttribute("unit2", unit2);    
        request.setAttribute("quantity2", quantity2);  
        
          //Add an attribute of the stocks collection
        request.setAttribute("name3", name3);
        request.setAttribute("unit3", unit3);    
        request.setAttribute("quantity3", quantity3);  
        
               
        request.setAttribute("myRecipe", myRecipe);
  
        
         
        //Get Server context view
        String url = "/displayResult.jsp";
        
   
        getServletContext().getRequestDispatcher(url).forward(request,response);
        
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
