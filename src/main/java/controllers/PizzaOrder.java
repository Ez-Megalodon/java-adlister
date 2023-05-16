package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza-order")
public class PizzaOrder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizzaOrder/pizzaOrder.jsp").forward(req, resp);

        String crust = req.getParameter("crust");
        if (crust != null){
            System.out.println("Crust type:" + crust);
        }

        String sauce = req.getParameter("sauce");
        if (sauce != null) {
            System.out.println("Sauce type:" + sauce);
        }

        String pizzaSize = req.getParameter("pizzaSize");
        if (pizzaSize != null) {
            System.out.println("Pizza Size:" + pizzaSize);
        }

        String[] toppings = req.getParameterValues("toppings");
        if (toppings.length != 0) {
            System.out.println("Pizza toppings:" + Arrays.toString(toppings));
        }

        String address = req.getParameter("address");
        if (address != null){
            System.out.println("Address: " + address);
        }

    }
}
