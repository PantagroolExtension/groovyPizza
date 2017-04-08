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

        // Create toppings
        Toppings bacon = new Toppings(name: "BACON", calories: 417, protein: 12.62, fat: 39.69, carbohydrate: 1.28, fiber: 0, sugar: 1, calcium: 5, iron: 0.41, magnesium: 12, potassium: 198, sodium: 662, vitaminC: 0, vitaminB6: 0.266, vitaminB12: 0.5, vitaminA: 37, vitaminE: 0.43, vitaminD: 0.4, fatSaturated: 13.296, fatMono: 17.439, fatPoly: 6.454, cholesterol: 66)
        Toppings blackOlives = new Toppings(name: "BLACK OLIVES", calories: 115, protein: 0.84, fat: 10.68, carbohydrate: 6.26, fiber: 3.2, sugar: 0, calcium: 88, iron: 3.3, magnesium: 4, potassium: 8, sodium: 735, vitaminC: 0.9, vitaminB6: 0.009, vitaminB12: 0, vitaminA: 403, vitaminE: 1.65, vitaminD: 0, fatSaturated: 1.415, fatMono: 7.888, fatPoly: 0.911, cholesterol: 0)
        Toppings pineapple = new Toppings(name: "PINEAPPLE", calories: 50, protein: 0.54, fat: 0.12, carbohydrate: 13.12, fiber: 1.4, sugar: 9.85, calcium: 13, iron: 0.29, magnesium: 12, potassium: 109, sodium: 1, vitaminC: 47.8, vitaminB6: 0.112, vitaminB12: 0, vitaminA: 58, vitaminE: 0.02, vitaminD: 0, fatSaturated: 0.009, fatMono: 0.013, fatPoly: 0.04, cholesterol: 0)
        Toppings pepperoni = new Toppings(name: "PEPPERONI", calories: 504, protein: 19.25, fat: 46.28, carbohydrate: 1.18, fiber: 0, sugar: 0, calcium: 19, iron: 1.33, magnesium: 18, potassium: 274, sodium: 1582, vitaminC: 0, vitaminB6: 0.362, vitaminB12: 1.3, vitaminA: 0, vitaminE: 1.03, vitaminD: 1.3, fatSaturated: 17.708, fatMono: 20.77, fatPoly: 4.458, cholesterol: 97)
        Toppings feta = new Toppings(name: "FETA CHEESE", calories: 264, protein: 14.21, fat: 21.28, carbohydrate: 4.09, fiber: 0, sugar: 4.09, calcium: 493, iron: 0.65, magnesium: 19, potassium: 62, sodium: 917, vitaminC: 0, vitaminB6: 0.424, vitaminB12: 1.69, vitaminA: 422, vitaminE: 0.18, vitaminD: 0.4, fatSaturated: 14.946, fatMono: 4.623, fatPoly: 0.591, cholesterol: 89)
        Toppings mozzarella = new Toppings(name: "MOZZARELLA CHEESE", calories: 254, protein: 24.26, fat: 15.92, carbohydrate: 2.77, fiber: 0, sugar: 1.13, calcium: 782, iron: 0.22, magnesium: 23, potassium: 84, sodium: 619, vitaminC: 0, vitaminB6: 0.07, vitaminB12: 0.82, vitaminA: 481, vitaminE: 0.14, vitaminD: 0.3, fatSaturated: 10.114, fatMono: 4.51, fatPoly: 0.472, cholesterol: 64)
        Toppings cheddar = new Toppings(name: "CHEDDAR CHEESE", calories: 404, protein: 22.87, fat: 33.31, carbohydrate: 3.09, fiber: 0, sugar: 0.48, calcium: 710, iron: 0.14, magnesium: 27, potassium: 76, sodium: 653, vitaminC: 0, vitaminB6: 0.066, vitaminB12: 1.1, vitaminA: 1242, vitaminE: 0.71, vitaminD: 0.6, fatSaturated: 18.867, fatMono: 9.246, fatPoly: 1.421, cholesterol: 99)
        Toppings ranchDressing = new Toppings(name: "RANCH DRESSING", calories: 430, protein: 1.32, fat: 44.54, carbohydrate: 5.9, fiber: 0, sugar: 4.69, calcium: 28, iron: 0.3, magnesium: 5, potassium: 64, sodium: 901, vitaminC: 0, vitaminB6: 0.03, vitaminB12: 0.17, vitaminA: 69, vitaminE: 2.22, vitaminD: 0.1, fatSaturated: 6.964, fatMono: 9.202, fatPoly: 25.796, cholesterol: 26)
        Toppings chicken = new Toppings(name: "CHICKEN", calories: 144, protein: 28.04, fat: 3.57, carbohydrate: 0, fiber: 0, sugar: 0, calcium: 13, iron: 0.46, magnesium: 25, potassium: 284, sodium: 328, vitaminC: 0, vitaminB6: 0.314, vitaminB12: 0.27, vitaminA: 17, vitaminE: 0.32, vitaminD: 0, fatSaturated: 0.863, fatMono: 1.444, fatPoly: 0.49, cholesterol: 86)
        Toppings bbqSauce = new Toppings(name: "BARBECUE SAUCE", calories: 172, protein: 0.82, fat: 0.63, carbohydrate: 40.77, fiber: 0.9, sugar: 33.24, calcium: 33, iron: 0.64, magnesium: 13, potassium: 232, sodium: 1027, vitaminC: 0.6, vitaminB6: 0.075, vitaminB12: 0, vitaminA: 224, vitaminE: 0.8, vitaminD: 0, fatSaturated: 0.045, fatMono: 0.082, fatPoly: 0.101, cholesterol: 0)

        bacon.save()
        blackOlives.save()
        pineapple.save()
        pepperoni.save()
        feta.save()
        mozzarella.save()
        cheddar.save()
        ranchDressing.save()
        chicken.save()
        bbqSauce.save()


    }

    def destroy = {
    }
}
