<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

    <h1>Build your pizza.</h1>
    <form action="${pageContext.request.contextPath}/pizza-order">
        <label for="crust">Pizza Crust</label>
        <select name="crust" id="crust">
            <option value="flatCrust">Flat Crust</option>
            <option value="stuffedCrust">Stuffed Crust</option>
            <option value="regularCrust">Regular</option>
        </select>
        <label for="sauce">Pizza Sauce</label>
        <select name="sauce" id="sauce">
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="pesto">Pesto</option>
        </select>
        <label for="pizzaSize">Pizza Size</label>
        <select name="pizzaSize" id="pizzaSize">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <h3>Toppings</h3>
        <fieldset>
            <legend>Toppings:</legend>
            <input type="checkbox" id="topping1" name="toppings" value="pepperoni">
            <label for="topping1">Pepperoni</label><br>
            <input type="checkbox" id="topping2" name="toppings" value="chicken">
            <label for="topping2">Chicken</label><br>
            <input type="checkbox" id="topping3" name="toppings" value="cheese">
            <label for="topping3">Cheese</label><br>
        </fieldset>

        <label for="address">Address:</label>
        <input type="text" name="address" id="address">
        <button type="submit" id="submit">Submit</button>
    </form>

</body>
</html>
