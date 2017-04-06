package groovypizza

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/order"(controller: "Pizza", action: "order")
        "/pizzas"(controller: "Pizza", action: "pizzas")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
