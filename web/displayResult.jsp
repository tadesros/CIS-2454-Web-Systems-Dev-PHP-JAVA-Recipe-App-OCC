<%-- 
    Document   : stocks
    Created on : Oct 30, 2022, 5:20:49 PM
    Author     : TomD
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="recipe.recipeServlet" %>
<%@ page import="recipe.responseServlet" %>
<!DOCTYPE html>
<html>
    <head> 
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipe</title>    
    </head> 
    
    <body>     
        <h2>Recipe</h2>
        
      <table>
  <thead>
    <tr>
      <th>Ingredient Name</th>
      <th>Units</th>
      <th>Quantity</th>
    </tr>
   </thead>
   <tbody>
     <tr>
       <td>${name1}</td>
       <td>${unit1}</td>
       <td>${quantity1}</td>
    
     </tr>
     
    <tr>
        <td>${name2}</td>
       <td>${unit2}</td>
        <td>${quantity2}</td>      
     </tr>
     
     <tr>
        <td>${name3}</td>
       <td>${unit3}</td>
        <td>${quantity3}</td>
      </tr>
         
  </tbody>
</table>
  
       <br>
        <div>Recipe Instructions: ${myRecipe.directions}</div>
    
    </body>
</html>

