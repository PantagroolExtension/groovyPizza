package groovypizza

class Pizza {

    String name
    static belongsTo = [pizzaFactory: PizzaFactory]
    static hasMany = [toppings: Toppings]

    static constraints = {
    }
}
