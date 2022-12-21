<%-- 
    Document   : stocks
    Created on : Oct 30, 2022, 5:20:49 PM
    Author     : TomD
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="recipe.recipeServlet" %>
<!DOCTYPE html>
<html>
    <head> 
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipe</title>    
    </head> 
    
    <body>     
        <h2>Recipe</h2>
            
        
 <form action="responseServlet" method="post">        
        
      <table>
  <thead>
    <tr>
      <th>Ingredient Name</th>
      <th>Units</th>
      <th>Quantity</th>
      <th>Select Amount</th>
    </tr>
   </thead>
   <tbody>
     <tr>
       <td>${name1}</td>
       <td>${unit1}</td>
        <td>${quantity1}</td>
       <td>
           
          
           <select name="ingredChoice1">
             <option value="0.25">1/4</option>
             <option value="0.5">1/2</option>
              <option value="1">1</option>
              <option value="2">2</option>
               <option value="3">3</option>
                <option value="4">4</option>
            </select>
       </td>
     </tr>
     
    <tr>
        <td>${name2}</td>
       <td>${unit2}</td>
        <td>${quantity2}</td>
       <td>
          <select name="ingredChoice2">
             <option value="0.25">1/4</option>
             <option value="0.5">1/2</option>
              <option value="1">1</option>
              <option value="2">2</option>
               <option value="3">3</option>
                <option value="4">4</option>
            </select>
       </td>
     </tr>
     
     <tr>
        <td>${name3}</td>
       <td>${unit3}</td>
        <td>${quantity3}</td>
   <a href="displayRecipe.jsp"></a>
       <td>
          <select name="ingredChoice3">
             <option value="0.25">1/4</option>
             <option value="0.5">1/2</option>
              <option value="1">1</option>
              <option value="2">2</option>
               <option value="3">3</option>
                <option value="4">4</option>
            </select>
       </td>
     </tr>
         
  </tbody>
</table>

   
       
       <input type ="submit" value="Update">
       
 </form>      
       
    
       <br>
        <div>Recipe Instructions: ${myRecipe.directions}</div>
    
    </body>
</html>

