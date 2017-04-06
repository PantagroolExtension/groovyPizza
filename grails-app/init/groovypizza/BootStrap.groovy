package groovypizza

class BootStrap {

    def init = { servletContext ->
        PizzaFactory pizzaFactory = new PizzaFactory(pizzas: [])

        Pizza extravaganzza = new Pizza(name: "Extravaganzza" )
        extravaganzza.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << extravaganzza

        Pizza meatzza = new Pizza(name: "Meatzza" )
        meatzza.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << meatzza

        Pizza phillyCheeseSteak = new Pizza(name: "Philly Cheese Steak" )
        phillyCheeseSteak.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << phillyCheeseSteak

        Pizza pacificVeggie = new Pizza(name: "Pacific Veggie" )
        pacificVeggie.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << pacificVeggie

        Pizza honoluluHawaiian = new Pizza(name: "Honolulu Hawaiian" )
        honoluluHawaiian.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << honoluluHawaiian

        Pizza deluxe = new Pizza(name: "Deluxe" )
        deluxe.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << deluxe

        Pizza caliChickenBaconRanch = new Pizza(name: "Cali Chicken Bacon Ranch" )
        caliChickenBaconRanch.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << caliChickenBaconRanch

        Pizza buffaloChicken = new Pizza(name: "Buffalo Chicken" )
        buffaloChicken.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << buffaloChicken

        Pizza ultimatePepperoni = new Pizza(name: "Ultimate Pepperoni" )
        ultimatePepperoni.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << ultimatePepperoni

        Pizza memphisBBQChicken = new Pizza(name: "Memphis BBQ Chicken" )
        memphisBBQChicken.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << memphisBBQChicken

        Pizza wisconsin6Cheese = new Pizza(name: "Wisconsin 6 Cheese" )
        wisconsin6Cheese.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << wisconsin6Cheese

        Pizza spinachAndFeta = new Pizza(name: "Spinach & Feta" )
        spinachAndFeta.pizzaFactory = pizzaFactory
        pizzaFactory.pizzas << spinachAndFeta

        pizzaFactory.save()
    }

    def destroy = {
    }
}
